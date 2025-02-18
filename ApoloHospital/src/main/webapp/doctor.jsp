<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<%@ page import= "com.demo.Doctor" %> 
<%@ page import= "java.sql.*" %> 
<%@ page import= "java.util.ArrayList" %> 
 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Doctor's of Apolo Hospital</title> 
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'> 
</head> 
<body> 
 <jsp:include page="header.jsp"></jsp:include> 
  
 <h1 class="text-center">Doctor's Of Apolo Hospital</h1>
 <div><a href="adddoctor.jsp" class="btn btn-primary">Add New Doctor</a></div> 
 
 <div class="container"> 
  <% 
   ArrayList<Doctor> list1=null; 
   //jdbc functionality 
   try { 
   Class.forName("com.mysql.cj.jdbc.Driver"); 
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root"); 
   PreparedStatement pstmt=con.prepareStatement("select * from doctor"); 
   ResultSet rs = pstmt.executeQuery(); 
   list1 = new ArrayList(); 
    
   while(rs.next()) { 
    Doctor d1=new Doctor(); 
    d1.setDoctorid(rs.getInt(1)); 
    d1.setDoctorname(rs.getString(2)); 
    d1.setSpecialization(rs.getString(3)); 
    d1.setMobile(rs.getString(4)); 
    d1.setFees(rs.getInt(5)); 
    list1.add(d1); 
   } 
   } 
  catch(Exception e) { 
   System.out.println(e); 
  } 
   %> 
   <table class='table' border=2> 
   <tr> 
    <th>Doctor ID</th> 
    <th>Doctor Name</th> 
    <th>Specialization</th> 
    <th>Mobile</th> 
    <th>Fees</th> 
   </tr> 
   <% 
   for(Doctor d : list1) { 
   %> 
   <tr> 
   <td> <%=d.getDoctorid()%> </td> 
   <td> <%=d.getDoctorname() %></td> 
   <td> <%=d.getSpecialization() %></td> 
   <td> <%=d.getMobile() %></td> 
   <td> <%=d.getFees() %></td> 
   <td><a href="UpdateDoctorServlet?doctorid=<%=d.getDoctorid()%>" class='btn btn-primary'>
   <img src='update.jpg' width="100px" height="100px"></a>
   <a href="DeleteDoctorServlet?doctorid=<%=d.getDoctorid()%>" class='btn btn-danger'>
   <img src="delete.jpg" width="100px" height="100px"></a></td>
   </tr> 
   <% 
   } 
   %> 
      </table> 
   
 </div> 
</body> 
</html>