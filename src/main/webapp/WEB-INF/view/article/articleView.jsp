<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>技术文章 - ${articleDTO.title}</title>
</head>
<body>
<div class="hero-unit">
    <h2><strong>${articleDTO.title}</strong>(${articleDTO.category.label})</h2>

    <p>${articleDTO.content}</p>

    <p>
        <a href="overview" class="btn btn-small btn-primary">返回</a>
    </p>
</div>
</body>
</html>