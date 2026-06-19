<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<style>

body{
background:#f2f2f2;
font-family:Arial;
}

.container{
width:90%;
margin:auto;
margin-top:50px;
}

.card{
width:25%;
display:inline-block;
padding:30px;
margin:20px;
color:white;
font-size:25px;
text-align:center;
border-radius:10px;
}

.total{
background:#007bff;
}

.spam{
background:red;
}

.safe{
background:green;
}

a{
text-decoration:none;
padding:12px 20px;
background:black;
color:white;
border-radius:5px;
}

</style>

</head>
<body>

<div class="container">

<h1 align="center">

SpamShield Dashboard

</h1>

<div class="card total">

Total Emails

<br><br>

${total}

</div>

<div class="card spam">

Spam Emails

<br><br>

${spam}

</div>

<div class="card safe">

Safe Emails

<br><br>

${safe}

</div>

<br><br>

<a href="index.jsp">

Home

</a>

</div>

</body>
</html>