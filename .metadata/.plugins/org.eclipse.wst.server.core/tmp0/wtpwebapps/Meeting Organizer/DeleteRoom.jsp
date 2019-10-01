<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Deletion of Rooms</h3>
<form action="DeleteRoomServlet" method="post">
<table>
<tr>
<td>Room Id*:</td><td><input type="number" name="roomid"  required /></td>
</tr>
<tr>
<td>Room Name:</td>
<td><input type="text" name="roomname"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete Room"/></td>
</tr>
</table>
</form>
</body>
</html>