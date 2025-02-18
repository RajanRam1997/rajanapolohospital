<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.demo.Nurse"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nurse's Of Apolo Hospital</title>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h1 class="text-center">Nurse's Of Apolo Hospital</h1>
	<div><a href="addnurse.jsp" class="btn btn-primary">Add New Nurse</a></div>
	<div class="container">
		<%
		ArrayList<Nurse> list2 = null;
		//jdbc functionality 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("select * from nurse");
			ResultSet rs = pstmt.executeQuery();
			list2 = new ArrayList();

			while (rs.next()) {
				Nurse n1 = new Nurse();
				n1.setNurseid(rs.getInt(1));
				n1.setNursename(rs.getString(2));
				n1.setMobile(rs.getString(3));
				n1.setSalary(rs.getInt(4));
				list2.add(n1);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
		%>
		<table class='table' border=2>
			<tr>
				<th>Nurse ID</th>
				<th>Nurse Name</th>
				<th>Mobile</th>
				<th>Salary</th>
			</tr>
			<%
			for(Nurse n :list2) {
			%>
			<tr>
				<td><%=n.getNurseid()%></td>
				<td><%=n.getNursename()%></td>
				<td><%=n.getMobile()%></td>
				<td><%=n.getSalary()%></td>
				<td><a href="UpdateNurseServlet?nurseid=<%=n.getNurseid()%>" class='btn btn-primary'><img src="update.jpg" width="100px" height="100px"></a><a href="DeleteNurseServlet?nurseid=<%=n.getNurseid()%>" class='btn btn-danger'><img src="delete.jpg" width="100px" height="100px"></a></td>
			</tr>
			<%
			}
			%>
		</table>

	</div>
</body>
</html>