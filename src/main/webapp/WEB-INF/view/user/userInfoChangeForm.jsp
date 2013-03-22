<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://employ-me.com/customize" prefix="customize" %>
<div>
    <form:form commandName="userInfoChangeDTO" method="post">
        <table cellpadding="10">
            <tr>
                <td><label>旧密码</label></td>
                <td>
                    <form:password path="oldPassword"/>
                    <customize:errors path="oldPassword"/>
                </td>
            </tr>
            <tr>
                <td><label>新密码</label></td>
                <td>
                    <form:password path="newPassword"/>
                    <customize:errors path="newPassword"/>
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
                <td></td>
                <td>
                    <input type="button" value="修改" onclick="submitUserInfoChangeFormDialog(this.form)"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>