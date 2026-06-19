package com.spamshield.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spamshield.dao.EmailDAO;
import com.spamshield.model.Email;

@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EmailDAO dao = new EmailDAO();

        List<Email> list = dao.getAllEmails();

        request.setAttribute("list", list);

        request.getRequestDispatcher("history.jsp")
               .forward(request, response);
    }
}