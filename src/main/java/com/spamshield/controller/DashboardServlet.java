package com.spamshield.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.spamshield.dao.EmailDAO;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EmailDAO dao = new EmailDAO();

        int total = dao.getTotalEmails();
        int spam = dao.getSpamEmails();
        int safe = dao.getSafeEmails();

        request.setAttribute("total", total);
        request.setAttribute("spam", spam);
        request.setAttribute("safe", safe);

        request.getRequestDispatcher("dashboard.jsp")
               .forward(request, response);
    }
}