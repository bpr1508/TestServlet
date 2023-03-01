package com.bpr15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/test")
public class Servlet1 extends HttpServlet {
    String s = "Hello world";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<h1>" + s + "</h1>");
    }
}
