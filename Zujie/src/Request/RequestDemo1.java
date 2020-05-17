package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示Request对象获取请求行数据
 */

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        System.out.println("-------------------------");
        //2.获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        System.out.println("-------------------------");
        //3.获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        System.out.println("-------------------------");
        //5.获取请求的URI
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI:" + requestURI);
        System.out.println("URL:" + requestURL);
        System.out.println("-------------------------");
        //6.获取协议和版本
        String protocol = request.getProtocol();
        System.out.println(protocol);
        System.out.println("-------------------------");
        //7.获取客户端IP
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            1.获取请求方式：
                * String getMethod()
            (!)2.获取虚拟目录：
                * String getContextPath()
            3.获取Servlet路径
                * String getServletPath()
            4.获取get方式的请求参数
                * String getQueryString()
            (!)5.获取请求的URI ：虚拟目录+Servlet路径
                * String getRequestURI()
                * StringBuffer getRequestURL()
            6.获取协议和版本
                * String getProtocol()
            7.获取客户机的IP地址
                * String getRemoteAddr()
         */
        //1.获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        System.out.println("-------------------------");
        //2.获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        System.out.println("-------------------------");
        //3.获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        System.out.println("-------------------------");
        //4.获取get的请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        System.out.println("-------------------------");
        //5.获取请求的URI
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI:" + requestURI);
        System.out.println("URL:" + requestURL);
        System.out.println("-------------------------");
        //6.获取协议和版本
        String protocol = request.getProtocol();
        System.out.println(protocol);
        System.out.println("-------------------------");
        //7.获取客户端IP
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
