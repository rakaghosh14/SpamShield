<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>

<style>

body{
font-family:Arial;
background:#f2f2f2;
}

.container{

width:700px;
margin:auto;
background:white;
padding:30px;
margin-top:50px;
box-shadow:0px 0px 10px gray;

}

.spam{
color:red;
font-size:30px;
}

.safe{
color:green;
font-size:30px;
}

</style>

</head>
<body>

<div class="container">

<h1>Analysis Result</h1>

<h3>Subject:</h3>

<p>${subject}</p>

<h3>Body:</h3>

<p>${body}</p>

<h3>Spam Score:</h3>

<p>${score}</p>

<h3>Result:</h3>

<%
String result=(String)request.getAttribute("result");

if(result.equals("SPAM")){
%>

<div class="spam">

SPAM

</div>

<%
}
else{
%>

<div class="safe">

NOT SPAM

</div>

<%
}
%>

<br>

<a href="analyze.jsp">

Analyze Another Email

</a>

</div>

</body>
</html>