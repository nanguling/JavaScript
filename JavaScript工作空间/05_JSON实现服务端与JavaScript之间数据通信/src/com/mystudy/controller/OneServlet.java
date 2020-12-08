package com.mystudy.controller;

import com.mystudy.entity.Student;
import com.mystudy.util.RelectUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student(10,"mike");
        String val = RelectUtil.jsonObject(student);
        //将学生对象通过请求对象变成共享数据
        request.setAttribute("key",val);
        //通过请求转发向tomcat申请index_1.jsp来处理结果
        request.getRequestDispatcher("index_1.jsp").forward(request,response);
    }
}
