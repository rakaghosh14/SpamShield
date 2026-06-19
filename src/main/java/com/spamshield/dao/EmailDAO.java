package com.spamshield.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.spamshield.model.Email;
import com.spamshield.util.DBConnection;

public class EmailDAO {

    // Save Email
    public boolean saveEmail(Email email) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO email_analysis "
                    + "(id, subject, body, spam_score, result) "
                    + "VALUES (email_seq.NEXTVAL, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email.getSubject());
            ps.setString(2, email.getBody());
            ps.setInt(3, email.getSpamScore());
            ps.setString(4, email.getResult());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Get All Emails
    public List<Email> getAllEmails() {

        List<Email> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM email_analysis ORDER BY id DESC";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Email email = new Email();

                email.setId(rs.getInt("id"));
                email.setSubject(rs.getString("subject"));
                email.setBody(rs.getString("body"));
                email.setSpamScore(rs.getInt("spam_score"));
                email.setResult(rs.getString("result"));
                email.setAnalyzedAt(rs.getTimestamp("analyzed_at"));

                list.add(email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
 // Delete Email
    public boolean deleteEmail(int id) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM email_analysis WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
 // Total Emails
    public int getTotalEmails() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT COUNT(*) FROM email_analysis";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                count = rs.getInt(1);

            }

        } catch(Exception e) {

            e.printStackTrace();

        }

        return count;
    }
    
 // Total Spam Emails
    public int getSpamEmails() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT COUNT(*) FROM email_analysis WHERE result='SPAM'";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                count = rs.getInt(1);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return count;
    }
    
 // Total Safe Emails
    public int getSafeEmails() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT COUNT(*) FROM email_analysis WHERE result='NOT SPAM'";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                count = rs.getInt(1);

            }

        } catch(Exception e) {

            e.printStackTrace();

        }

        return count;
    }

}