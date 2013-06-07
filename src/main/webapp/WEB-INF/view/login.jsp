<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form:form commandName="login" method="post">
    <table>
        <tr>
            <td><label>账号</label></td>
            <td>
                <form:input path="username"/>
                <form:errors path="username" cssClass="form-error"/>
            </td>
        </tr>
        <tr>
            <td><label>密码</label></td>
            <td>
                <form:password path="password"/>
                <form:errors path="password" cssClass="form-error"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="checkbox" name="rememberMe"/>记住我
                <a id="forgetPassword" href="javascript:void(0)">忘记密码了？</a>
            </td>
        </tr>
        <c:if test="${errorCode eq 1}">
            <tr>
                <td colspan="2" align="center">
                    <span class="error">用户名或密码错误</span>
                </td>
            </tr>
        </c:if>
        <tr>
            <td colspan="2">
                <input type="submit" value="登陆" class="btn btn-large btn-primary"/>
                <input type="button" onclick="forward('register')" value="注册" class="btn btn-large btn-primary"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>