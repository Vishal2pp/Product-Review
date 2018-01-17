<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<form action="/user/doLogin" modelAttribute="login" method="POST">
<table>
<tr><td>User Name-</td><td><input type="text" name="userName"></td></tr>
<tr><td>User Password-</td><td><input type="password" name="userPass"></td></tr>
<tr><td><font color="red">${msg}</font></td><td><input type="submit" value="Login"></td></tr>
</table>
</form>
</body>
</html>
