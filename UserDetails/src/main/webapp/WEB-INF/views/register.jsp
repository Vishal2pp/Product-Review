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
  
</head>

<body style="height:1500px">

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/in/home1">Home</a></li>
      <li><a href="#">Categories</a></li>
      <li><a href="/in/loginUser">Login</a></li>
      <li><a href="/in/register">Register</a></li>
    </ul>
  </div>
</nav>
  
<div class="container" style="margin-top:50px">
  <div align="center">
		<h3 style="color:red">Register</h3>
		<form action="/in/registerUser" method="POST" modelAttribute="registerCredentials">
		<table>
			<tr >
				<td>
					<label for="name" class="cols-sm-2 control-label">Name:</label>
				</td>
				<td>
					<input type="text" name="name" class="form-control" value=${name}></input>
				</td>
				<td>
					<span style="color:red">${nameError}</span>
				</td>
			</tr>
			<tr >
				<td>
					<label for="name" class="cols-sm-2 control-label">User Name:</label>
				</td>
				<td>
					<input type="text" name="userName" class="form-control" value=${userName}></input>
				</td>
				<td>
					<span style="color:red">${userNameError}</span>
				</td>
			</tr>
			<tr>
				<td>
					<label for="name" class="cols-sm-2 control-label">Password:</label>
				</td>
				<td>
					<input type="password" name="password" class="form-control"/>
				</td>
				<td>
					<span style="color:red">${passwordError}</span>
				</td>
			</tr>
			<tr>
				<td>
					<label for="name" class="cols-sm-2 control-label">Re-Password:</label>
				</td>
				<td>
					<input type="password" name="confirmPassword" class="form-control"/>
				</td>
				<td>
					<span style="color:red"></span>
				</td>
			</tr>
			<tr >
				<td>
					<label for="name" class="cols-sm-2 control-label">Email:</label>
				</td>
				<td>
					<input type="text" name="email" class="form-control"/>
				</td>
				<td>
					<span></span>
				</td>
			</tr>
			<tr >
				<td>
					<label for="name" class="cols-sm-2 control-label">Mobile:</label>
				</td>
				<td>
					<input type="text" name="mobile" class="form-control"/>
				</td>
				<td>
					<span></span>
				</td>
			</tr>
			<tr >
				<td>
					<label for="name" class="cols-sm-2 control-label">Gender:</label>
				</td>
				<td>
					<input type="text" name="gender" class="form-control"/>
				</td>
				<td>
					<span></span>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Register">
				</td>
			</tr>
		</table>
		</form>
	</div>
</div>
</body>
</html>