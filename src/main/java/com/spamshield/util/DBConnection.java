package com.spamshield.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {

        try {

            if (con == null || con.isClosed()) {

                Class.forName("oracle.jdbc.driver.OracleDriver");

                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:XE",
                        "system",
                        "password");

                System.out.println("Connected Successfully");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}