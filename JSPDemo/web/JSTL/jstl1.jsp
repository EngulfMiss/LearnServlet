<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
    <%--
    c:if标签
        1.属性：
        test必须属性，test接收boolean表达式
            * 如果表达式为true，如果为false则不显示标签体内容

            * 一般情况下，test属性值会结合el表达式一起使用

        2.注意：
            c:if标签没有else情况，只能再写c:if

    --%>
    <c:if test="true">
        <h1>我是真的...</h1>
    </c:if>

    <%
        List list = new ArrayList();
        list.add("Gnar");
        request.setAttribute("list",list);
    %>

    <c:if test="${not empty list}">
        遍历集合:

    </c:if>

</body>
</html>
