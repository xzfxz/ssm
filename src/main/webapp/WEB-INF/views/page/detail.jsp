<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${path}/static/css/bootstrap.3.3.7.min.css" rel="stylesheet">

    <title>保健食品官方查询结果</title>
    <!-- jQuery -->
    <script src="${path}/static/js/jquery.min.2.2.4.js"></script>
    <!-- Bootstrap -->
    <script src="${path}/static/js/bootstrap.3.3.6.min.js"></script>
</head>

<body class="container">
    <div class="row">
        <h2 class="col-md-12">保健食品官方查询结果</h2>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-12">
        <%--<label type="label" class="btn btn-primary" id="su" onclick="sub()">保存</label>--%>
        <label type="label" style="width: 54px;" class="btn btn-primary" onclick="goback()">返回</label>
        </div>
    </div>
    <br>
    <hr>

    <div class="row">
        <h4 style="text-align: center" class="col-md-12" >基本信息</h4>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">商品名称</label>
                </div>
                <input type="text" class="form-control" value="${data.name}" name="name" >
            </div>
        </div>
    </div>
    <div class="row">
    <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">批准文号</label>
                </div>
                <input type="text" class="form-control" value="${data.pizhunwenhao}" name="pizhunwenhao" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">批文有效期</label>
                </div>
                <input type="text" class="form-control" value="${data.youxiaoqi}" name="youxiaoqi" >
            </div>
        </div>
    </div>

    <hr>

    <div class="row">
        <h4 style="text-align: center" class="col-md-12">其他信息</h4>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">申请人中文名称</label>
                </div>
                <input type="text" class="form-control" value="${data.chinaName}" name="chinaName" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">申请方地址</label>
                </div>
                <input type="text" class="form-control" value="${data.shenqingrendizhi}" name="shenqingrendizhi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        功能
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.gongneng}" name="gongneng" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        成分含量
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.chengfenhanliang}" name="chengfenhanliang" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        原料
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.yuanliao}" name="yuanliao" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">适宜人群</label>
                </div>
                <input type="text"  class="form-control" value="${data.shiyirenqun}" name="shiyirenqun">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        不适宜人群
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.bushiyirenqun}" name="bushiyirenqun" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">使用方法</label>
                </div>
                <input type="text" class="form-control" value="${data.shiyongfangfa}" name="shiyongfangfa" >
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        产品规格
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.chanpinguige}" name="chanpinguige" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">技术要求</label>
                </div>
                <input type="text" class="form-control" value="${data.jishuyaoqiu}" name="jishuyaoqiu" >
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        保质期
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.baozhiqi}" name="baozhiqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">贮藏方法</label>
                </div>
                <input type="text" class="form-control" value="${data.zhucangfangfa}" name="zhucangfangfa" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        注意事项
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.zhuyishiqing}" name="zhuyishiqing" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">批准日期</label>
                </div>
                <input type="text" class="form-control" value="${data.pizhunriqi}" name="pizhunriqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        批准变更日志
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.pizhunbiangengriqi}" name="pizhunbiangengriqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">变更内容</label>
                </div>
                <input type="text" class="form-control" value="${data.biangengneirong}" name="biangengneirong" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        备案日期
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.beianriqi}" name="beianriqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">备案内容</label>
                </div>
                <input type="text" class="form-control" value="${data.beianneirong}" name="beianneirong" >
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        转让方中文名
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.zhuanrangfaChinaName}" name="zhuanrangfaChinaName" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">转让发外国名</label>
                </div>
                <input type="text" class="form-control" value="${data.zhuanrangfaForeignName}" name="zhuanrangfaForeignName" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        转让方地址
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.zhuanfangfadizhi}" name="zhuanfangfadizhi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">受让方</label>
                </div>
                <input type="text" class="form-control" value="${data.shourangfang}" name="shourangfang" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        受让方地址
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.shourangfangdizhi}" name="shourangfangdizhi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">转让前批准文号</label>
                </div>
                <input type="text" class="form-control" value="${data.zhuanrangqianpizhunwenhao}" name="zhuanrangqianpizhunwenhao" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        批准转让日期
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.pizhunzhuanranriqi}" name="pizhunzhuanranriqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">补发日期</label>
                </div>
                <input type="text" class="form-control" value="${data.bufariqi}" name="bufariqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        注销日期
                    </label>
                </div>
                <input type="text" class="form-control" value="${data.zhuxiaoriqi}" name="zhuxiaoriqi" >
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">注销原因</label>
                </div>
                <input type="text" class="form-control" value="${data.zhuxiaoyuanyin}" name="zhuxiaoyuanyin" >
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">
                        备注
                    </label>
                </div>
                <div type="text" class="" value="${data.beizhu}" name="beizhu" >${data.beizhu}</div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="input-group ">
                <div class="input-group-btn">
                    <label type="label" class="btn btn-primary">信息来源</label>
                </div>
                <div type="text" class="" value="${data.source}" name="source" >${data.source}</div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
<script type="text/javascript">
    function goback() {
        location.href = "${path}/health/search";
    }
</script>