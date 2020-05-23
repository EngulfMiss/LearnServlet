package Engulf.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取所有的Cookie
        Cookie[] cs = request.getCookies();
        boolean flag = false;
        //2.遍历cs数组
        if(cs != null){
            for(Cookie c : cs){
                //3.获取cookie的名称
                String Cname = c.getName();
                //4.判断名称是否为LastTime
                if("LastTime".equals(Cname)){
                    flag = true;
                    //有该cookie，不是第一次访问

                    //响应数据
                    //获取cookie的value
                    String value = c.getValue();
                    System.out.println("解码前:" + value);
                    //URL解码
                    value = URLDecoder.decode(value,"utf-8");
                    System.out.println("解码后:" + value);

                    response.getWriter().write("<h1>欢迎回来,您上次的访问时间为:" + value + "</h1>");


                    //设置cookie的value
                    //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    System.out.println("编码前："+str_date);
                    //URL编码
                    str_date = URLEncoder.encode(str_date,"utf-8");
                    System.out.println("编码后："+str_date);

                    c.setValue(str_date);
                    //设置cookie的存活时间
                    c.setMaxAge(60 * 60);
                    response.addCookie(c);


                    break;
                }
            }
        }

        if(cs == null || flag == false){

            //没有，表示第一次访问
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);

            System.out.println("编码前："+str_date);
            //URL编码
            str_date = URLEncoder.encode(str_date,"utf-8");
            System.out.println("编码后："+str_date);

            Cookie c = new Cookie("LastTime",str_date);
            //设置cookie的存活时间
            c.setMaxAge(60 * 60);
            response.addCookie(c);
            //响应数据

            response.getWriter().write("<h1>欢迎首次使用</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
