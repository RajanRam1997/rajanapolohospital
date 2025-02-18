<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Doctor</title>
</head>
<body>
	<form action="UpdateDoctorServlet" method="post">
		<label>Doctor Id :</label>
		<input type="text" name="doctorid"><br><br>
		<label>Doctor's Name :</label>
		<input type="text" name="doctorname"><br><br>
		<label>Doctor's Specialization :</label>
		<input type="text" name="specialization"><br><br>
		<label>Doctor's Mobile :</label>
		<input type="number" name="mobile"><br><br>
		<label>Doctor's Fees :</label>
		<input type="number" name="fees"><br><br>
		<input type="submit" value="update">
	</form>
</body>
</html>