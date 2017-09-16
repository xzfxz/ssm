package com.zhao.ssm.util;

import com.zhao.ssm.bean.HealthFood;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 2017/5/4.
 */
public class HealthFoodJsoup {

    public Document connetionn(String url){
        Connection connect = null;
        connect = Jsoup.connect(url);
        Document document = null;
        try {
            document = connect.get();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return document;
    }

    /****
     *  通过分析对应的网页结构，得知 需要的数据在table标签中
     * @param document
     * @return
     */
    public List<String> getText(Document document){

        Elements table = document.getElementsByTag("table");
        Elements select = table.select("tr td");

        int size = select.size();
        List<String> list = new ArrayList<>(size);

        for(int i=0;i<size;i++){
            Element element = select.get(i);
            String text = element.text();
            if(null == text || text.isEmpty()){
                text="-";
            }
            list.add(text);
        }
        return list;

    }

    public HealthFood result2HealthFood(List<String> li){
        HealthFood healthFood = new HealthFood();
        if(null==li || li.isEmpty()){
            return null;
        }
        int size = li.size();
        if(size< 70){
            System.out.println("获取数据报错！");
            System.out.println(li);
            return null;
        }
        for (int i =0;i<size ;i++){
            String category = "国内保健食品";
            String name = li.get(2);
            String pizhunwenhao = li.get(4);
            String chanpinbianhao = li.get(6);
            String youxiaoqi = li.get(8);
            String shenqingrenchinaname = li.get(10);
            String shenqingrendizhi = li.get(12);
            String gongneng = li.get(14);
            String chnegfenhanlinag = li.get(16);
            String yuanliao = li.get(18);
            String shiyirenqun = li.get(20);
            String bushiyirenqun = li.get(22);
            String shiyongfangfa = li.get(24);
            String chanpinguige = li.get(26);
            String jishuyaoqiu = li.get(28);
            String baozhiqi = li.get(30);
            String zhucangfangfa = li.get(32);
            String zhuyishiqing = li.get(34);
            String pizhunriqi = li.get(36);
            String pizhunbiangengriqi = li.get(38);
            String biangengneirong = li.get(40);
            String beianriqi = li.get(42);
            String beianneirong = li.get(44);
            String zhuanrangfangchinaname = li.get(46);
            String zhuanrangfaforginname = li.get(48);
            String zhuanrangfadizhi = li.get(50);
            String shourangfang = li.get(52);
            String shournagfangdizhi = li.get(54);
            String zhuanrnagqipizhunwenhao = li.get(56);
            String zhuanrangfangriqi = li.get(58);
            String bufariqi = li.get(60);
            String zhuxiaoriqi = li.get(62);
            String zhuxiaoyuanyin = li.get(64);
            String beizhu = li.get(66);
            String source=li.get(70);

            healthFood.setName(name);
            healthFood.setChanpinguige(chanpinguige);
            healthFood.setChanpinhao(chanpinbianhao);
            healthFood.setChengfenhanliang(chnegfenhanlinag);
            healthFood.setChinaName(shenqingrenchinaname);
            healthFood.setGongneng(gongneng);
            healthFood.setBaozhiqi(baozhiqi);
            healthFood.setBeianneirong(beianneirong);
            healthFood.setBeianriqi(beianriqi);
            healthFood.setBiangengneirong(biangengneirong);
            healthFood.setBeizhu(beizhu);
            healthFood.setBufariqi(bufariqi);
            healthFood.setBushiyirenqun(bushiyirenqun);
            healthFood.setCategory(category);
            healthFood.setJishuyaoqiu(jishuyaoqiu);
            healthFood.setPizhunbiangengriqi(pizhunbiangengriqi);
            healthFood.setPizhunriqi(pizhunriqi);
            healthFood.setPizhunwenhao(pizhunwenhao);
            healthFood.setPizhunzhuanranriqi(zhuanrangfangriqi);
            healthFood.setShenqingrendizhi(shenqingrendizhi);
            healthFood.setShiyirenqun(shiyirenqun);
            healthFood.setShiyongfangfa(shiyongfangfa);
            healthFood.setShourangfang(shourangfang);
            healthFood.setShourangfangdizhi(shournagfangdizhi);
            healthFood.setSource(source);
            healthFood.setYouxiaoqi(youxiaoqi);
            healthFood.setYuanliao(yuanliao);
            healthFood.setZhuanfangfadizhi(zhuanrangfadizhi);
            healthFood.setZhuanrangfaChinaName(zhuanrangfangchinaname);
            healthFood.setZhuanrangfaForeignName(zhuanrangfaforginname);
            healthFood.setZhuanrangqianpizhunwenhao(zhuanrnagqipizhunwenhao);
            healthFood.setZhucangfangfa(zhucangfangfa);
            healthFood.setZhuxiaoriqi(zhuxiaoriqi);
            healthFood.setZhuxiaoyuanyin(zhuxiaoyuanyin);
            healthFood.setZhuyishiqing(zhuyishiqing);


        }

        return healthFood;
    }



    public static void main(String[] args) {
        HealthFoodJsoup healthFoodJsoup = new HealthFoodJsoup();
        String url="http://qy1.sfda.gov.cn/datasearch/face3/content.jsp?tableId=30&tableName=TABLE30&tableView=%B9%FA%B2%FA%B1%A3%BD%A1%CA%B3%C6%B7&Id=96";
        Document connetionn = healthFoodJsoup.connetionn(url);
        List<String> text = healthFoodJsoup.getText(connetionn);
        HealthFood healthFood = healthFoodJsoup.result2HealthFood(text);
        System.out.println(healthFood);
    }

}
