<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.data.User"%>
<%@page import="java.util.ListIterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>

	<form action="DatabaseData"> 
	<table border="1px solid #000;">
		<tr>
			<th><b>Name</b></th>
			<th><b>Email</b></th>
			<th><b>Contact Number</b></th> 
		</tr>
		
		<%List<User> list = (ArrayList<User>)request.getAttribute("userlist");			
		
		if(list != null)	{
		
		for(User u : list)
			{
			%>
			<tr>
			<!-- <td colspan=3>User list </td> -->
				<td colspan="1"><% out.print(u.getName());%></td>
				<td colspan="1"><% out.print(u.getEmail());%></td>
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
	</form>
</body>
</html>