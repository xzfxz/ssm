package com.zhao.ssm.service;


import com.zhao.ssm.bean.HealthFood;
import com.zhao.ssm.bean.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by zhao on 2017/5/9.
 */
public interface HealthFoodService {

    void saveHealthFood(HealthFood healthFood);

    HealthFood getByConditon(String id,String chanpinhao);

    Page listByCondition(String pizhunwenhao,String name,String shiyirenqun,String gongneng,String yuanliao,int pageNum,int paseSize);

    HealthFood getByProductNumber(String condition);
}
