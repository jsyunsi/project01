package com.yunsi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：zz
 * 日期：2019-07-21
 * 2019/7/21
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*InitialContext ctx = new InitialContext();
        DataSource ds =(DataSource) ctx.lookup("java:comp/env/o12c");

        Connection conn = ds.getConnection();*/
        
    }
}
