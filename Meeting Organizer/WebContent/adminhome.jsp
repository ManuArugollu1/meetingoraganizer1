<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.MOrganizer" %>
    <%@ page import="java.util.List" %>
        <%@ page import="com.service.MOrganizerServiceImpl" %>
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminHomePage </title>
</head>
<style>
body{
background-image:url("C:\Users\sgurajala\Downloads\meeting-rooms.jpeg");
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: #4CAF50;
}

li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}
.active {
  background-color: #4CAF50;
}

.dropdown-content a:hover {background-color: #f1f1f1;}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>





<body>
<ul>
  <li><a class="active" href="adminhome.jsp">Home</a></li>
  <li><a  href="AddRoom.jsp">Add Room</a></li>
  <li><a  href="UpdateRoomStatus.jsp">Update Room Status</a></li>
  <li><a  href="ViewRoom.jsp">View Rooms</a></li>
<li><a  href="ViewUsers.jsp">View Users</a></li>
  <li><a href="Logout.jsp">Logout</a></li>
  
</ul>
</body>
</html>