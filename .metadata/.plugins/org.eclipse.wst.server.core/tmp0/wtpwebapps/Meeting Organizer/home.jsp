<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<%@ page import="java.util.List"%>
<%@ page import="com.model.ReserveRoom"%>
<%@ page import="com.service.ReserveRoomServiceImpl"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome :<%=request.getParameter("uname")%><br> Hai!!!!!<%
	out.print(request.getParameter("uname"));
%>
<%= session.getAttribute("username")%>
<br>
	<table border=1,cellpadding=0>
	<tr>
	
	<th>RoomId</th>

	<th>Date Of Reservation</th>
	<th>Start Time</th>
	<th>End Time</th>
	<th>Status</th>
	</tr>
		<%
			List<ReserveRoom> resList = (List<ReserveRoom>) request.getAttribute("resList");
		%>
		<%
			for (ReserveRoom rlist : resList) {
				out.println("<tr>");
				out.println("<td>" + rlist.getRoomId() + "</td>");
			
				
				out.println("<td>" + rlist.getResDate() + "</td>");
				out.println("<td>" + rlist.getStartTime() + "</td>");
				out.println("<td>" + rlist.getEndTime() + "</td>");
				out.println("<td>" + rlist.getStatus() + "</td>");

			}
		%>
	</table>
	<form method="post" action="SearchRoomServlet">
	<input type="hidden" name="userName" value="<%=session.getAttribute("userid")%>"/>
	<input type="submit" value="SearchRoom"/>
	</form>
	<br>
	<a href="SearchRoom.jsp">View rooms</a>
	<br>
	<a href="ViewRoom.jsp">View rooms</a>
	<br>
	<a href="AddRoom.jsp">Add Rooms</a>
	<br>
	<a href="DeleteRoom.jsp">Delete Rooms</a>
	<br>

	<a href="UpdateRoom.jsp">Update Rooms</a>
	<br>
</body>
</html>