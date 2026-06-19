# SpamShield

## 📌 Overview

SpamShield is a web-based Email Spam Detection System developed using Java Servlet, JSP, JDBC, Oracle Database, and Apache Tomcat. The application analyzes email content, classifies emails as spam or safe, stores analysis results in the database, and provides history and dashboard statistics for monitoring email activities.

---

## ✨ Features

* Analyze email subject and body.
* Detect spam based on predefined keywords.
* Calculate spam score.
* Display result as SPAM or NOT SPAM.
* Store analysis records in Oracle Database.
* View complete email history.
* Delete records from history.
* Dashboard showing:

  * Total Emails
  * Spam Emails
  * Safe Emails
* Pie chart visualization.
* Built using MVC Architecture and DAO Pattern.

---

## 🛠 Technologies Used

* Java
* JSP
* Servlet
* JDBC
* Oracle Database 10g XE
* Apache Tomcat 9
* Eclipse IDE
* HTML
* CSS
* JavaScript
* Chart.js
* Git & GitHub

---

# 📂 Project Structure

```
SpamShield
│
├── src
│   └── main
│       ├── java
│       │
│       │   └── com.spamshield
│       │       │
│       │       ├── controller
│       │       │      AnalyzeEmailServlet.java
│       │       │      HistoryServlet.java
│       │       │      DeleteServlet.java
│       │       │      DashboardServlet.java
│       │       │
│       │       ├── dao
│       │       │      EmailDAO.java
│       │       │
│       │       ├── model
│       │       │      Email.java
│       │       │
│       │       └── util
│       │              DBConnection.java
│       │              SpamDetector.java
│       │
│       └── webapp
│              index.jsp
│              analyze.jsp
│              result.jsp
│              history.jsp
│              dashboard.jsp
│              style.css
│
├── README.md
├── .gitignore
├── .classpath
└── .project
```

---

# 🏗 Architecture

The project follows the MVC (Model-View-Controller) architecture.

### Model

Contains Java classes representing email entities.

* Email.java

### View

Contains JSP pages used for displaying UI.

* index.jsp
* analyze.jsp
* result.jsp
* history.jsp
* dashboard.jsp

### Controller

Contains Servlets that process requests.

* AnalyzeEmailServlet
* HistoryServlet
* DeleteServlet
* DashboardServlet

### DAO Layer

Handles database operations.

* EmailDAO.java

### Utility Layer

Provides helper classes.

* DBConnection.java
* SpamDetector.java

---

# ⚙ Workflow

1. User enters email subject and body.
2. AnalyzeEmailServlet receives request.
3. SpamDetector calculates spam score.
4. Result is classified as SPAM or NOT SPAM.
5. EmailDAO stores data into Oracle Database.
6. Result page displays spam status.
7. User can view history and dashboard statistics.

---

# 🗄 Database

### Table : EMAIL_ANALYSIS

| Column      | Type      |
| ----------- | --------- |
| ID          | NUMBER    |
| SUBJECT     | VARCHAR2  |
| BODY        | VARCHAR2  |
| SPAM_SCORE  | NUMBER    |
| RESULT      | VARCHAR2  |
| ANALYZED_AT | TIMESTAMP |

---

# 📸 Screenshots

### Home Page

(Add Screenshot)

### Analyze Email

(Add Screenshot)

### Result Page

(Add Screenshot)

### History Page

(Add Screenshot)

### Dashboard

(Add Screenshot)

---

# 🚀 Future Enhancements

* Search emails by subject.
* Filter Spam and Safe emails.
* Export history to PDF.
* Upload text file for analysis.
* User Login System.
* Machine Learning based spam detection.
* Email API integration.

---

# 👨‍💻 Author

**Raka Ghosh**

GitHub: https://github.com/rakaghosh14

---

## ⭐ If you found this project useful, give it a star.
