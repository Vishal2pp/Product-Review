<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/addUser" modelAttribute="user" method="POST">
<table>
<tr><td>Enter User Name-</td><td><input type="text" name="userName"></td></tr>
<tr><td>Enter User Password-</td><td><input type="password" name="userPass"></td></tr>
<tr><td>Enter User Email Id-</td><td><input type="text" name="emailId"></td></tr>
<tr><td>Enter User Mobile-</td><td><input type="text" name="phoneNumber"></td></tr>
<tr><td><font color="red">${msg}</font></td><td><input type="submit" value="Add User"></td></tr>
</table>
</form>
</body>
</html>