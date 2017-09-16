package com.zhao.ssm.bean;

import java.io.Serializable;

/**
 * Created by zhao on 2017/5/8.
 */
public class HealthFood implements Serializable{

    private static final long serialVersionUID = -4600793433932487270L;
//记录表示
    private String id;
//    类别 国内保健食品
    private String category;
//    名称
    private String name;
//    批准文号
    private String pizhunwenhao;
//    产品号
    private String chanpinhao;
//    有效期
    private String youxiaoqi;
//    申请方中国名称
    private String chinaName;
//    申请方地址
    private String shenqingrendizhi;
//    功能
    private String gongneng;
//    成分含量
    private String chengfenhanliang;
//    原料
    private String yuanliao;
//    适宜人群
    private String shiyirenqun;
//    不适宜人群
    private String bushiyirenqun;
//    使用方法
    private String shiyongfangfa;
//    产品规格
    private String chanpinguige;
//    技术要求
    private String jishuyaoqiu;
//    保质期
    private String baozhiqi;
//    贮藏方法
    private String zhucangfangfa;
//    注意事项
    private String zhuyishiqing;
//    批准日期
    private String pizhunriqi;
//    批准变更日志
    private String pizhunbiangengriqi;
//    变更内容
    private String biangengneirong;
//    备案日期
    private String beianriqi;
//    备案内容
    private String beianneirong;
//    转让方中文名
    private String zhuanrangfaChinaName;
//    转让发外国名
    private String zhuanrangfaForeignName;
//    转让方地址
    private String zhuanfangfadizhi;
//    受让方
    private String shourangfang;
//    受让方地址
    private String shourangfangdizhi;
//    转让前批准文号
    private String zhuanrangqianpizhunwenhao;
//    批准转让日期
    private String pizhunzhuanranriqi;
//    补发日期
    private String bufariqi;
//    注销日期
    private String zhuxiaoriqi;
//    注销原因
    private String zhuxiaoyuanyin;
//    备注
    private String beizhu;
//    信息来源
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPizhunwenhao() {
        return pizhunwenhao;
    }

    public void setPizhunwenhao(String pizhunwenhao) {
        this.pizhunwenhao = pizhunwenhao;
    }

    public String getChanpinhao() {
        return chanpinhao;
    }

    public void setChanpinhao(String chanpinhao) {
        this.chanpinhao = chanpinhao;
    }

    public String getYouxiaoqi() {
        return youxiaoqi;
    }

    public void setYouxiaoqi(String youxiaoqi) {
        this.youxiaoqi = youxiaoqi;
    }

    public String getChinaName() {
        return chinaName;
    }

    public void setChinaName(String chinaName) {
        this.chinaName = chinaName;
    }

    public String getShenqingrendizhi() {
        return shenqingrendizhi;
    }

    public void setShenqingrendizhi(String shenqingrendizhi) {
        this.shenqingrendizhi = shenqingrendizhi;
    }

    public String getGongneng() {
        return gongneng;
    }

    public void setGongneng(String gongneng) {
        this.gongneng = gongneng;
    }

    public String getChengfenhanliang() {
        return chengfenhanliang;
    }

    public void setChengfenhanliang(String chengfenhanliang) {
        this.chengfenhanliang = chengfenhanliang;
    }

    public String getYuanliao() {
        return yuanliao;
    }

    public void setYuanliao(String yuanliao) {
        this.yuanliao = yuanliao;
    }

    public String getShiyirenqun() {
        return shiyirenqun;
    }

    public void setShiyirenqun(String shiyirenqun) {
        this.shiyirenqun = shiyirenqun;
    }

    public String getBushiyirenqun() {
        return bushiyirenqun;
    }

    public void setBushiyirenqun(String bushiyirenqun) {
        this.bushiyirenqun = bushiyirenqun;
    }

    public String getShiyongfangfa() {
        return shiyongfangfa;
    }

    public void setShiyongfangfa(String shiyongfangfa) {
        this.shiyongfangfa = shiyongfangfa;
    }

    public String getChanpinguige() {
        return chanpinguige;
    }

    public void setChanpinguige(String chanpinguige) {
        this.chanpinguige = chanpinguige;
    }

    public String getJishuyaoqiu() {
        return jishuyaoqiu;
    }

    public void setJishuyaoqiu(String jishuyaoqiu) {
        this.jishuyaoqiu = jishuyaoqiu;
    }

