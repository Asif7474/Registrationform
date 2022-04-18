<%@page import="java.util.Iterator"%>
<%@page import="com.LoginBean.Bean"%>
<%@page import="com.Dao.Daoimpl"%>
<%@page import="com.Dao.Dao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<script type="text/javascript">
function update(userid,firstname,lastname,city,mobile,email,dob,aadhar,gender,state,password){
	document.getElementById('userid').value		=	userid;
	document.getElementById('firstname').value	=	firstname;
	document.getElementById('lastname').value	=	lastname;
	document.getElementById('city').value		=	city;
	document.getElementById('mobile').value		=	mobile;
	document.getElementById('email').value		=	email;
	document.getElementById('dob').value		=	dob;
	document.getElementById('aadhar').value		=	aadhar;
	document.getElementById('gender').value		=	gender;
	document.getElementById('state').value		=	state;
	document.getElementById('password').value	=	password;
	document.getElementById('submit').value		=	"update";
	document.getElementById('submit').innerHTML	=	"update";
	
}
</script>
</head>
<body>
<form action="InsertController" method="post">
<table align="center" border="1">
<tr>
	<td>UserId</td>
	<td><input type="number" name="userid" id="userid" readonly="readonly"></td>
</tr>
<tr>
	<td>First Name</td>
	<td><input name="firstname" id="firstname"></td>
</tr>

<tr>
	<td>Last Name</td>
	<td><input name="lastname" id="lastname"></td>
</tr>

<tr>
	<td>City</td>
	<td><input name="city" id="city"></td>
</tr>

<tr>
	<td>Mobile</td>
	<td><input name="mobile" id="mobile" maxlength="10"></td>
</tr>

<tr>
	<td>Email</td>
	<td><input type="email" name="email" id="email"></td>
</tr>

<tr>
	<td>D.O.B</td>
	<td><input type="date" name="dob" id="dob"></td>
</tr>

<tr>
	<td>Aadhar NO</td>
	<td><input name="aadhar"  id="aadhar"maxlength="12"></td>
</tr>

<tr>
	<td>Gender</td>
	<td>
	<select name="gender" id="gender">
	<option value ="">select</option>
	<option value ="male">Male</option>
	<option value ="female">Female</option>
	</select>
	</td>
</tr>

<tr>
	<td>State</td>
	<td>
	<select name="state" id="state">
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
	<td><input type="password" name="password" id="password"></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="save" name="submit" id="submit"></td>
</tr>
</table >
<br>
<table border="1">
<tr>
<th>	UserId		</th>
<th>	First_name	</th>
<th>	Last_name	</th> 
<th>	City		</th>
<th>	Mobile		</th>
<th>	email		</th>
<th>	D.o.b		</th>
<th>	AadharCard 	</th>
<th>	Gender		</th>
<th>	State		</th>
<th>	Password	</th>
<th colspan="2" >Action</th>
</tr>
<% Dao dao=new Daoimpl();
   List<Bean>list=dao.fetch();
   Iterator itr=list.iterator();
   
   while(itr.hasNext()){
	   Bean bean=(Bean)itr.next();
%>
<tr>
<td><%=bean.getUserid()%></td>
<td><%=bean.getFirstname()%></td>
<td><%=bean.getLastname()%></td>
<td><%=bean.getCity()%></td>
<td><%=bean.getMobile()%></td>
<td><%=bean.getEmail() %></td>
<td><%=bean.getDob() %></td>
<td><%=bean.getAadhar()%></td>
<td><%=bean.getGender()%></td>
<td><%=bean.getState()%></td>
<td><%=bean.getPasssword()%></td>
<td><a href="#" onclick="update('<%=bean.getUserid()%>','<%=bean.getFirstname()%>','<%=bean.getLastname()%>','<%=bean.getCity()%>','<%=bean.getMobile()%>','<%=bean.getEmail()%>','<%=bean.getDob()%>','<%=bean.getAadhar()%>','<%=bean.getGender()%>','<%=bean.getState()%>','<%=bean.getPasssword()%>')">Update</a></td>
<td><a href="InsertController?userid=<%=bean.getUserid()%>">Delete</a></td>


</tr>
<%} %>
</table>
</form>
</body>
</html>