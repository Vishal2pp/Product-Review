<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
   
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
  <div align="center">
		<h3 style="color:red">Login</h3>
		<form action="/user/login" method="POST" modelAttribute="credentials">
		<table>
			<tr >
				<td>
					<div class="form-group">
					<label for="name" class="cols-sm-2 control-label">User Name</label>
					</div>
				</td>
				<td>
					<input type="text" name="userName" id="userName" class="form-control" value=${username}></input>
				</td>
				<td>
					<span id="spnUserName" style="color:red">${spanUserName}</span>
					
				</td>
			</tr>
			<tr>
				<td>
					<label for="name" class="cols-sm-2 control-label">Password</label>
				</td>
				<td>
					<input type="password" name="password" class="form-control" value=${password}></input>
				</td>
				<td>
					<span id="spnPassword" style="color:red">${spanPassword}</span>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Login">
				</td>
			</tr>
		</table>
		</form>
	</div>
</div>
<%
	System.out.println("test: "+request.getAttribute("spanUserName"));
%>
</body>
</html>