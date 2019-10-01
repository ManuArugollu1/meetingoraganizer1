<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<style>
body {
	background-color: #f0fff0;
	background-image: url("ghi.jpg");
}

form {
	background-color: #f0fff0;
	background-image: url("ghi.jpg");
}

input[type=text], input[type=password] {
	width: 85%;
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
	width: 30%;
}
</style>
<h3 align="center">LOGIN</h3>
<body>


	<form action="AdminLoginact" method="post">
		<table align="center">
			<tr>
				<td>UserName*</td>
				<td><input type="text" name="uname" required /></td>
			</tr>
			<tr>
				<td>Password*</td>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit" value="Login" /></td>
			</tr>
		</table>
		<%
			String message = (String) request.getAttribute("errorMessage");
			if (message != null)
				out.println(message);
		%><br>


	</form>
</body>
</html>