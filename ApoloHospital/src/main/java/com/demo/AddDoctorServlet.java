package com.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/AddDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddDoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dn=request.getParameter("txtdoctorname");
		String ds=request.getParameter("txtdoctorspecialization");
		String dm=request.getParameter("txtmodile");
		int fees=Integer.parseInt(request.getParameter("txtfees"));
		
		
		  try { 
			   Class.forName("com.mysql.cj.jdbc.Driver"); 
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root"); 
			   PreparedStatement pstmt=con.prepareStatement("insert into doctor(doctorname,specialization,mobile,fees)values(?,?,?,?)");
			   pstmt.setString(1,dn);
			   pstmt.setString(2,ds);
			   pstmt.setString(3,dm);
			   pstmt.setInt(4,fees);
			   pstmt.executeUpdate();
			   RequestDispatcher rd=request.getRequestDispatcher("doctor.jsp");
			   
			   rd.forward(request,response);
		  }
		  catch(Exception e4){
			  System.out.println(e4);
		  }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
