<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bridgelabz Login Page</title>
<link rel="Stylesheet" type= "text/css" href="StyleSheet.css">
</head>
<body>
	<header>
	
		<h1>Bridgelabz Login Page</h1>	
		
		<!-- <marquee><h1>Bridgelabz Login Page</h1></marquee> -->
		
	</header>
	
	<form class="index" action = "login" method = "post">
		
			Username : <input type = "email" name = "email" placeholder = "Enter your email">
			<br><br>
			Password : <input type = "password" name = "password" placeholder = "Enter your password">
			<br><br>
			Submit : <input type = "submit" name ="submit" value = "login">
			<br><br>
			Register : <a href = "registration.jsp">Register as new user</a>
			<br><br>
			<!-- <input type = "submit" value = ""> -->
	</form>
	
	<br><br>
	${messageError}
	<br><br>
	${messagereg}
	
</body>
</html>