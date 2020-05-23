package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * ServletContext  域范围 Demo3，Demo4
 */
@WebServlet("/ServletContextDemo3")
public class ServletContextDeno3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext对象的获取
        /*
        ServletContext功能：
            1.获取MIME类型：

            2.域对象：共享数据的
            3.获取文件的真实(服务器路径)路径
         */

        //2.通过HttpServlet获取
        ServletContext sc2 = this.getServletContext();

        //设置数据
        sc2.setAttribute("Name","Gnar");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
