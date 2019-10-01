<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
   <%@ page import="com.model.Room" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>ROOM RESERVATION PAGE</h2>
Room:
<%Room room= (Room) request.getAttribute("room");
out.println(room);%>
<%String username=(String) request.getAttribute("username");
%>
<form action="RoomReservationServlet" method="post">
<input type="hidden" name="roomid" value="<%=room.getRoomId() %>"/><br>
<input type="hidden" name="roomname" value="<%=room.getRoomName() %>"/><br>
<input type="hidden" name="username" value="username"/><br>
Date*:<input type="date" name="resDate" required value="" placeholder="dd/mm/yyyy"/><br>
Start Time*:<input type="time"  name="startTime" required value="" placeholder="hh:mm"/><br>
End Time*:<input type="time" name="endTime" required value="" placeholder="hh:mm"/><br><br>
<input type="submit" name="" value="Reserve"/>
</form>
</body>
</html>