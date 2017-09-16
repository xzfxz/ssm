package com.zhao.ssm.task;

import com.zhao.ssm.bean.HealthFood;
import com.zhao.ssm.service.HealthFoodService;
import com.zhao.ssm.util.HealthFoodJsoup;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by zhao on 2017/5/14.
 */
@Service
public class HealthFoodTask implements Callable<Integer> {

    Logger logger =Logger.getLogger(HealthFoodTask.class);

    private HealthFoodJsoup healthFoodJsoup = new HealthFoodJsoup();
    private String url ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Autowired
    private HealthFoodService healthFoodService;

    @Override
    public Integer call() throws Exception {
        this.dowork();
        return 0;
    }

    public void dowork(){
        HealthFoodJsoup healthFoodJsoup = new HealthFoodJsoup();
        int sum = 18000;
        for(int i = 1;i <=sum;i++){
            String url="http://qy1.sfda.gov.cn/datasearch/face3/content.jsp?tableId=30&tableName=TABLE30&tableView=%B9%FA%B2%FA%B1%A3%BD%A1%CA%B3%C6%B7&Id="+i;
            Document connetionn = null;
            List<String> text =null;
            try {
                connetionn = healthFoodJsoup.connetionn(url);
                text = healthFoodJsoup.getText(connetionn);
                HealthFood healthFood = healthFoodJsoup.result2HealthFood(text);
                healthFoodService.saveHealthFood(healthFood);
                Thread.sleep(1000);
            }catch (Exception e){
                logger.error("errorUrl:{},Exception:{}"+url+e);
                continue;
            }

        }
    }
}
