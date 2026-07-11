package com.coforge.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/area")
public class AreaServletAss extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        double radius = Double.parseDouble(request.getAttribute("radius").toString());

        double area = Math.PI * radius * radius;

        PrintWriter out = response.getWriter();

        out.println("<h2>Area of Circle</h2>");
        out.println("Radius: " + radius + "<br>");
        out.println("Area: " + area);
    }
}