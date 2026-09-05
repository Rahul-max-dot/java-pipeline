package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<html>" +
            "<head>" +
            "<title>CI/CD Application</title>" +
            "</head>" +

            "<body>" +

            "<h1>CI/CD Pipeline Successful!</h1>" +

            "<h2>Application Details</h2>" +

            "<p>GitHub → Jenkins → Maven → Docker → Kubernetes</p>" +

            "<p>Tomcat application is running successfully.</p>" +

            "</body>" +

            "</html>"
        );
    }
}
