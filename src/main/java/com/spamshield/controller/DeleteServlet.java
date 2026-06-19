package com.spamshield.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.spamshield.dao.EmailDAO;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        EmailDAO dao = new EmailDAO();

        dao.deleteEmail(id);

        response.sendRedirect("HistoryServlet");
    }

}