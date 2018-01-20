<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- MenuBar Styling -->
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <!-- MenuBar Styling -->
 
 <!-- Search box styling -->
 <style>
 	form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 1px solid grey;
    float: left;
    width: 80%;
    background: #f1f1f1;
}

form.example button {
    float: left;
    width: 10%;
    padding: 10px;
    background: #000000;
    color: white;
    font-size: 17px;
    border: 1px solid grey;
    border-left: none;
    cursor: pointer;
}

form.example button:hover {
    background: #0b7dda;
}

form.example::after {
    content: "";
    clear: both;
    display: table;
}
 </style>
 <!-- Search box styling -->
</head>
<body style="height:1500px">

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/in/home1">Home</a></li>
      <li><a href="/user/home1">Categories</a></li>
      <li><a href="/user/loginUser">Login</a></li>
      <li><a href="/user/register">Register</a></li>
    </ul>
  </div>
</nav>


<div class="container" style="margin-top:50px">
<h3> </h3>
  <div>
<form class="example" action="/action_page.php">
  		<input type="text" placeholder="Search.." name="search">
  		<button type="submit"><i class="fa fa-search">Search</i></button>
	</form>
</div>
<h3>Fixed Navbar</h3>
  <div class="row">
    <div class="col-md-4">
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>    
    </div>
    <div class="col-md-4"> 
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
    </div>
    <div class="col-md-4"> 
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p> 
    </div>
  </div>
</div>

<h1>Scroll this page to see the effect</h1>

</body>

</html>