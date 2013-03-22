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
                    <customize:errors path="username"/>
                </td>
            </tr>
            <tr>
                <td><label>密码</label></td>
                <td>
                    <form:password path="password"/>
                    <customize:errors path="password"/>
                </td>
            </tr>
            <tr>
                <td><label>呢称</label></td>
                <td>
                    <form:input path="nickname"/>
                    <customize:errors path="nickname"/>
                </td>
            </tr>
            <tr>
                <td><label>邮箱</label></td>
                <td>
                    <form:input path="email"/>
                    <customize:errors path="email"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" onclick="forward('login')" value="前往登陆"/>
                    <input type="submit" value="注册"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>