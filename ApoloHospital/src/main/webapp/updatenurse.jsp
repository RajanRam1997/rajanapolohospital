<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Nurse</title>
</head>
<body>
	<form action="UpdateNurseServlet" method="post">
		<label>Nurse Id :</label>
		<input type="text" name="nurseid"><br><br>
		<label>Nures's Name :</label>
		<input type="text" name="nursename"><br><br>
		<label>Nurse's Mobile :</label>
		<input type="number" name="mobile"><br><br>
		<label>Nurse's Salary :</label>
		<input type="text" name="salary"><br><br>
		<input type="submit" value="update">
	</form>
</body>
</html>