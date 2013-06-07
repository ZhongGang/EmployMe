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
    <title>系统管理 - <decorator:title/></title>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
    <link href="/css/main.css" rel="stylesheet"/>
    <link href="/css/style.css" rel="stylesheet"/>

    <!-- bootstrap -->
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <link href="/bootstrap/css/bootstrap.css" rel="stylesheet"/>

    <link href="/css/style.css" rel="stylesheet"/>
    <decorator:head/>
</head>
<body>
<div id="leftPart">
    <ul>
        <dl>
            <b>${SPRING_SECURITY_CONTEXT.authentication.principal.nickname}</b>
        </dl>
        <dl>
            <a href="/monitoring">系统监控</a>
        </dl>
        <dl>
            <a href="/admin/user/manage">用户监控</a>
        </dl>
        <dl>
            <a href="javascript:void(0)">国际化</a>
        </dl>
        <dl>
            <a href="/logout">退出</a>
        </dl>
    </ul>
</div>
<div id="rightPart">
    <decorator:body/>
</div>
</body>
</html>