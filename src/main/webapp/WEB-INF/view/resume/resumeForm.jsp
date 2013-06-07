<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://employ-me.com/customize" prefix="cus" %>
<html>
<head>
    <title>填写个人信息</title>
    <%--<link href="/css/jcrop/jquery.Jcrop.css" rel="stylesheet"/>--%>
    <script type="text/javascript" src="/js/jquery/ui/jquery.ui.datepicker.min.js"></script>
    <script type="text/javascript" src="/js/jquery/ui/i18n/jquery.ui.datepicker-zh-CN.js"></script>
    <%--<script type="text/javascript" src="/js/jcrop/jquery.color.js"></script>--%>
    <%--<script type="text/javascript" src="/js/jcrop/jquery.Jcrop.js"></script>--%>
    <script type="text/javascript" src="/js/resume.js"></script>
</head>
<body>
<div align="left">
<form:form commandName="resume" method="post" enctype="multipart/form-data">
<fieldset>
    <legend><strong>基本信息填写</strong></legend>
    <table>
        <tr>
            <td>中文姓名</td>
            <td>
                <form:input path="basicInfoDTO.chineseName"/>
                <cus:errors path="basicInfoDTO.chineseName"/>
            </td>
            <td>英文姓名</td>
            <td>
                <form:input path="basicInfoDTO.englishName"/>
                <cus:errors path="basicInfoDTO.englishName"/>
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <form:select path="basicInfoDTO.gender" items="${genders}" itemLabel="label" itemValue="value"/>
            </td>
            <td>住址</td>
            <td>
                <form:input path="basicInfoDTO.address"/>
                <cus:errors path="basicInfoDTO.address"/>
            </td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td>
                <form:input path="basicInfoDTO.birthday" cssClass="datePicker"/>
                <cus:errors path="basicInfoDTO.birthday"/>
            </td>
            <td>手机号码</td>
            <td>
                <form:input path="basicInfoDTO.phone"/>
                <cus:errors path="basicInfoDTO.phone"/>
            </td>
        </tr>
        <tr>
            <td>邮件地址</td>
            <td>
                <form:input path="basicInfoDTO.email"/>
                <cus:errors path="basicInfoDTO.email"/>
            </td>
            <td>QQ</td>
            <td>
                <form:input path="basicInfoDTO.qq"/>
                <cus:errors path="basicInfoDTO.qq"/>
            </td>
        </tr>
        <tr>
            <td>自我评价</td>
            <td colspan="3">
                <form:textarea cols="93" rows="10" path="basicInfoDTO.selfDescription"></form:textarea>
                <cus:errors path="basicInfoDTO.selfDescription"/>
            </td>
        </tr>
            <%--<tr>--%>
            <%--<td>头像</td>--%>
            <%--<td>--%>
            <%--<input type="file" name="basicInfoDTO.portrait"/>--%>
            <%--</td>--%>
            <%--<td colspan="2">--%>
            <%--<c:if test="${!resume.create}">--%>
            <%--<img src="portrait/show?resumeGuid=${resume.guid}" alt="PORTRAIT" width="80" height="80"/>--%>
            <%--</c:if>--%>
            <%--</td>--%>
            <%--</tr>--%>
    </table>
