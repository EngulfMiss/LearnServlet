<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/21
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach标签</title>
</head>
<body>
        <%--
            foreach:当当于java代码的for语句
            for的功能：
            1.完成重复的操作
                for(int i = 0;i < 10;i++){
                }
                * 属性:
                    begin:开始值
                    end：结束值
                    var：临时变量
                    step：步长
                    varStatus:循环状态对象
                        index:
                        count:循环次数


            2.遍历容器
                List<User> list;
                for(User u:list){
                }

                * 属性：
                    items:容器对象
                    var：容器中的临时对象
        --%>
    <c:forEach begin="5" end="10" step="2" var="i" varStatus="s">
        ${i}<br> <h3>${s.index}</h3> <h2>${s.count}</h2>
    </c:forEach>

    <hr>
    <%
        List list = new ArrayList<>();
        list.add("Gnar");
        list.add("Neeko");
        list.add("Tian");

        request.setAttribute("list",list);
    %>

    <c:forEach items="${list}" var="name" varStatus="s">
        ${s.index} ${s.count} ${name}<br>
    </c:forEach>

</body>
</html>
