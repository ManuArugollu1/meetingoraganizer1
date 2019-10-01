<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="javascript">
function equalpass()
{
	var pswd=document.getElementById("password").value;
	var cpswd=document.getElementById("confpassword").value;
	if(pswd==cpswd)
		{
		alert("password and Confirm password must be equal");
		return true;
		}
	else
		return false;
}
</script>	
	
</head>
<style>

input[type=text], input[type=password], []input type=email]{
  width: 20%;
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
<body>
<h3 align="center">REGISTRATION PAGE</h3>

<form action="Registrationact" method="post" onsubmit="return equalpass()">
<table>

<tr>
<td>Name</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Mail Id*</td>
<td><input type="email" name="uname"  required  /></td>
</tr>
<tr>
<td>Password*</td>
<td><input type="password" name="password" id="password" required /></td>
</tr>
<tr>
<td>Confirm Password*</td>
<td><input type="password" name="confpassword" id="confpassword" required /></td>
</tr>
<tr>
<td>Mobile Number*</td>
<td><input type="text" name="mobile"   required /></td>
</tr>
<tr>
<td colspan=2 align="center"><input type="submit" value="Register"/></td>
</tr>
</table>
</form>
<% String message=(String) request.getAttribute("errorMessage");
if(message!=null) out.println(message);%><br>
</body>
</html>