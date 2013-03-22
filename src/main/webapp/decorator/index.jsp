<%--
  Created by IntelliJ IDEA.
  User: ZhongGang
  Date: 12-12-22
  Time: 下午9:54
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html>
<head>
    <title>雇佣我 - <decorator:title/></title>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
    <link href="/css/style.css" rel="stylesheet"/>
    <link href="/css/main.css" rel="stylesheet"/>
    <decorator:head/>
</head>
<body>
<div id="header">
    <div id="rightHeader">
        <h3>
            <a href="/index">首页</a>
            <a href="/login">登录</a>
            <a href="/register">注册</a>
        </h3>
    </div>
</div>

<div align="center">
    <div id="container" style="padding-left: 20px">
        <decorator:body/>
    </div>
</div>

<div id="footer">
    &copy; 2013 Zhong Gang's Website
</div>
</body>
</html>