<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	<header>
			<h1>Bridgelabz Login Page</h1>
	</header>
	
	<h3>${successMessage}</h3>
	<h3>${failureMessage}</h3>
	
	<form action="LoginServlet" method = "post">
		<br>
		<input type = "email" placeholder = "Enter email address" name="username">
		<br><br>
		<input type = "password" placeholder = "Enter password" name="password">
		<br><br>
		<input class="buttonSub" type = "submit" value = "Login">  <input class="button" type="reset" value = "clear">
		<br><br>
		<a href="register.jsp">Register new user</a>
		<br><br>
		<a href="forgetPassword.jsp">Forget Password</a>
		<br><br>
		<a href="delete.jsp">Delete user Details</a>
		<br><br>
	</form>
</body>
</html>