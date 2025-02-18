<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Appointment</title>
</head>
<body>
	<form action="BookAppointmentServlet" method="post">
		<label>Patient Name :</label>
		<input type="text" name="patientname">
		<select>
		
		
		<%
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root", "root");
		PreparedStatement pstmt=con.prepareStatement("select doctorname,specialization,fees from doctor");
		ResultSet rs = pstmt.executeQuery(); 
   		while(rs.next()){
   			out.println("<option>"+rs.getString(1)+ "-"+rs.getString(2)+ "-"+rs.getString(3)+"</option>");
   		}
   		//out.println("</select>");
   	}
   		catch(Exception s){
   			System.out.println(s);
   		}
		%>
		</select>
		<label>Doctor Name :</label>
		<input type="text" name="doctorname" required>
		<label>Appointment Date :</label>
		<input type="date" name="appointmentdate" required>
		<label>Appointment Time :</label>
		<input type="time" name="appointmenttime" required>
		<input type="submit" value="Book Appointment">
   		</form>
</body>
</html>