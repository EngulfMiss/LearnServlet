package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo5")
public class ServletContextDeno5 extends HttpServlet {
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

        //获取文件的服务器路径
        String realPath = sc2.getRealPath("/b.txt"); //web目录下资源访问
        System.out.println(realPath);

        String realPath2 = sc2.getRealPath("/WEB-INF/c.txt"); //WEB-INF目录下资源访问
        System.out.println(realPath2);

        String realPath3 = sc2.getRealPath("/WEB-INF/classes/a.txt"); //src目录下资源访问

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
