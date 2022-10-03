package com.carwasher.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

@WebServlet("/CarWasherServlet")
public class CarWasherServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CarWasherServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        response.getWriter().append("Served. Hello World! ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        doGet(request, response);
    }
}

