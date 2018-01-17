<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome ${user.userName}...</h1>
<a href="/user/showAddUser"><button>Add User</button></a>
<a href="/user/showRemoveUser"><button>Remove User</button></a>
<a href="/user/showUpdateUser"><button>Update User</button></a>
</body>
</html>