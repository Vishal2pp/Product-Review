<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/user/removeUser" modelAttribute="u" method="POST">
<table>
<tr><td>Enter User Name to remove-</td><td><input type="text" name="userName"></td></tr>
<tr><td><font color="red">${msg}</font></td><td><input type="submit" value="Remove User"></td></tr>
</table>
</form>
</body>
</html>