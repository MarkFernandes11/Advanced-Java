<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="Stylesheet" type= "text/css" href="StyleSheet.css">
</head>
<body>
	<header>
		<h1>Bridgelabz Registration Page</h1>	
		<!-- <marquee><h1>Bridgelabz Login Page</h1></marquee> -->
	</header>
	
	<form class="registration" action = "login" method = "post">
		<div>
			Name : <input type = "text" name = "Name" placeholder = "Enter your name">
			<br><br>
			E-mail Address : <input type = "email" name = "email" placeholder = "Enter your email">
			<br><br>
			Password : <input type = "password" name = "password" placeholder = "Enter your password">						
			<br><br>
			Re- type Password : <input type = "password" name = "password2" placeholder = "Enter your password">
			<br><br>	
			Submit : <input type = "submit" name ="submit" value = "register">
			<br><br>
		</div>
	</form>
	
	
</body>
</html>