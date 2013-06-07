<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="modalTitle">用户信息修改</h3>
</div>
<div class="modal-body">
    <form:form commandName="userInfoChangeDTO" method="post">
        <table cellpadding="15">
            <tr>
                <td><label>旧密码</label></td>
                <td>
                    <form:password path="oldPassword"/>
                    <form:errors path="oldPassword" cssClass="form-error"/>
                </td>
            </tr>
            <tr>
                <td><label>新密码</label></td>
                <td>
                    <form:password path="newPassword"/>
                    <form:errors path="newPassword" cssClass="form-error"/>
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
                <td></td>
                <td>
                    <input class="btn btn-primary" type="button" value="修改"
                           onclick="submitUserInfoChangeFormDialog(this.form)"/>
                    <a class="btn btn-warning" data-dismiss="modal" aria-hidden="true">取消</a>
                </td>
            </tr>
        </table>
    </form:form>
</div>
<div class="modal-footer">
</div>
