<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>预览个人信息</title>
    <script type="text/javascript" src="/js/resume.js"></script>
</head>
<body>
<div align="left">
    <fieldset>
        <legend><strong>基本信息查看</strong></legend>
        <table>
            <tr>
                <td> ${resume.basicInfoDTO.chineseName} </td>
                <td> ${resume.basicInfoDTO.englishName} </td>
            </tr>
            <tr>
                <td> ${resume.basicInfoDTO.gender.label} </td>
                <td> ${resume.basicInfoDTO.address} </td>
            </tr>
            <tr>
                <td>${resume.basicInfoDTO.birthday} </td>
                <td> ${resume.basicInfoDTO.phone} </td>
            </tr>
            <tr>
                <td> ${resume.basicInfoDTO.email} </td>
                <td> ${resume.basicInfoDTO.qq} </td>
            </tr>
            <tr>
                <td colspan="2">
                    ${resume.basicInfoDTO.selfDescription}
                </td>
            </tr>
        </table>
    </fieldset>
    <c:if test="${resume.hasEducationExperiences}">
        <fieldset>
            <legend>教育经历查看</legend>
            <div>
                <c:forEach items="${resume.educationExperienceDTOs}" var="educationExperienceDTO">
                    <fieldset>
                        <legend>${educationExperienceDTO.school}</legend>
                        <table>
                            <tr>
                                <td colspan="2">
                                        ${educationExperienceDTO.startDate} 至 ${educationExperienceDTO.endDate}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                        ${educationExperienceDTO.school}
                                </td>
                                <td>
                                        ${educationExperienceDTO.major}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                        ${educationExperienceDTO.description}
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </div>
        </fieldset>
    </c:if>
    <c:if test="${resume.hasWorkExperiences}">
        <fieldset>
            <legend>工作经历查看</legend>
            <div>
                <c:forEach items="${resume.workExperienceDTOs}" var="workExperienceDTO">
                    <fieldset>
                        <legend>${workExperienceDTO.company}</legend>
                        <table>
                            <tr>
                                <td colspan="2">
                                        ${workExperienceDTO.startDate} 至 ${workExperienceDTO.endDate}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                        ${workExperienceDTO.company}
                                </td>
                                <td>
                                        ${workExperienceDTO.position}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                        ${workExperienceDTO.department}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                        ${workExperienceDTO.description}
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </div>
        </fieldset>
    </c:if>
    <c:if test="${resume.hasProjectExperiences}">
        <fieldset>
            <legend>项目经验查看</legend>
            <div>
                <c:forEach items="${resume.projectExperienceDTOs}" var="projectExperienceDTO">
                    <fieldset>
                        <legend>${projectExperienceDTO.project}</legend>
                        <table>
                            <tr>
                                <td colspan="2">
                                        ${projectExperienceDTO.startDate} 至 ${projectExperienceDTO.endDate}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                        ${projectExperienceDTO.project}
                                </td>
                                <td>
                                        ${projectExperienceDTO.technologies}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                        ${projectExperienceDTO.remark}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                        ${projectExperienceDTO.duty}
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </c:forEach>
            </div>
        </fieldset>
    </c:if>
</div>
</body>
</html>