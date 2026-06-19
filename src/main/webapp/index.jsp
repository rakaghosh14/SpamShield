<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpamShield Home</title>

<style>

body{
    background:#f2f2f2;
    font-family:Arial;
}

.container{
    width:80%;
    margin:auto;
    text-align:center;
    margin-top:80px;
}

h1{
    font-size:50px;
    color:#333;
}

.card-container{
    display:flex;
    justify-content:center;
    gap:40px;
    margin-top:60px;
}

.card{
    width:250px;
    padding:40px;
    border-radius:15px;
    color:white;
    text-decoration:none;
    font-size:25px;
    box-shadow:0px 0px 15px gray;
    transition:0.3s;
}

.card:hover{
    transform:scale(1.05);
}

.analyze{
    background:#007bff;
}

.history{
    background:#dc3545;
}

.dashboard{
    background:#28a745;
}

</style>

</head>
<body>

<div class="container">

<h1>SpamShield</h1>

<h2>Email Spam Detection System</h2>

<div class="card-container">

<a href="analyze.jsp" class="card analyze">

<br><br>

Analyze Email

</a>

<a href="HistoryServlet" class="card history">

<br><br>

View History

</a>

<a href="DashboardServlet" class="card dashboard">

<br><br>

Dashboard

</a>

</div>

</div>

</body>
</html>