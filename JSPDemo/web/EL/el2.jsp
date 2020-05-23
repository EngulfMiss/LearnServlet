<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/20
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中数据</title>
</head>
<body>
    <%
        //在域中存储数据
        session.setAttribute("name","Neeko");
        request.setAttribute("name","Gnar");
        session.setAttribute("age","7");

    %>

    <h3>el获取值</h3>
    ${requestScope.name}<br>
    ${sessionScope.age}<br>
    ${requestScope.asd}<br>
    ${name}

</body>
</html>
