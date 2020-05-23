<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/19
  Time: 6:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>



      <%
//          System.out.println("Hello JSP");
//          out.write("Hello JSP!!!");
          out.print("<br>");

          String contextPath = request.getContextPath();
          out.print(contextPath);
      %>



    <%!
        int i = 3;
     %>

  <%= i %>


      <%
          response.getWriter().write("response......");
      %>
  </body>
</html>
