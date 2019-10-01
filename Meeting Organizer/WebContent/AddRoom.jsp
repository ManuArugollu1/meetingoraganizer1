<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="AdminCSSMenu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<style>

input[type=text] {
  width:80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
select{
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
input[type=submit] {
background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 40%;
}

</style>

<body>
<h3 align="center">Add Rooms</h3>
<form action="AddRoomServlet" method="post">
<table>
<tr>
<td>Room Id*</td>
<td><input type="text"   name="roomid" placeholder="Enter Room Id" required value=""/></td>
</tr>
<tr>
<td>Room Name*</td>
<td><input type="text"  name="roomname" placeholder="Enter Room Name"  required  value=""/></td>
</tr>
<tr>
<td>Floor</td>
<td><select name="floor">
<option value="null"></option>

<option value="first">First</option>
<option value="second">Second</option>
<option value="third">Third</option>

</select></td>
</tr>
<tr>
<td>In-charge*</td>
<td><input type="text" name="incharge"  required value=""/></td>
</tr>
<tr>
<td>Capacity*</td>
<td><input type="text" name="capacity"  required  value=""/></td>
</tr>
<tr>
<td>Status</td>
<td><select name="status" required>
<option value="null"></option>
<option value="available">Available</option>
<option value="Not Available">Not Available</option>
<option value="reserved">Room Already Reserved</option>
</select>
</td>
</tr>
<tr>
<td colspan=2 align="center"><input type="submit" name="" value="Add Room"/></td>
</tr>

</table>
</form>
</body>

</html>