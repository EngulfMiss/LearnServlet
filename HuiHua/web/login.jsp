<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>

<script>
    window.onload = function () {
        document.getElementById("img").onclick = function () {

            this.src="/HuiHua_war_exploded/CheckCode?" + new Date().getTime();
        }
    }
</script>

<style>
    div{
        color:red;
    }
</style>
<body>
    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>

            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>

            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>

            <tr>
                <td colspan="2"><img src="/HuiHua_war_exploded/CheckCode" id="img"></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
    <div><%=request.getAttribute("c_error") == null ? "" : request.getAttribute("c_error")%></div>
    <div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>
</body>
</html>
