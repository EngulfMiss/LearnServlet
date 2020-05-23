package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo1")
public class ServletContextDeno1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext对象的获取
        /*
            通过requesst对象获取
            request.getServletContext()

            通过HttpServlet获取
            this.getServletContext()
         */

        //1.通过request对象获取
        ServletContext sc = request.getServletContext();
        //2.通过HttpServlet获取
        ServletContext sc2 = this.getServletContext();

        System.out.println(sc);
        System.out.println(sc2);

        System.out.println(sc == sc2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
