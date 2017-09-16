package com.zhao.ssm.service;

import com.alibaba.fastjson.JSON;
import com.zhao.ssm.bean.HealthFood;
import com.zhao.ssm.bean.Page;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.canedata.core.util.StringUtils;
import org.canedata.entity.Entity;
import org.canedata.entity.EntityFactory;
import org.canedata.expression.shield.ExpressionA;
import org.canedata.field.Fields;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 2017/5/10.
 */
public class HealthFoodServiceImpl implements HealthFoodService {

    Logger logger =Logger.getLogger(HealthFoodServiceImpl.class);

    private EntityFactory entityFactory;

    public EntityFactory getEntityFactory() {
        return entityFactory;
    }

    public void setEntityFactory(EntityFactory entityFactory) {
        this.entityFactory = entityFactory;
    }

    @Override
    public void saveHealthFood(HealthFood healthFood) {
        if(null ==healthFood){
            return;
        }
        Entity entity = entityFactory.get(HealthFood.Meta.TABLENAME);
        entity.put(HealthFood.Meta.BAOZHIQI,healthFood.getBaozhiqi());
        entity.put(HealthFood.Meta.BEIANNEIRONG,healthFood.getBeianneirong());
        entity.put(HealthFood.Meta.BEIANRIQI,healthFood.getBeianriqi());
        entity.put(HealthFood.Meta.BEIZHU,healthFood.getBeizhu());
        entity.put(HealthFood.Meta.BIANGENGNEIRONG,healthFood.getBiangengneirong());
        entity.put(HealthFood.Meta.BUFARIQI,healthFood.getBufariqi());
        entity.put(HealthFood.Meta.BUSHIYIRENQUN,healthFood.getBushiyirenqun());
        entity.put(HealthFood.Meta.CHANPINGUIGE,healthFood.getChanpinguige());
        entity.put(HealthFood.Meta.CHANPINHAO,healthFood.getChanpinhao());
        entity.put(HealthFood.Meta.CHENGFENHANLIANG,healthFood.getChengfenhanliang());
        entity.put(HealthFood.Meta.CHINANAME,healthFood.getChinaName());
        entity.put(HealthFood.Meta.CATEGORY,healthFood.getCategory());
        entity.put(HealthFood.Meta.GONGNENG,healthFood.getGongneng());
        entity.put(HealthFood.Meta.JISHUYAOQIU,healthFood.getJishuyaoqiu());
        entity.put(HealthFood.Meta.NAME,healthFood.getName());
        entity.put(HealthFood.Meta.PIZHUNBIANGENGRIQI,healthFood.getPizhunbiangengriqi());
        entity.put(HealthFood.Meta.PIZHUNRIQI,healthFood.getPizhunriqi());
        entity.put(HealthFood.Meta.PIZHUNWENHAO,healthFood.getPizhunwenhao());
        entity.put(HealthFood.Meta.PIZHUNZHUANRANRIQI,healthFood.getPizhunzhuanranriqi());
        entity.put(HealthFood.Meta.SHENQINGRENDIZHI,healthFood.getShenqingrendizhi());
        entity.put(HealthFood.Meta.SHIYIRENQUN,healthFood.getShiyirenqun());
        entity.put(HealthFood.Meta.SHIYONGFANGFA,healthFood.getShiyongfangfa());
        entity.put(HealthFood.Meta.SHOURANGFANG,healthFood.getShourangfang());
        entity.put(HealthFood.Meta.SHOURANGFANGDIZHI,healthFood.getShourangfangdizhi());
        entity.put(HealthFood.Meta.SOURCE,healthFood.getSource());
        entity.put(HealthFood.Meta.YOUXIAOQI,healthFood.getYouxiaoqi());
        entity.put(HealthFood.Meta.YUANLIAO,healthFood.getYuanliao());
        entity.put(HealthFood.Meta.ZHUANFANGFADIZHI,healthFood.getZhuanfangfadizhi());
        entity.put(HealthFood.Meta.ZHUANRANGFACHINANAME,healthFood.getZhuanrangfaChinaName());
        entity.put(HealthFood.Meta.ZHUANRANGFAFOREIGNNAME,healthFood.getZhuanrangfaForeignName());
        entity.put(HealthFood.Meta.ZHUANRANGQIANPIZHUNWENHAO,healthFood.getZhuanrangqianpizhunwenhao());
        entity.put(HealthFood.Meta.ZHUCANGFANGFA,healthFood.getZhucangfangfa());
        entity.put(HealthFood.Meta.ZHUXIAORIQI,healthFood.getZhuxiaoriqi());
        entity.put(HealthFood.Meta.ZHUXIAOYUANYIN,healthFood.getZhuxiaoyuanyin());
        entity.put(HealthFood.Meta.ZHUYISHIQING,healthFood.getZhuyishiqing());
//        35
        String id = healthFood.getId();
//      保证不重新采集，以产品号作为一个唯一约束

        ExpressionA expressionA = entity.expr().isNotEmpty("_id");
        expressionA.and().equals(HealthFood.Meta.CHANPINHAO, healthFood.getChanpinhao());
        List<Fields> list = entity.filter(expressionA).list();
        if(null!=list && !list.isEmpty()){
            logger.info("已经采集:{}"+ JSON.toJSONString(healthFood));
            return;
        }

        if(StringUtils.isBlank(id)){
            Fields fields = entity.create();
            id = fields.getString("_id");
            healthFood.setId(id);
        }else {
            entity.update(new ObjectId(id));
        }
        if (null != entity && !entity.hasClosed()) {
            entity.close();
        }

    }

//    唯一定位Healthfood的标识 id 或者 编号
    @Override
    public HealthFood getByConditon(String id,String chanpinhao) {
//        String id = healthFood.getId();

        Entity entity = entityFactory.get(HealthFood.Meta.TABLENAME);
        ExpressionA expr = entity.expr().isNotEmpty("_id");
        HealthFood result=null;
        if(StringUtils.isNotBlank(id)){
            Fields fields = entity.restore(new ObjectId(id));
            result = this.organizedHealthFood(fields);
        }

        if (null != entity && !entity.hasClosed()) {
            entity.close();
        }

        if(null!=result){
            return result;
        }
        if(null!=chanpinhao){
            expr.and().equals(HealthFood.Meta.CHANPINHAO, chanpinhao);
            List<Fields> list = entity.filter(expr).list();
            result = this.get(list);
        }
        if(null!=result){
            return result;
        }

        return null;
    }

