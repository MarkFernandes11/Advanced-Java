<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.login.User"%>
<%@page import="java.util.ListIterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	<table border="1px solid #000;">
		<tr>
			<th><b><p>First Name</p></b></th>
			<th><b><p>Last Name</p></b></th>
			<th><b><p>Email</p></b></th>
			<th><b><p>Password</p></b></th>
			<th><b><p>Contact Number</p></b></th>			 
		</tr>
		
		<%List<User> list = (ArrayList<User>)request.getAttribute("userlist");			
		
		if(list != null)	{
		
		for(User u : list)
			{
			%>
			<tr>
			<!-- <td colspan=3>User list </td> -->
				<td colspan="1"><% out.print(u.getFirstname());%></td>
				<td colspan="1"><% out.print(u.getLastname());%></td>
				<td colspan="1"><% out.print(u.getEmail());%></td>
				<td colspan="1"><% out.print(u.getPassword());%></td>
				<td colspan="1"><% out.print(u.getContactNumber());%></td>
			</tr>	
		<%		
			}
		}else{
		%>
		<tr>
			<td colspan=3>User list User list is empty
		</td>
		</tr>
		<%} %>
	</table>
</body>
</html>