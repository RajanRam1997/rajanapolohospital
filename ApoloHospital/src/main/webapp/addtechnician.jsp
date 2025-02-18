<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Technician Registration</title>
</head>
<body>
	<form action="AddTechnicianServlet" method="post">
		<label>Technician Name</label>
		<input type="text" name="txttechnicianname">
		<label>Technician MachineOperator</label>
		<input type="text" name="txtmachineoperator">
		<label>Technician Mobile number</label>
		<input type="number" name="txtmodile">
		<label>Nurse's Salary</label>
		<input type="number" name="txtsalary">
		<input type="submit" value="Add Technician">
	</form>
</body>
</html>