    public String getBaozhiqi() {
        return baozhiqi;
    }

    public void setBaozhiqi(String baozhiqi) {
        this.baozhiqi = baozhiqi;
    }

    public String getZhucangfangfa() {
        return zhucangfangfa;
    }

    public void setZhucangfangfa(String zhucangfangfa) {
        this.zhucangfangfa = zhucangfangfa;
    }

    public String getZhuyishiqing() {
        return zhuyishiqing;
    }

    public void setZhuyishiqing(String zhuyishiqing) {
        this.zhuyishiqing = zhuyishiqing;
    }

    public String getPizhunriqi() {
        return pizhunriqi;
    }

    public void setPizhunriqi(String pizhunriqi) {
        this.pizhunriqi = pizhunriqi;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBeianriqi() {
        return beianriqi;
    }

    public void setBeianriqi(String beianriqi) {
        this.beianriqi = beianriqi;
    }

    public String getBeianneirong() {
        return beianneirong;
    }

    public String getPizhunbiangengriqi() {
        return pizhunbiangengriqi;
    }

    public void setPizhunbiangengriqi(String pizhunbiangengriqi) {
        this.pizhunbiangengriqi = pizhunbiangengriqi;
    }

    public String getBiangengneirong() {
        return biangengneirong;
    }

    public void setBiangengneirong(String biangengneirong) {
        this.biangengneirong = biangengneirong;
    }

    public void setBeianneirong(String beianneirong) {
        this.beianneirong = beianneirong;
    }

    public String getZhuanrangfaChinaName() {
        return zhuanrangfaChinaName;
    }

    public void setZhuanrangfaChinaName(String zhuanrangfaChinaName) {
        this.zhuanrangfaChinaName = zhuanrangfaChinaName;
    }

    public String getZhuanrangfaForeignName() {
        return zhuanrangfaForeignName;
    }

    public void setZhuanrangfaForeignName(String zhuanrangfaForeignName) {
        this.zhuanrangfaForeignName = zhuanrangfaForeignName;
    }

    public String getZhuanfangfadizhi() {
        return zhuanfangfadizhi;
    }

    public void setZhuanfangfadizhi(String zhuanfangfadizhi) {
        this.zhuanfangfadizhi = zhuanfangfadizhi;
    }

    public String getShourangfang() {
        return shourangfang;
    }

    public void setShourangfang(String shourangfang) {
        this.shourangfang = shourangfang;
    }

    public String getShourangfangdizhi() {
        return shourangfangdizhi;
    }

    public void setShourangfangdizhi(String shourangfangdizhi) {
        this.shourangfangdizhi = shourangfangdizhi;
    }

    public String getZhuanrangqianpizhunwenhao() {
        return zhuanrangqianpizhunwenhao;
    }

    public void setZhuanrangqianpizhunwenhao(String zhuanrangqianpizhunwenhao) {
        this.zhuanrangqianpizhunwenhao = zhuanrangqianpizhunwenhao;
    }

    public String getPizhunzhuanranriqi() {
        return pizhunzhuanranriqi;
    }

    public void setPizhunzhuanranriqi(String pizhunzhuanranriqi) {
        this.pizhunzhuanranriqi = pizhunzhuanranriqi;
    }

    public String getBufariqi() {
        return bufariqi;
    }

    public void setBufariqi(String bufariqi) {
        this.bufariqi = bufariqi;
    }

    public String getZhuxiaoriqi() {
        return zhuxiaoriqi;
    }

    public void setZhuxiaoriqi(String zhuxiaoriqi) {
        this.zhuxiaoriqi = zhuxiaoriqi;
    }

    public String getZhuxiaoyuanyin() {
        return zhuxiaoyuanyin;
    }

    public void setZhuxiaoyuanyin(String zhuxiaoyuanyin) {
        this.zhuxiaoyuanyin = zhuxiaoyuanyin;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "HealthFood{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", pizhunwenhao='" + pizhunwenhao + '\'' +
                ", chanpinhao='" + chanpinhao + '\'' +
                ", youxiaoqi='" + youxiaoqi + '\'' +
                ", chinaName='" + chinaName + '\'' +
                ", shenqingrendizhi='" + shenqingrendizhi + '\'' +
                ", gongneng='" + gongneng + '\'' +
                ", chengfenhanliang='" + chengfenhanliang + '\'' +
                ", yuanliao='" + yuanliao + '\'' +
                ", shiyirenqun='" + shiyirenqun + '\'' +
                ", bushiyirenqun='" + bushiyirenqun + '\'' +
                ", shiyongfangfa='" + shiyongfangfa + '\'' +
                ", chanpinguige='" + chanpinguige + '\'' +
                ", jishuyaoqiu='" + jishuyaoqiu + '\'' +
                ", baozhiqi='" + baozhiqi + '\'' +
                ", zhucangfangfa='" + zhucangfangfa + '\'' +
                ", zhuyishiqing='" + zhuyishiqing + '\'' +
                ", pizhunriqi='" + pizhunriqi + '\'' +
                ", pizhunbiangengriqi='" + pizhunbiangengriqi + '\'' +
                ", biangengneirong='" + biangengneirong + '\'' +
                ", beianriqi='" + beianriqi + '\'' +
                ", beianneirong='" + beianneirong + '\'' +
                ", zhuanrangfaChinaName='" + zhuanrangfaChinaName + '\'' +
                ", zhuanrangfaForeignName='" + zhuanrangfaForeignName + '\'' +
                ", zhuanfangfadizhi='" + zhuanfangfadizhi + '\'' +
                ", shourangfang='" + shourangfang + '\'' +
                ", shourangfangdizhi='" + shourangfangdizhi + '\'' +
                ", zhuanrangqianpizhunwenhao='" + zhuanrangqianpizhunwenhao + '\'' +
                ", pizhunzhuanranriqi='" + pizhunzhuanranriqi + '\'' +
                ", bufariqi='" + bufariqi + '\'' +
                ", zhuxiaoriqi='" + zhuxiaoriqi + '\'' +
                ", zhuxiaoyuanyin='" + zhuxiaoyuanyin + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    public static class Meta {
        public static final String TABLENAME = "health_food";
        public static final String ID = "id";
        public static final  String NAME = "name";
        public static final String CATEGORY ="category";
        public static final  String PIZHUNWENHAO = "pizhunwenhao";
        public static final  String CHANPINHAO = "chanpinhao";
        public static final  String YOUXIAOQI = "youxiaoqi";
        public static final  String CHINANAME = "chinaName";
        public static final  String SHENQINGRENDIZHI = "shengingrendizhi";
        public static final  String GONGNENG = "gongneng";
        public static final  String CHENGFENHANLIANG = "chengfenhanliang";
        public static final  String YUANLIAO = "yuanliao";
        public static final  String SHIYIRENQUN = "shiyirenqun";
        public static final  String BUSHIYIRENQUN = "bushiyirenqun";
        public static final  String SHIYONGFANGFA = "shiyongfangfa";
        public static final  String CHANPINGUIGE = "chanpinguige";
        public static final  String JISHUYAOQIU = "jishuyaoqiu";
        public static final  String BAOZHIQI = "baozhiqi";
        public static final  String ZHUCANGFANGFA = "zhucangfangfa";
        public static final  String ZHUYISHIQING = "zhuyishiqing";
        public static final  String PIZHUNRIQI = "pizhuriqi";
        public static final  String PIZHUNBIANGENGRIQI = "pizhunbiangengriqi";
        public static final  String BIANGENGNEIRONG = "biangengneirong";
        public static final  String BEIANRIQI = "beianriqi";
        public static final  String BEIANNEIRONG = "beianneirong";
        public static final  String ZHUANRANGFACHINANAME = "zhuanrangfaChinaName";
        public static final  String ZHUANRANGFAFOREIGNNAME = "zhuanrangfaForeignName";
        public static final  String ZHUANFANGFADIZHI = "zhuanfangfadizhi";
        public static final  String SHOURANGFANG = "shourangfang";
        public static final  String SHOURANGFANGDIZHI = "shourangfangdizhi";
        public static final  String ZHUANRANGQIANPIZHUNWENHAO = "zhuanrangqianpizhunwenhao";
        public static final  String PIZHUNZHUANRANRIQI = "pizhunzhuanranriqi";
        public static final  String BUFARIQI = "bufariqi";
        public static final  String ZHUXIAORIQI = "zhuxiaoriqi";
        public static final  String ZHUXIAOYUANYIN = "zhuxiaoyuanyin";
        public static final  String BEIZHU = "beizhu";
        public static final  String SOURCE = "source";

    }
}
