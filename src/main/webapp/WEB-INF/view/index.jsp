<%--
  Created by IntelliJ IDEA.
  User: ZhongGang
  Date: 12-12-22
  Time: 下午9:54
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>欢迎来到钟刚制作的个人简历信息及技术文章展示网站</title>
</head>
<body>
<div align="left">
    <c:forEach items="${briefUserDTOs}" var="briefUserDTO">
        <fieldset>
            <legend>${briefUserDTO.nickname}</legend>
            <div>
                <fieldset>
                    <legend>个人信息简介</legend>
                    <div>
                        <h4>
                            <a href="/index/resume/view?resumeGuid=${briefUserDTO.briefResumeDTO.guid}">${briefUserDTO.briefResumeDTO.name}</a>
                        </h4>

                        <h4>${briefUserDTO.briefResumeDTO.gender}</h4>

                        <h4>${briefUserDTO.briefResumeDTO.birthday}</h4>
                    </div>
                </fieldset>
                <fieldset>
                    <legend>个人技术文章</legend>
                    <div>
                        <ul>
                            <c:forEach items="${briefUserDTO.briefArticleDTOs}" var="briefArticleDTO">
                                <li>
                                    <a href="/index/article/view?guid=${briefArticleDTO.guid}">${briefArticleDTO.title}</a>
                                    <b>[</b>
                                        ${briefArticleDTO.category}
                                    <b>]</b>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </fieldset>
            </div>
        </fieldset>
    </c:forEach>
</div>
</body>
</html>