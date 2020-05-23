package Engulf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置request编码
        request.setCharacterEncoding("utf-8");
        //2.获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //3.获取生成的验证码
        HttpSession hs = request.getSession();
        String check = (String)hs.getAttribute("check");
        //删除session中存储的验证码
        hs.removeAttribute("check");

        //4.判断验证码是否正确,忽略大小写比较
        if(check != null && check.equalsIgnoreCase(checkCode)){
            //验证码正确,判断用户名密码的正确性
            if("Gnar".equals(username) && "123".equals(password)){  //将来需要调用UserDao查询数据库的
                //登录成功
                //存储信息，用户信息
                hs.setAttribute("user",username);

                //重定向到success.jsp
                response.sendRedirect(request.getContextPath() + "/success.jsp");


            }else{
                //登录失败
                //存储提示信息到request
                request.setAttribute("login_error","用户名或密码错误");
                //转发到登录页面
                request.getRequestDispatcher("/login.jsp").forward(request,response);

            }

        }else{
            //验证码错误
            //存储提示信息到request
            request.setAttribute("c_error","验证码错误");
            //转发到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
