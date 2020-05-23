package Engulf.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/SessionDemo3")
public class SessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取session
        HttpSession hs = request.getSession();
        //如果想让关闭浏览器后，下次访问session不变
        Cookie c = new Cookie("JSESSIONID",hs.getId());
        c.setMaxAge(60 * 60);
        response.addCookie(c);
        System.out.println(hs);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
