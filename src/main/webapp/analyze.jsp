<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Analyze Email</title>

<style>

body{
background:#f2f2f2;
font-family:Arial;
}

.container{
width:60%;
margin:auto;
margin-top:50px;
background:white;
padding:30px;
border-radius:10px;
box-shadow:0px 0px 10px gray;
}

input,textarea{
width:100%;
padding:12px;
margin-top:10px;
margin-bottom:20px;
}

button{
background:#007bff;
color:white;
padding:15px 25px;
border:none;
border-radius:5px;
cursor:pointer;
}

</style>

</head>
<body>

<div class="container">

<h1>Email Analysis</h1>

<form action="AnalyzeEmailServlet" method="post">

Subject

<input type="text" name="subject" required>

Email Body

<textarea rows="8" name="body" required></textarea>

<button type="submit">

Analyze

</button>

</form>

<br>

<a href="index.jsp">

 Back To Home

</a>

</div>

</body>
</html>