    @Override
    public Page listByCondition(String pizhunwenhao,String name,String shiyirenqun,String gongneng,String yuanliao,int pageNum,int paseSize) {
        Page page = new Page();
        Entity entity = entityFactory.get(HealthFood.Meta.TABLENAME);
        ExpressionA expa = entity.expr().isNotEmpty("_id");

        if(StringUtils.isNotBlank(pizhunwenhao)){
            expa.and().match(HealthFood.Meta.PIZHUNWENHAO,".*"+pizhunwenhao+".*");
        }

        if(StringUtils.isNotBlank(name)){
            expa.and().match(HealthFood.Meta.NAME,".*"+name+".*");
        }

        if(StringUtils.isNotBlank(shiyirenqun)){
            expa.and().match(HealthFood.Meta.SHIYIRENQUN,".*"+shiyirenqun+".*");
        }

        if(StringUtils.isNotBlank(gongneng)){
            expa.and().match(HealthFood.Meta.GONGNENG,".*"+gongneng+".*");
        }


        if(StringUtils.isNotBlank(yuanliao)){
            expa.and().match(HealthFood.Meta.YUANLIAO,".*"+yuanliao+".*");
        }


        int count = entity.filter(expa).opt(org.canedata.provider.mongodb.entity.Options.RETAIN, true).count().intValue();
//
        page.setTotal(count);
        List<Fields> list = entity.filter(expa).orderDESC(HealthFood.Meta.NAME).list(pageNum, paseSize);

        List<HealthFood> li=null;
        if(null!=list && !list.isEmpty()){
            li = new ArrayList<>(list.size());
            for(Fields fields :list){
                HealthFood healthFood = this.organizedHealthFood(fields);
                li.add(healthFood);
            }
        }
        page.setPageNum(pageNum+1);
        page.setPageSize(paseSize);
        page.setData(li);

        if (null != entity && !entity.hasClosed()) {
            entity.close();
        }

        return page;
    }

    public HealthFood getByProductNumber(String condition){
        if(null ==condition){
            return null;
        }
        Entity entity = entityFactory.get(HealthFood.Meta.TABLENAME);
        ExpressionA expra = entity.expr().isNotEmpty("_id");
        expra.and().equals(HealthFood.Meta.CHANPINHAO, condition);
        List<Fields> list = entity.filter(expra).list();

        if (null != entity && !entity.hasClosed()) {
            entity.close();
        }

        return this.get(list);
    }

    private HealthFood get(List<Fields> list){

        if(null!=list && !list.isEmpty()){
            for(Fields fields :list){
                HealthFood healthFood = this.organizedHealthFood(fields);
                return healthFood;
            }
        }
        return null;
    }

