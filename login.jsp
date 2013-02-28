<%@ page language = "java" %>
<%@ page contentType = "TEXT/HTML" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
	<form method="post" action="createCustomer">
		<table>
			<tr><td align="right">Brugernavn:</td>jkljklkjklklkjkl<td><input type="text" name="customerName"/></td></tr>
			<tr><td align="right">Kodeord:</td> <td><input type="password" name="customerPass"/></td></tr>
			<tr><td align="right">Gentag kodeord:</td><td><input type="password" name="passCheck"/></td></tr>
			<tr><td/><td><input type="submit" value="Opret bruger"></td></tr>
			<% 
				System.out.println(request.getParameter("error"));	
				if (request.getParameter("error") != null && request.getParameter("error").equalsIgnoreCase("yes")){ %> 
					<tr><td colspan="2" align="center" color="red">Ugyldige indtastninger</td></tr>
				<% } %>
			
		</table>
	</form>
</body>
</html>
