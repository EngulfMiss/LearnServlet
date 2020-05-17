package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据 referer
        String ref = request.getHeader("referer");
        System.out.println(ref);

        //防盗链
        if(ref != null){
            if(ref.contains("/Zujie")){
                //正常访问
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("正常访问");
                System.out.println("正常访问");
            }else{
                System.out.println("盗链是吧");
            }
        }
    }
}
