<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<form action="SearchRoomServlet" method="post" onclick="return checkfunct()">
<table>
<tr>
<td>Search Criteria</td>
<td><select name="search">

<option value="roomid">Room Id</option>
<option value="roomname">Room Name</option>
</select></td>
<tr>
<td>Value</td>
<td><input type="text" name="room" id="room" placeholder="Enter room id or roomname"/></td>
</tr>

<tr>
<td colspan="2" align="center"> <input type="submit" name="" value="Search"/></td>
</tr>
</table>
</form>

</body>
</html>