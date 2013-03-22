<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://employ-me.com/customize" prefix="customize" %>
<html>
<head>
    <title>撰写技术文章</title>
    <script type="text/javascript" src="/js/ckeditor/ckeditor.js"></script>
    <script type="text/javascript" src="/js/article.js"></script>
</head>
<body>
<div id="articleForm">
    <form:form commandName="article" method="post">
        <table>
            <tr>
                <td>标题</td>
                <td>
                    <form:input path="title"/>
                    <customize:errors path="title"/>
                </td>
                <td>类别</td>
                <td>
                    <form:select path="category" items="${categories}" itemLabel="label" itemValue="value"/>
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <form:textarea id="content" path="content"/>
                    <customize:errors path="content"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="发布"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>