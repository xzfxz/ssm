<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HealthFood Check</title>

    <link rel="stylesheet" type="text/css" href="static/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="static/css/demo.css" />

    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="static/css/component.css" />

    <!--[if IE]>
    <script src="static/js/html5.js"></script>
    <![endif]-->
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <h1 class="main-title"><a href="#" onclick="welcome()"> Welcome  to <span class="thin"> HealthFood Check</span> </a></h1>
        </div>
    </div>
</div><!-- /container -->
<script src="static/js/TweenLite.min.js"></script>
<script src="static/js/EasePack.min.js"></script>
<script src="static/js/rAF.js"></script>
<script src="static/js/demo.js"></script>
</body>
</html>

<script type="application/javascript">
    function welcome() {

        location.href="${path}/index";
    }

</script>

