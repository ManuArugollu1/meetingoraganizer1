<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.model.MOrganizer" %>
    <%@ page import="java.util.List" %>
        <%@ page import="com.service.MOrganizerServiceImpl" %>
        <%@ page import="com.service.MOrganizerService"%>
        <%@ include file="AdminCSSMenu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>
<% MOrganizerService orgService=new MOrganizerServiceImpl();
List<MOrganizer> users=orgService.findAll();

%>
<br>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Mobile Number</th>
</tr>
<% for (MOrganizer org: users)
{
	out.println("<tr>");
	out.println("<td>"+org.getId()+"</td>");
	out.println("<td>"+org.getName()+"</td>");
	out.println("<td>"+org.getUserName()+"</td>");
	out.println("<td>"+org.getPassword()+"</td>");
	out.println("<td>"+org.getMobileNumber()+"</td>");
	out.println("</tr>");
	
}%>
</table>
</body>
</html>