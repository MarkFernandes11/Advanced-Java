<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	
	<header>
			<h1>Bridgelabz Registration Page</h1>
	</header>
	<form action="RegistrationServlet" method = "post">
		<br>
		<input type="text" placeholder="Enter firstname" name="firstname" required>
		<!--pattern="^A-Za-z$"-->
		<br><br>
		<input type="text" placeholder="Enter lastname" name="lastname">
		<br><br>
		<input type="email" placeholder="Enter email" name="email" required>
		<br><br>
		<input type="number" placeholder="Enter contact number" name="contactNumber" required>
		<br><br>
		<input type="password" placeholder="Enter password" name="password" required>
		<br><br>
		<input type="password" placeholder="Enter confirm password" name="confirmPassword" required>
		<br><br>
		<input class="buttonSub" type="submit" value = "submit"> <input class="button" type="reset" value = "clear">
		<br><br>
		<a href="login.jsp">Login Page</a> 
	</form>
		
</body>
</html>