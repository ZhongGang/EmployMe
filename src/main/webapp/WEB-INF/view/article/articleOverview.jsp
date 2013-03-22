<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>技术文章一览</title>
</head>
<body>
<div id="articleOverview" align="left">
    <p><input id="newArticleButton" type="button" onclick="forward('form')" value="撰写新文章"/></p>
    <c:forEach items="${articleDTOs}" var="article">
        <fieldset>
            <legend>
                <strong>${article.title}(${article.category})</strong>
                <c:choose>
                    <c:when test="${article.active}">
                        <a href="view?guid=${article.guid}">查看</a>
                        <a href="update?guid=${article.guid}">修改</a>
                        <a href="deactive?guid=${article.guid}">禁用</a>
                    </c:when>
                    <c:otherwise>
                        <a href="active?guid=${article.guid}">启用</a>
                    </c:otherwise>
                </c:choose>
            </legend>
            <div>
                    ${article.content}
            </div>
        </fieldset>
    </c:forEach>
</div>
</body>
</html>