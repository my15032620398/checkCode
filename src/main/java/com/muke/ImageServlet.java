package com.muke;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/4/14 - 15:50
 */

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/4/14 15:50
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 15:50
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage bufferedImage = new BufferedImage(68,22,BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        Color c = new Color(200,150,255);
        g.setColor(c);
        g.fillRect(0,0,68,22);
        char[] ch = "QWERTYUIOPASDFGHJKLZXCVBNM0123456789".toCharArray();
        Random r = new Random();
        int length = ch.length,index;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            index = r.nextInt(length);
            g.setColor(new Color(r.nextInt(88),r.nextInt(188),r.nextInt(255)));
            g.drawString(ch[index]+"",(i*15)+3,18);
            sb.append(ch[index]);
        }
        req.getSession().setAttribute("piccode",sb.toString());
        ImageIO.write(bufferedImage,"JPG", resp.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
