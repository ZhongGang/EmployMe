<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://employ-me.com/customize" prefix="cs" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="/login.jsp" method="post">
    <table>
        <tr>
            <td><label>账号</label></td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td><label>密码</label></td>
            <td>
                <input type="password" name="passowrd"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input id="rememberMe" type="checkbox" name="rememberMe"/><label for="rememberMe">记住我</label>
                <a id="forgetPassword" href="javascript:void(0)">忘记密码了？</a>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="登陆"/>
                <input type="button" onclick="forward('register')" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>