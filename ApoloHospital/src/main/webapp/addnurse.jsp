<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Nurse Registration</title>
</head>
<body>
	<form action="AddNurseServlet" method="post">
		<label>Nurse's Name</label>
		<input type="text" name="txtnursename">
		<label>Nurse's Mobile number</label>
		<input type="number" name="txtmodile">
		<label>Nurse's Salary</label>
		<input type="number" name="txtsalary">
		<input type="submit" value="Add Nurse">
	</form>
</body>
</html>