    public HealthFood organizedHealthFood(Fields fields){
        if(null == fields){
            return null;
        }
        String id = fields.getString("_id");
        String baozhiqi = fields.getString(HealthFood.Meta.BAOZHIQI);
        String beianneirong = fields.getString(HealthFood.Meta.BEIANNEIRONG);
        String beianriqi = fields.getString(HealthFood.Meta.BEIANRIQI);
        String beizhu = fields.getString(HealthFood.Meta.BEIZHU);
        String biangengneirong = fields.getString(HealthFood.Meta.BIANGENGNEIRONG);
        String bufariqi = fields.getString(HealthFood.Meta.BUFARIQI);
        String bushiyirenqun = fields.getString(HealthFood.Meta.BUSHIYIRENQUN);
        String category = fields.getString(HealthFood.Meta.CATEGORY);
        String chanpingguige = fields.getString(HealthFood.Meta.CHANPINGUIGE);
        String chanpinhao = fields.getString(HealthFood.Meta.CHANPINHAO);
        String chengfenhuanliang = fields.getString(HealthFood.Meta.CHENGFENHANLIANG);
        String chinaname = fields.getString(HealthFood.Meta.CHINANAME);
        String gongneng = fields.getString(HealthFood.Meta.GONGNENG);
        String jishuyaoqiu = fields.getString(HealthFood.Meta.JISHUYAOQIU);
        String name = fields.getString(HealthFood.Meta.NAME);
        String pizhunbiangengriqi = fields.getString(HealthFood.Meta.PIZHUNBIANGENGRIQI);
        String pizhunriqi = fields.getString(HealthFood.Meta.PIZHUNRIQI);
        String pizhunwenhao = fields.getString(HealthFood.Meta.PIZHUNWENHAO);
        String pizhunzhuanrangriqi = fields.getString(HealthFood.Meta.PIZHUNZHUANRANRIQI);
        String shenqingrendizhi = fields.getString(HealthFood.Meta.SHENQINGRENDIZHI);
        String shiyirenqun = fields.getString(HealthFood.Meta.SHIYIRENQUN);
        String shiyongfangfa = fields.getString(HealthFood.Meta.SHIYONGFANGFA);
        String shourangfang = fields.getString(HealthFood.Meta.SHOURANGFANG);
        String shournagfangdizhi = fields.getString(HealthFood.Meta.SHOURANGFANGDIZHI);
        String source = fields.getString(HealthFood.Meta.SOURCE);
        String youxiaoqi = fields.getString(HealthFood.Meta.YOUXIAOQI);
        String yuanliao = fields.getString(HealthFood.Meta.YUANLIAO);
        String zhuanfangfadizhi = fields.getString(HealthFood.Meta.ZHUANFANGFADIZHI);
        String zhuanrangfachinaname = fields.getString(HealthFood.Meta.ZHUANRANGFACHINANAME);
        String zhuanrangfaforignname = fields.getString(HealthFood.Meta.ZHUANRANGFAFOREIGNNAME);
        String zhuanrangqianpizhunwenhao = fields.getString(HealthFood.Meta.ZHUANRANGQIANPIZHUNWENHAO);
        String zhucangfangfa = fields.getString(HealthFood.Meta.ZHUCANGFANGFA);
        String zhuxiaoriqi = fields.getString(HealthFood.Meta.ZHUXIAORIQI);
        String zhuxiaoyuanyin = fields.getString(HealthFood.Meta.ZHUXIAOYUANYIN);
        String zhuyishiqing = fields.getString(HealthFood.Meta.ZHUYISHIQING);
//        fields.getString(HealthFood.Meta.)

        HealthFood healthFood = new HealthFood();


        healthFood.setId(id);
        healthFood.setName(name);
        healthFood.setChanpinguige(chanpingguige);
        healthFood.setChanpinhao(chanpinhao);
        healthFood.setChengfenhanliang(chengfenhuanliang);
        healthFood.setChinaName(chinaname);
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
        healthFood.setPizhunzhuanranriqi(pizhunzhuanrangriqi);
        healthFood.setShenqingrendizhi(shenqingrendizhi);
        healthFood.setShiyirenqun(shiyirenqun);
        healthFood.setShiyongfangfa(shiyongfangfa);
        healthFood.setShourangfang(shourangfang);
        healthFood.setShourangfangdizhi(shournagfangdizhi);
        healthFood.setSource(source);
        healthFood.setYouxiaoqi(youxiaoqi);
        healthFood.setYuanliao(yuanliao);
        healthFood.setZhuanfangfadizhi(zhuanfangfadizhi);
        healthFood.setZhuanrangfaChinaName(zhuanrangfachinaname);
        healthFood.setZhuanrangfaForeignName(zhuanrangfaforignname);
        healthFood.setZhuanrangqianpizhunwenhao(zhuanrangqianpizhunwenhao);
        healthFood.setZhucangfangfa(zhucangfangfa);
        healthFood.setZhuxiaoriqi(zhuxiaoriqi);
        healthFood.setZhuxiaoyuanyin(zhuxiaoyuanyin);
        healthFood.setZhuyishiqing(zhuyishiqing);

        return healthFood;
    }

}
