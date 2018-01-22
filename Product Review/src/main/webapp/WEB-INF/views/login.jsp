<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style/style.css" />
<title>Insert title here</title>
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="/review/">Product Review And Rating</a>
					</h1>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					<li><a href="/review/">Home</a></li>
					<li><a href="examples.html">Examples</a></li>
					<li><a href="page.html">A Page</a></li>
					<li><a href="/review/register">Register</a></li>
					<li class="selected"><a href="/review/login">Login</a></li>
				</ul>
			</div>
		</div>
		<div id="content_header"></div>
		<div id="site_content">
			<center>
				<form name="loginForm" method="post" action="/review/dologin">
					<table width="20%" bgcolor="0099CC" align="center">

						<tr>
							<td colspan=2><center>
									<font size=4><b>Login</b></font>
								</center></td>
						</tr>

						<tr>
							<td>Username:</td>
							<td><input type="text" size=25 name="userid"></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><input type="Password" size=25 name="pwd"></td>
						</tr>

						<tr>
							<td></td>
							<td><center>
									<input type="submit" value="Login">&nbsp &nbsp &nbsp &nbsp<input
										type="Reset">
								</center></td>
						</tr>

					</table><h3><font color="red">${msg}</font></h3>
				</form>
			</center>
			<div id="content"></div>
			<div id="content_footer"></div>
			<div id="footer">
				<p></p>
			</div>
		</div>
	</div>
</body>
</html>