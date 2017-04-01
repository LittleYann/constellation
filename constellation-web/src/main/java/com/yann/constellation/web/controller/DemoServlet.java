package com.yann.constellation.web.controller;

import com.yann.constellation.service.DemoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yann on 2017/3/31.
 */
public class DemoServlet extends HttpServlet{

    private DemoService demoService = new DemoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        System.out.printf(name + "," + pass);
        String result = demoService.login(name, pass);
        System.out.printf(result);
    }
}
