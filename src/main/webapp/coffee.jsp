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
<form action="coffee" method="post">
<table>
	
	<tr>
		<td> Coffee Name: </td>
		<td> <input type="text" name="coffeeName" /> </td>
	</tr>
	<tr>
		<td> Description : </td>
		<td> <input type="text" name="description" /> </td>
	</tr>
	<tr>
		<td> Total Serving : </td>
		<td> <input type="text" name="totalServing" /> </td>
	</tr>
	<tr>
		<td> &nbsp; </td>
		<td> <input type="submit" value="Add" /> </td>
	</tr>
</table>
</form>

</body>
</html>