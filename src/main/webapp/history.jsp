<%@page import="java.util.List"%>
<%@page import="com.spamshield.model.Email"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Email History</title>

<style>

body{
    font-family:Arial;
    background:#f2f2f2;
}

.container{
    width:95%;
    margin:auto;
    margin-top:40px;
    background:white;
    padding:20px;
    box-shadow:0px 0px 10px gray;
}

table{
    width:100%;
    border-collapse:collapse;
}

th,td{
    border:1px solid black;
    padding:10px;
    text-align:center;
}

th{
    background:#007bff;
    color:white;
}

.spam{
    color:red;
    font-weight:bold;
}

.safe{
    color:green;
    font-weight:bold;
}

.deleteBtn{
    background:red;
    color:white;
    padding:8px 12px;
    text-decoration:none;
    border-radius:5px;
}

.deleteBtn:hover{
    background:darkred;
}

.home{
    text-align:center;
}

.homeBtn{
    background:green;
    color:white;
    padding:10px 15px;
    text-decoration:none;
    border-radius:5px;
}

.homeBtn:hover{
    background:darkgreen;
}

h1{
    text-align:center;
}

.noRecord{
    text-align:center;
    color:red;
}

</style>

</head>
<body>

<div class="container">

<h1>Email History</h1>

<%
@SuppressWarnings("unchecked")
List<Email> list=(List<Email>)request.getAttribute("list");

if(list==null || list.isEmpty()){

%>

<h2 class="noRecord">

No Records Found

</h2>

<%

}

else{

%>

<table>

<tr>

<th>ID</th>
<th>Subject</th>
<th>Body</th>
<th>Score</th>
<th>Result</th>
<th>Date</th>
<th>Action</th>

</tr>

<%

for(Email email:list){

%>

<tr>

<td><%=email.getId()%></td>

<td><%=email.getSubject()%></td>

<td><%=email.getBody()%></td>

<td><%=email.getSpamScore()%></td>

<td>

<%

if(email.getResult().equals("SPAM")){

%>

<span class="spam">

SPAM

</span>

<%

}

else{

%>

<span class="safe">

NOT SPAM

</span>

<%

}

%>

</td>

<td><%=email.getAnalyzedAt()%></td>

<td>

<a class="deleteBtn"
href="DeleteServlet?id=<%=email.getId()%>"
onclick="return confirm('Delete this record?')">

Delete

</a>

</td>

</tr>

<%

}

%>

</table>

<%

}

%>

<br><br>

<div class="home">

<a class="homeBtn" href="index.jsp">

Back To Home

</a>

</div>

</div>

</body>
</html>