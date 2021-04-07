<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.ig.beans.Coffee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Place Order Form</h2>
<%List<Coffee> allCoffeeList = (List<Coffee>) request.getAttribute("allCoffeeList"); %>
<form action="order" method="post">
<table>
	
	<tr>
		<td> Customer Name :  </td>
		<td> <input type="text" name="customerName" /> </td>
	</tr>
	<tr>
		<td> Phone Number : </td>
		<td> <input type="text" name="phoneNumber" /> </td>
	</tr>
	<tr>
		<td> Coffee List</td>
		<td> <input type="text" name="totalServing" /> </td>
	</tr>
	<% for(Coffee coffee: allCoffeeList){  %>
	<tr>
	<td><%= coffee.getCoffeenName() %></td>
	<td><%= coffee.getDescription() %></td>
	<td><%= coffee.getTotalServing() %></td>
	</tr>
	<% } %>
	
	<tr>
		<td> &nbsp; </td>
		<td> <input type="submit" value="Place Order" /> </td>
	</tr>
</table>
</form>

</body>
</html>