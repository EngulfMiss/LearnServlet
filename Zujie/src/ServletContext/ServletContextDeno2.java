package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo2")
public class ServletContextDeno2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext对象的获取
        /*
        ServletContext功能：
            1.获取MIME类型：
                * MIME类型：在互联网通信过程中定义的一种文件数据类型
                    * 格式：大类型/小类型  text/html

                * 获取：String getMimeType(String file)

            2.域对象：共享数据的
            3.获取文件的真实(服务器路径)路径
         */

        //2.通过HttpServlet获取
        ServletContext sc2 = this.getServletContext();

        //定义文件名称
        String fileName = "a.jpg";
        String mimeType = sc2.getMimeType(fileName);
        System.out.println(mimeType);  //  image/jpeg

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
