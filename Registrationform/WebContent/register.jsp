<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to register page</title>
</head>
<body>
<form action="Registercontroller" method="post">

<table align="center" border="1">
<tr>

<tr>
	<td>First Name</td>
	<td><input name="firstname" ></td>
</tr>

<tr>
	<td>Last Name</td>
	<td><input name="lastname" ></td>
</tr>

<tr>
	<td>City</td>
	<td><input name="city" ></td>
</tr>

<tr>
	<td>Mobile</td>
	<td><input name="mobile"  maxlength="10"></td>
</tr>

<tr>
	<td>Email</td>
	<td><input type="email" name="email" ></td>
</tr>

<tr>
	<td>D.O.B</td>
	<td><input type="date" name="dob" ></td>
</tr>

<tr>
	<td>Aadhar NO</td>
	<td><input name="aadhar"  maxlength="12"></td>
</tr>

<tr>
	<td>Gender</td>
	<td>
	<select name="gender" >
	<option value ="">select</option>
	<option value ="male">Male</option>
	<option value ="female">Female</option>
	</select>
	</td>
</tr>

<tr>
	<td>State</td>
	<td>
	<select name="state" >
	<option value ="">select</option>
	<option value ="maharashtra">Maharashtra</option>
	<option value ="delhi">Delhi</option>
	<option value ="uttar pradesh">Uttar pradesh</option>
	<option value ="west bengal">West bengal</option>
	<option value ="punjab">Punjab</option>
	<option value ="andhra pradesh">Andhra pradesh</option>
	<option value ="tamilnadu">Tamilnadu</option>
	<option value ="Goa">Goa</option>
	<option value ="kerala">Kerala</option>
	<option value ="madhya pradesh">Madhya pradesh</option>
	<option value ="telangana">Telangana</option>
	</select>
	</td>
</tr>
<tr>
	<td>password</td>
	<td><input type="password" name="password" ></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="save" name="submit" ></td>
</tr>
</tr>
</table>
</form>
</body>
</html>