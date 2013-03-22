<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>技术文章 - ${articleDTO.title}</title>
</head>
<body>
<div id="articleView">
    <h3><strong>${articleDTO.title}</strong>(${articleDTO.category.label})</h3>

    <div>
        ${articleDTO.content}
    </div>
</div>
</body>
</html>