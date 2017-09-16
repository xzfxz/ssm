package com.zhao.ssm.controller;

import com.zhao.ssm.bean.HealthFood;
import com.zhao.ssm.bean.Page;
import com.zhao.ssm.service.HealthFoodService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhao on 17-6-21.
 */
@Controller
@RequestMapping(value = "/health")
public class HealthFoodAction {

    @Autowired
    private HealthFoodService healthFoodService;

    Logger logger = Logger.getLogger(HealthFood.class);

    @RequestMapping(value = "/search")
    public String dosearch(HttpServletRequest request){
//        logger.info("start...");
        String result="page/list";

        String pizhunwenhao = request.getParameter("pizhunwenhao");
        String name = request.getParameter("name");
        String gongneng = request.getParameter("gongneng");
        String shiyirenqun = request.getParameter("shiyirenqun");

        String pageNum = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");

        int pageNum_i=0;
        if(null!=pageNum && !pageNum.trim().equals("")){
            try {
                pageNum_i = Integer.parseInt(pageNum);
            }catch (Exception e){

            }

        }
        int pageSize_i=5;
        if(null!=pageSize && !pageSize.trim().equals("")){
            try {
                pageSize_i = Integer.parseInt(pageSize);
            }catch (Exception e){

            }

        }

        Page page = healthFoodService.listByCondition(pizhunwenhao, name, shiyirenqun, gongneng, "", pageNum_i -1, pageSize_i);
        request.setAttribute("zpage",page);
        request.setAttribute("pageSize",page.getPageNum());
        request.setAttribute("pageNum",page.getPageSize());
        return result;
    }
    @RequestMapping(value = "/detail/{oid}")
    public String detail(HttpServletRequest request, @PathVariable("oid") String oid){
        String result="page/detail";
        HealthFood healthFood=null;
        if(null==oid || "".equals(oid.trim())){
            return result;
        }else{
             healthFood = healthFoodService.getByConditon(oid, "");
        }
        request.setAttribute("data",healthFood);
        return result;
    }
}
