package com.zhao.ssm.controller;

import com.zhao.ssm.task.HealthFoodTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhao on 2017/3/29.
 */
@Controller
public class Home {
    @Autowired
    private HealthFoodTask healthFoodTask;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        request.setAttribute("persons",new String("jerry"));

        return "redirect:/health/search ";
    }

    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String healthList(HttpServletRequest request){

//        return "health/search";
        return "redirect:/health/search ";
    }

    @RequestMapping(value = "/dowork",method = RequestMethod.GET)
    public void dowork(HttpServletRequest request){
        String user = request.getParameter("user");
        String token = request.getParameter("token");
        if(null!=user && null!=token){
            if("zhao".equals(user) && "zhao".equals(token)){
                healthFoodTask.dowork();
            }
        }
    }

}