</fieldset>
<fieldset>
    <legend><strong>教育经历填写</strong><a href="javascript:addEducationExperienceItem()" class="btn btn-mini btn-primary">+</a></legend>
    <div id="educationExperienceContent" educationExperienceMaxIndex="${fn:length(resume.educationExperienceDTOs)}">
        <c:choose>
            <c:when test="${resume.hasEducationExperiences}">
                <c:forEach items="${resume.educationExperienceDTOs}" var="educationExperienceDTO"
                           varStatus="status">
                    <fieldset>
                        <legend>教育经历<a href="javascript:removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                        <table>
                            <tr>
                                <td>开始日期</td>
                                <td>
                                    <input type="text" class="datePicker" value="${educationExperienceDTO.startDate}"
                                           name="educationExperienceDTOs[${status.index}].startDate"/>
                                    <cus:errors path="educationExperienceDTOs[${status.index}].startDate"/>
                                </td>
                                <td>结束日期</td>
                                <td>
                                    <input type="text" class="datePicker" value="${educationExperienceDTO.endDate}"
                                           name="educationExperienceDTOs[${status.index}].endDate"/>
                                    <cus:errors path="educationExperienceDTOs[${status.index}].endDate"/>
                                </td>
                            </tr>
                            <tr>
                                <td>学校名称</td>
                                <td>
                                    <input type="text"
                                           name="educationExperienceDTOs[${status.index}].school"
                                           value="${educationExperienceDTO.school}"/>
                                    <cus:errors path="educationExperienceDTOs[${status.index}].school"/>
                                </td>
                                <td>专业名称</td>
                                <td>
                                    <input type="text" name="educationExperienceDTOs[${status.index}].major"
                                           value="${educationExperienceDTO.major}"/>
                                    <cus:errors path="educationExperienceDTOs[${status.index}].major"/>
                                </td>
                            </tr>
                            <tr>
                                <td>自我评价</td>
                                <td colspan="3">
                                    <textarea rows="10" cols="93"
                                              name="educationExperienceDTOs[${status.index}].description">
                                            ${educationExperienceDTO.description}</textarea>
                                    <cus:errors path="educationExperienceDTOs[${status.index}].description"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <fieldset>
                    <legend><strong>教育经历</strong><a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                    <table>
                        <tr>
                            <td>开始日期</td>
                            <td>
                                <input type="text" class="datePicker"
                                       name="educationExperienceDTOs[0].startDate"/>
                            </td>
                            <td>结束日期</td>
                            <td>
                                <input type="text" class="datePicker" name="educationExperienceDTOs[0].endDate"/>
                            </td>
                        </tr>
                        <tr>
                            <td>学校名称</td>
                            <td>
                                <input type="text" name="educationExperienceDTOs[0].school"/>
                            </td>
                            <td>专业名称</td>
                            <td>
                                <input type="text" name="educationExperienceDTOs[0].major"/>
                            </td>
                        </tr>
                        <tr>
                            <td>自我评价</td>
                            <td colspan="3">
                                <textarea rows="10" cols="93"
                                          name="educationExperienceDTOs[0].description"></textarea>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </c:otherwise>
        </c:choose>
    </div>
</fieldset>
<fieldset>
    <legend><strong>工作经历填写</strong><a href="javascript:addWorkExperienceItem()" class="btn btn-mini btn-primary">+</a></legend>
    <div id="workExperienceContent" workExperienceMaxIndex="${fn:length(resume.workExperienceDTOs)}">
        <c:choose>
            <c:when test="${resume.hasWorkExperiences}">
                <c:forEach items="${resume.workExperienceDTOs}" var="workExperienceDTO" varStatus="status">
                    <fieldset>
                        <legend>工作经历<a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                        <table>
                            <tr>
                                <td>开始日期</td>
                                <td>
                                    <input type="text" class="datePicker" value="${workExperienceDTO.startDate}"
                                           name="workExperienceDTOs[${status.index}].startDate"/>
                                    <cus:errors path="workExperienceDTOs[${status.index}].startDate"/>
                                </td>
                                <td>结束日期</td>
                                <td>
                                    <input type="text" class="datePicker"
                                           name="workExperienceDTOs[${status.index}].endDate"
                                           value="${workExperienceDTO.endDate}"/>
                                    <cus:errors path="workExperienceDTOs[${status.index}].endDate"/>
                                </td>
                            </tr>
                            <tr>
                                <td>公司名称</td>
                                <td>
                                    <input type="text" name="workExperienceDTOs[${status.index}].company"
                                           value="${workExperienceDTO.company}"/>
                                    <cus:errors path="workExperienceDTOs[${status.index}].company"/>
                                </td>
                                <td>职位</td>
                                <td>
                                    <input type="text" name="resume.workExperienceDTOs[${status.index}].position"
                                           value="${workExperienceDTO.position}"/>
                                    <cus:errors path="workExperienceDTOs[${status.index}].position"/>
                                </td>
                            </tr>
                            <tr>
                                <td>部门</td>
                                <td colspan="3">
                                    <input type="text" name="workExperienceDTOs[${status.index}].department"
                                           value="${workExperienceDTO.department}"/>
                                    <cus:errors path="workExperienceDTOs[${status.index}].department"/>
                                </td>
                            </tr>
                            <tr>
                                <td>职位描述</td>
                                <td colspan="3">
                                    <textarea rows="10" cols="93"
                                              name="workExperienceDTOs[${status.index}].description">
                                            ${workExperienceDTO.description}</textarea>
                                    <cus:errors path="workExperienceDTOs[${status.index}].description"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <fieldset>
                    <legend><strong>工作经历</strong><a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                    <table>
                        <tr>
                            <td>开始日期</td>
                            <td>
                                <input type="text" class="datePicker" name="workExperienceDTOs[0].startDate"/>
                            </td>
                            <td>结束日期</td>
                            <td>
                                <input type="text" class="datePicker" name="workExperienceDTOs[0].endDate"/>
                            </td>
                        </tr>
                        <tr>
                            <td>公司名称</td>
                            <td>
                                <input type="text" name="workExperienceDTOs[0].company"/>
                            </td>
                            <td>职位</td>
                            <td>
                                <input type="text" name="workExperienceDTOs[0].position"/>
                            </td>
                        </tr>
                        <tr>
                            <td>部门</td>
                            <td colspan="3">
                                <input type="text" name="workExperienceDTOs[0].department"/>
                            </td>
                        </tr>
                        <tr>
                            <td>职位描述</td>
                            <td colspan="3">
                                <textarea rows="10" cols="93"
                                          name="workExperienceDTOs[0].description"></textarea>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </c:otherwise>
        </c:choose>
    </div>
