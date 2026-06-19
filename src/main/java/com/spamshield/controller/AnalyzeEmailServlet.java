package com.spamshield.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spamshield.dao.EmailDAO;
import com.spamshield.model.Email;
import com.spamshield.util.SpamDetector;

@WebServlet("/AnalyzeEmailServlet")
public class AnalyzeEmailServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String subject = request.getParameter("subject");
        String body = request.getParameter("body");

        int score = SpamDetector.calculateSpamScore(subject, body);

        String result = SpamDetector.getResult(score);

        Email email = new Email(subject, body, score, result);

        EmailDAO dao = new EmailDAO();

        dao.saveEmail(email);

        request.setAttribute("subject", subject);
        request.setAttribute("body", body);
        request.setAttribute("score", score);
        request.setAttribute("result", result);

        RequestDispatcher rd =
                request.getRequestDispatcher("result.jsp");

        rd.forward(request, response);
    }
}