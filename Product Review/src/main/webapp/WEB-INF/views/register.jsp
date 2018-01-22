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
					<li class="selected"><a href="/review/register">Register</a></li>
					<li><a href="/review/login">Login</a></li>
				</ul>
			</div>
		</div>
		<div id="content_header"></div>
		<div id="site_content">
			<center>
				<form action="/review/doRegister" name="StudentRegistration"
					onsubmit="return(validate());" modelAttribute="reg" method="post">

					<table cellpadding="2" width="20%" bgcolor="99FFFF" align="center"
						cellspacing="2">

						<tr>
							<td colspan=2>
								<center>
									<font size=4><b>Registration</b></font>
								</center>
							</td>
						</tr>

						<tr>
							<td>Name</td>
							<td><input type=text name="uName" id="textname" size="30"></td>
						</tr>


						<tr>
							<td>Sex</td>
							<td><input type="radio" name="uGender" value="Male" size="10">Male
								<input type="radio" name="uGender" value="Female" size="10">Female</td>
						</tr>


						<tr>
							<td>EmailId</td>
							<td><input type="text" name="uEmail" id="emailid" size="30"></td>
						</tr>


						<tr>
							<td>MobileNo</td>
							<td><input type="text" name="uMobile" id="mobileno"
								size="30"></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="uPassword" id="uPassword"
								size="30"></td>
						</tr>
						<tr>
							<td><input type="reset"></td>
							<td colspan="2"><input type="submit" value="Register" /></td>
						</tr>
					</table>
				</form><h2>${regMsg}</h2>
			</center>
			<div id="content"></div>
		</div>
		<div id="content_footer"></div>
		<div id="footer">
			<p></p>
		</div>
	</div>
</body>
<script type="text/javascript">
	function validate() {
		if (document.StudentRegistration.textnames.value == "") {
			alert("Please provide your Name!");
			document.StudentRegistration.textnames.focus();
			return false;
		}

		if ((StudentRegistration.sex[0].checked == false)
				&& (StudentRegistration.sex[1].checked == false)) {
			alert("Please choose your Gender: Male or Female");
			return false;
		}

		var email = document.StudentRegistration.emailid.value;
		atpos = email.indexOf("@");
		dotpos = email.lastIndexOf(".");
		if (email == "" || atpos < 1 || (dotpos - atpos < 2)) {
			alert("Please enter correct email ID")
			document.StudentRegistration.emailid.focus();
			return false;
		}

		if (document.StudentRegistration.mobileno.value == ""
				|| isNaN(document.StudentRegistration.mobileno.value)
				|| document.StudentRegistration.mobileno.value.length != 10) {
			alert("Please provide a Mobile No in the format 123.");
			document.StudentRegistration.mobileno.focus();
			return false;
		}
		return (true);
	}
</script>
</html>