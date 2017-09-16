<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>保健食品查询</title>
    <link href="${path}/static/css/bootstrap.3.3.7.min.css" rel="stylesheet">
</head>


    <div class="container" role="main">
        <hr>
        <div class="row">
            <h2 class="col-md-12">保健食品查询</h2>
                <div class="col-md-12">
                    <button type="button" class="btn btn-primary" id="check" onclick="sub()">查询</button>
                    <%--<button type="button" class="btn btn-primary" href="goback" onclick="goback()">返回</button>--%>
                </div>
        </div>
        <br>
        <div class="row">
            <form action="${path}/health/search" method="post" id="rForm">
                <input id="p_pageNum" type="hidden" name="pageNum" value="${zpage.pageNum}">
                <input id="p_pageSize" type="hidden" name="pageSize" value="${zpage.pageSize}">
                <input id="p_total" type="hidden" name="p_total" value="${zpage.total}">
                <div class="col-md-3">
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary">批准文号</button>
                        <input id="pizhunwenhao" name="pizhunwenhao" value="${pizhunwenhao }" placeholder="批准文号">
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary">食品名称</button>
                        <input id="name" name="name" value="${name }" placeholder="名称">
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary">食品功能</button>
                        <input id="gongneng" name="gongneng" value="${gongneng }" placeholder="食品功能">
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary">适宜人群</button>
                        <input id="shiyirenqun" name="shiyirenqun" value="${shiyirenqun }" placeholder="适宜人群">
                    </div>
                </div>
            </form>
        </div>
        <hr>

        <div class="row">
            <h2 class="col-md-12">保健食品</h2>
        </div>

        <div class="row">
            <div class="col-md-12">
                <span type="button" class=" btn btn-primary" >结果总数：${zpage.total}</span>
                <span type="button" class="btn btn-primary" >当前页码：${zpage.pageNum}</span>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <table class="table table-bordered">
                    <tr>
                        <th>批准文号</th>
                        <th>食品名称</th>
                        <th>食品功能</th>
                        <th>适宜人群</th>
                        <th>备案日期</th>
                    </tr>
                    <c:forEach var="item" items="${zpage.data}">
                        <tr class="active zhao ">
                            <input type="hidden" value="${path}/health/detail/${item.id}">
                            <td >${item.pizhunwenhao}</td>
                            <td >${item.name}</td>
                            <td >${item.gongneng} </td>
                            <td>${item.shiyirenqun}</td>
                            <td>${item.beianriqi}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">

            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <ul class="pager">
                    <li><a id="first_p" href="#" onclick="go(1)">首  页</a></li>
                    <li><a id="pre_p" href="#" onclick="goPre()">上一页</a></li>
                    <li><a id="next_p" href="#" onclick="goNext()">下一页</a></li>
                    <li><a id="last_p"href="#" onclick="goLast()">末  页</a></li>

                </ul>
            </div>
        </div>
    </div>

<script src="${path}/static/js/jquery.min.2.2.4.js"></script>
<script src="${path}/static/js/bootstrap.3.3.6.min.js"></script>

</body>
</html>

<script type="application/javascript">

    var current_p=$("#p_pageNum").val();
    var page_Size=$("#p_pageSize").val();
    var page_total=$("#p_total").val();

    var last = page_total%page_Size == 0 ? page_total/page_Size:Math.ceil(page_total/page_Size);

   /* console.log("C:"+current_p);
    console.log("S:"+page_Size);
    console.log("T:"+page_total);
    console.log("L:"+last);
*/
    function sub() {
        console.log("C:"+current_p);
        $("#rForm").submit();
    }

    function go(i) {
        $("#p_pageNum").val(i);
        sub();
    }
    function goPre() {
        current_p = parseInt(current_p)-1;
        if(current_p <=1){
            current_p =1;
        }
        console.log("pre_C:"+current_p);
        go(parseInt(current_p));
    }
    function goNext() {
        current_p = parseInt(current_p)+1;
        if(current_p>= last){
            current_p = last;
        }
        console.log("next_C:"+current_p);
        go(parseInt(current_p));

    }
    function goLast(){
        go(last);
    }

    $(function () {
        $(".zhao").click(function () {
            var zref = $(this).find("input").val();
            console.log(zref);
            location.href=zref;
        });

    });

</script>
