<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.demo.Technician"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h1 class="text-center">Technician of apolo Hospital</h1>
	<div><a href="addtechnician.jsp" class="btn btn-primary">Add New Technician</a></div>
	<div class="container">
	<%
	ArrayList<Technician> list3=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root", "root");
		PreparedStatement pstmt=con.prepareStatement("select * from technician");
		ResultSet rs=pstmt.executeQuery();
		list3=new ArrayList();
		
		while(rs.next()){
			Technician t1=new Technician();
			t1.setTechnicianid(rs.getInt(1));
			t1.setTechnicianname(rs.getString(2));
			t1.setMachineoperator(rs.getString(3));
			t1.setMobile(rs.getString(4));
			t1.setSalary(rs.getInt(5));
			list3.add(t1);
		}
	}
	catch(Exception e3){
		System.out.println(e3);
	}
	%>
	<table class='table' border=2>
			<tr>
				<th>Technician ID</th>
				<th>Technician Name</th>
				<th>Technician MachineOperator</th>
				<th>Technician Mobile</th>
				<th>Technician Salary</th>
				
			</tr>
			<%
			for(Technician t :list3) {
			%>
			<tr>
				<td><%=t.getTechnicianid()%></td>
				<td><%=t.getTechnicianname()%></td>
				<td><%=t.getMachineoperator()%></td>
				<td><%=t.getMobile()%></td>
				<td><%=t.getSalary()%></td>
				<td><a href="UpdateTechnicianServlet?technicianid=<%=t.getTechnicianid()%>" class='btn btn-primary'><img src="update.jpg" width="100px" height="100px"></a><a href="DeleteTechnicianSevlet?technicianid=<%=t.getTechnicianid()%>" class='btn btn-danger'><img src="delete.jpg" width="100px" height="100px"></a></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>