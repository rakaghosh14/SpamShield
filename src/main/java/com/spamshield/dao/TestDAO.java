package com.spamshield.dao;

import com.spamshield.model.Email;

public class TestDAO {

    public static void main(String[] args) {

        Email email = new Email(
                "Congratulations",
                "Click here to claim your money",
                80,
                "SPAM");

        EmailDAO dao = new EmailDAO();

        boolean status = dao.saveEmail(email);

        if (status) {
            System.out.println("Inserted Successfully");
        } else {
            System.out.println("Insertion Failed");
        }
    }
}