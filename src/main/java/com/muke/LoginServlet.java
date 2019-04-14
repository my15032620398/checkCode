package com.muke;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/4/14 - 16:27
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/4/14 16:27
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 16:27
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String piccode = (String)req.getSession().getAttribute("piccode");
        String checkCode = req.getParameter("checkCode");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        if(checkCode.toUpperCase().equals(piccode.toUpperCase())){
            System.out.println("验证码输入正确");
            out.println("验证码输入正确");
        }else{
            System.out.println("验证码输出错误");
            out.println("验证码输出错误");
        }
        out.flush();
        out.close();
    }
}
