<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="AdminCSSMenu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Status</title>
</head>
<body>
<form action="UpdateRoomStatusServlet" method="post">
Room Id*: <input type="text" name="roomid" required placeholder="Enter Room Id"/><br>
Room Name*:<input type="text" name="roomname" required  placeholder="Enter Room Name"/><br>
Status*:<select name="status" required>
<option value="null"></option>
<option value="available">Available</option>
<option value="Not Available">Not Available</option>
<option value="reserved">Room Already Reserved</option>
</select><br><br>
<input type="submit" value="Update Status"/>
<br></form>
</body>
</html>