</fieldset>
<fieldset>
    <legend><strong>项目经验填写</strong><a href="javascript:addProjectExperienceItem()" class="btn btn-mini btn-primary">+</a></legend>
    <div id="projectExperienceContent" projectExperienceMaxIndex="${fn:length(resume.projectExperienceDTOs)}">
        <c:choose>
            <c:when test="${resume.hasProjectExperiences}">
                <c:forEach items="${resume.projectExperienceDTOs}" var="projectExperienceDTO" varStatus="status">
                    <fieldset>
                        <legend>项目经验<a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                        <table>
                            <tr>
                                <td>开始日期</td>
                                <td>
                                    <input type="text" class="datePicker"
                                           name="projectExperienceDTOs[${status.index}].startDate"
                                           value="${projectExperienceDTO.startDate}"/>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].startDate"/>
                                </td>
                                <td>结束日期</td>
                                <td>
                                    <input type="text" class="datePicker"
                                           name="projectExperienceDTOs[${status.index}].endDate"
                                           value="${projectExperienceDTO.endDate}"/>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].endDate"/>
                                </td>
                            </tr>
                            <tr>
                                <td>项目名称</td>
                                <td>
                                    <input type="text" name="projectExperienceDTOs[${status.index}].project"
                                           value="${projectExperienceDTO.project}"/>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].project"/>
                                </td>
                                <td>使用技术</td>
                                <td>
                                    <input type="text" name="projectExperienceDTOs[${status.index}].technologies"
                                           value="${projectExperienceDTO.technologies}"/>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].technologies"/>
                                </td>
                            </tr>
                            <tr>
                                <td>项目描述</td>
                                <td colspan="3">
                                    <textarea rows="10" cols="93"
                                              name="projectExperienceDTOs[${status.index}].remark">
                                            ${projectExperienceDTO.remark}
                                    </textarea>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].remark"/>
                                </td>
                            </tr>
                            <tr>
                                <td>职责描述</td>
                                <td colspan="3">
                                    <textarea rows="10" cols="93"
                                              name="projectExperienceDTOs[${status.index}].duty">
                                            ${projectExperienceDTO.duty}
                                    </textarea>
                                    <cus:errors path="projectExperienceDTOs[${status.index}].duty"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <fieldset>
                    <legend><strong>项目经验</strong><a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a></legend>
                    <table>
                        <tr>
                            <td>开始日期</td>
                            <td>
                                <input type="text" class="datePicker" name="projectExperienceDTOs[0].startDate"/>
                            </td>
                            <td>结束日期</td>
                            <td>
                                <input type="text" class="datePicker" name="projectExperienceDTOs[0].endDate"/>
                            </td>
                        </tr>
                        <tr>
                            <td>项目名称</td>
                            <td>
                                <input type="text" name="projectExperienceDTOs[0].project"/>
                            </td>
                            <td>使用技术</td>
                            <td>
                                <input type="text" name="projectExperienceDTOs[0].technologies"/>
                            </td>
                        </tr>
                        <tr>
                            <td>项目描述</td>
                            <td colspan="3">
                                <textarea rows="10" cols="93"
                                          name="projectExperienceDTOs[0].remark"></textarea>
                            </td>
                        </tr>
                        <tr>
                            <td>职责描述</td>
                            <td colspan="3">
                                <textarea rows="10" cols="93"
                                          name="projectExperienceDTOs[0].duty"></textarea>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </c:otherwise>
        </c:choose>
    </div>
</fieldset>
<input type="hidden" name="resume.guid" value="${resume.guid}"/>
<input type="button" onclick="submitResumeForm(this.form)" value="保存" class="btn btn-large btn-primary"/>
<input type="button" onclick="previewResumeForm(this.form)" value="预览" class="btn btn-large btn-primary"/>
</form:form>
</div>
</body>
</html>