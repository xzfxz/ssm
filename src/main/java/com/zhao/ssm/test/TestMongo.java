package com.zhao.ssm.test;

import com.zhao.ssm.bean.HealthFood;
import com.zhao.ssm.bean.Page;
import com.zhao.ssm.service.HealthFoodService;
import com.zhao.ssm.util.HealthFoodJsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhao on 2017/5/14.
 */
public class TestMongo {



    @Test
    public void testHealthfoodSave1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        HealthFoodService healthFoodService = (HealthFoodService) context.getBean("healthFoodService");
        HealthFoodJsoup healthFoodJsoup = new HealthFoodJsoup();
        int i = 1600;
        String url="http://qy1.sfda.gov.cn/datasearch/face3/content.jsp?tableId=30&tableName=TABLE30&tableView=%B9%FA%B2%FA%B1%A3%BD%A1%CA%B3%C6%B7&Id="+i;
        Document connetionn = null;
        List<String> text =null;
        try {
            connetionn = healthFoodJsoup.connetionn(url);
            System.out.println("");
            text = healthFoodJsoup.getText(connetionn);
            HealthFood healthFood = healthFoodJsoup.result2HealthFood(text);
            healthFoodService.saveHealthFood(healthFood);
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("error num"+i);
            System.out.println(text);
            e.printStackTrace();

    }
    }

    @Test
    public void testHealthfoodSave(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        HealthFoodService healthFoodService = (HealthFoodService) context.getBean("healthFoodService");
        HealthFoodJsoup healthFoodJsoup = new HealthFoodJsoup();
        int sum = 20000;
        for(int i = 1;i <=sum;i++){
            String url="http://qy1.sfda.gov.cn/datasearch/face3/content.jsp?tableId=30&tableName=TABLE30&tableView=%B9%FA%B2%FA%B1%A3%BD%A1%CA%B3%C6%B7&Id="+i;
            Document connetionn = null;
            List<String> text =null;
            try {
               connetionn = healthFoodJsoup.connetionn(url);
               text = healthFoodJsoup.getText(connetionn);
                System.out.println("");
                HealthFood healthFood = healthFoodJsoup.result2HealthFood(text);
                healthFoodService.saveHealthFood(healthFood);
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println("error num"+i);
                System.out.println(text);
                e.printStackTrace();
                continue;
            }
        }
    }

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        HealthFoodService healthFoodService = (HealthFoodService) context.getBean("healthFoodService");
//        HealthFood byProductNumber = healthFoodService.getByProductNumber("1");
//        System.out.println(byProductNumber);
        Page page = healthFoodService.listByCondition("","", "人", "","", 0, 10);
        System.out.println(page);
    }
    @Test
    public void test00(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        String put = stringStringHashMap.put("222", "11");
        String s = stringStringHashMap.get("222");
        String s1 = stringStringHashMap.get("111");
        System.out.println(s1+":"+s);
    }

}
