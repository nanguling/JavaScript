package com.mystudy.controller;

import com.mystudy.entity.Dept;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.得到部门类型对象
        Dept dept = new Dept(10,"策划","成都");
        //2.通过json工具包中工具类，将dept对象中的内容转换为json字符串
    }
}
