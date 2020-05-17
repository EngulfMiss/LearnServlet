package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数
        //根据参数名称获取参数值
        /*String user = request.getParameter("username");
        System.out.println(request.getMethod() + user);*/

        //根据参数名称获取参数值的数组
        /*String[] hobbys = request.getParameterValues("hobby");
        for(String h:hobbys){
            System.out.println(h);
        }*/

        //获取所有请求的参数名称
        /*Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String pName = parameterNames.nextElement();
            System.out.println(pName);
            System.out.println(request.getParameter(pName));
            System.out.println("------------------------------");
        }*/


        //获取所有参数的map集合
        Map<String,String[]> paramaterMap = request.getParameterMap();
        Set<String> keyset = paramaterMap.keySet();
        for(String pname:keyset){
            String[] values = paramaterMap.get(pname);
            System.out.println(pname);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("---------------------------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数
        /*String user = request.getParameter("username");
        System.out.println(request.getMethod() + user);*/
        this.doPost(request,response);
    }
}
