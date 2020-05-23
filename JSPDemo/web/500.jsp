<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>服务器正忙</h1>
    <%
        String error = exception.getMessage();
        out.print(error);
    %>
</body>
</html>
