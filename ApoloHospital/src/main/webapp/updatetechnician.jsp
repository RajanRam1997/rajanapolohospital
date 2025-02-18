<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Technician</title>
</head>
<body>
<form action="UpdateTechnicianServlet" method="post">
		<label>Technician Id :</label>
		<input type="text" name="technicianid"><br><br>
		<label>Technician Name :</label>
		<input type="text" name="technicianname"><br><br>
		<label>Technician MachineOperator</label>
		<input type="text" name="machineoperator"><br><br>
		<label>Technician Mobile :</label>
		<input type="number" name="mobile"><br><br>
		<label>Technician Salary :</label>
		<input type="text" name="salary"><br><br>
		<input type="submit" value="update">
	</form>
</body>
</html>