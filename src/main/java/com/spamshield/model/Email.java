package com.spamshield.model;

import java.sql.Timestamp;

public class Email {

    private int id;
    private String subject;
    private String body;
    private int spamScore;
    private String result;
    private Timestamp analyzedAt;

    public Email() {

    }

    public Email(String subject, String body, int spamScore, String result) {
        this.subject = subject;
        this.body = body;
        this.spamScore = spamScore;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getSpamScore() {
        return spamScore;
    }

    public void setSpamScore(int spamScore) {
        this.spamScore = spamScore;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Timestamp getAnalyzedAt() {
        return analyzedAt;
    }

    public void setAnalyzedAt(Timestamp analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

}