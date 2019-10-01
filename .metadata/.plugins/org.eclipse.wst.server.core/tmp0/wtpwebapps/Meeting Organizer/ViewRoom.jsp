<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="com.model.Room" %>
    <%@ page import="java.util.List" %>
        <%@ page import="com.service.RoomServiceImpl" %>
         <%@ page import="com.service.RoomService" %>
         <%@include file="AdminCSSMenu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% RoomService roomService=new RoomServiceImpl();
 List<Room> rooms=roomService.findAll();
%>
<br>
<table border=1 align="center">
<tr>
<th>Room Id</th>
<th>Room Name</th>
<th>Floor</th>
<th>Room Incharge</th>
<th>Capacity</th>
<th>Status</th>
</tr>
<% for (Room room: rooms )
{
	out.println("<tr>");
	out.println("<td>"+room.getRoomId()+"</td>");
	out.println("<td>"+room.getRoomName()+"</td>");
	out.println("<td>"+room.getFloor()+"</td>");
	out.println("<td>"+room.getRoomIncharge()+"</td>");
	out.println("<td>"+room.getCapacity()+"</td>");
	out.println("<td>"+room.getStatus()+"</td>");
	out.println("</tr>");
	
}%>
</table>
</body>
</html>