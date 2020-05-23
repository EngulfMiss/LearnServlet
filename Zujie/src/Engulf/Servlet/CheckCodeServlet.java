package Engulf.Servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckCode")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 100;
        int height = 40;
        //1.创建一个对象，在内存中代表一个图片(验证码图片对象)
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //2.美化图片
        //2.1填充背景色
        Graphics pen = image.getGraphics(); //画笔对象
        pen.setColor(Color.PINK); //设置画笔颜色
        pen.fillRect(0,0,width,height);

        //2.2画边框
        pen.setColor(Color.BLUE);
        pen.drawRect(0,0,width-1,height-1);

        String str = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";



        //2.3写验证码
        Random ran = new Random();
        int Check_count = 4;
        for(int i = 1;i <= Check_count;i++){
            //生成随机脚标
            int index = ran.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);
            pen.drawString(ch+"",(width/(Check_count+1)) * i,height/2);
        }


        //2.4画干扰线
        pen.setColor(Color.GREEN);
        for(int i = 0;i < 6;i++){
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);

            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);

            pen.drawLine(x1,y1,x2,y2);
        }




        //3.将图片响应到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
