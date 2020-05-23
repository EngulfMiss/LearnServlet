<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${3 > 4}

    \${5 > 6}
<hr>
    <h3>算术运算符</h3>
    ${3 + 4}<br>
    ${3 / 4}<br>
    ${3 div 4}<br>
    ${3 % 4}<br>
    ${3 mod 4}
<hr>
    <h3>比较运算符</h3>
    ${3 == 4}<br>
<hr>
    <h3>逻辑运算符</h3>
    ${3 > 4 and 5 < 6}<br>

    <h3>empty运算符</h3>
    <%
        String str = "Neeko";
        request.setAttribute("str",str);

        List list = new ArrayList<>();
        request.setAttribute("list",list);

    %>
    ${not empty str}
    ${not empty list}
</body>
</html>
