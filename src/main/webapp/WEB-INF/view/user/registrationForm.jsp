<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://employ-me.com/customize" prefix="customize" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
<div>
    <form:form commandName="registration" method="post">
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
                <td><label>呢称</label></td>
                <td>
                    <form:input path="nickname"/>
                    <form:errors path="nickname" cssClass="form-error"/>
                </td>
            </tr>
            <tr>
                <td><label>邮箱</label></td>
                <td>
                    <form:input path="email"/>
                    <form:errors path="email" cssClass="form-error"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" onclick="forward('login')" value="前往登陆" class="btn btn-large btn-primary"/>
                    <input type="submit" value="注册" class="btn btn-large btn-primary"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>