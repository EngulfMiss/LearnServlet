<%@ page import="Engulf.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取对象数据</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("Gnar");
        user.setAge(7);
        user.setBirthday(new Date());

        request.setAttribute("user",user);

        List list = new ArrayList();
        list.add("Gnar");
        list.add("Neeko");
        list.add(user);
        request.setAttribute("list",list);

        Map map = new HashMap<>();
        map.put("sname","Gnar");
        map.put("sex","man");
        map.put("user",user);
        request.setAttribute("map",map);

    %>

    <h3>获取Map值</h3>
    ${map}<br>
    ${map.sname}<br>
    ${requestScope.map.sex}<br>

    ${map["sname"]}<br>

    <hr>
    ${requestScope.map.user.name}<br>
    ${requestScope.map["user"].name}<br>
    <hr>


    <h3>获取List值</h3>
    ${list}
    ${requestScope.list[0]}<br>
    ${list[1]}<br>
    ${list[10]}<br>
    ${list[2].name}<br>

    <h3>el获取对象中的值</h3>
    ${requestScope.user}<br>

    <%--通过的是对象的属性来获取
        对象的属性：
        setXxx --> Xxx --> xxx(对象的属性)--%>
    ${requestScope.user.name}<br>
    ${requestScope.user.age}<br>
    ${requestScope.user.birthday}<br>
    ${requestScope.user.birStr}
</body>
</html>
