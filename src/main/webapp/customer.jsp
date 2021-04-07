<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> ADD CUSTOMER FORM</h2>
<form action="customer" method="post">
<table>
	
	<tr>
		<td> Customer Name: </td>
		<td> <input type="text" name="customerName" /> </td>
	</tr>
	<tr>
		<td> Phone Number: </td>
		<td> <input type="text" name="phoneNumber" /> </td>
	</tr>
	<tr>
		<td> &nbsp; </td>
		<td> <input type="submit" value="Add" /> </td>
	</tr>
</table>
</form>

</body>
</html>