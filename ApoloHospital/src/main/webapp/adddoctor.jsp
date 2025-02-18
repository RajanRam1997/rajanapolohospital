<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Doctor Registration</title>
</head>
<body>
	<form action="AddDoctorServlet" method="post">
		<label>Doctor's Name</label>
		<input type="text" name="txtdoctorname">
		<label>Docto's Specialization</label>
		<input type="text" name="txtdoctorspecialization">
		<label>Doctor's Mobile number</label>
		<input type="number" name="txtmodile">
		<label>Doctor's Fees</label>
		<input type="number" name="txtfees">
		<input type="submit" value="Add Doctor">
	</form>
</body>
</html>