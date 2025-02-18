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

@WebServlet("/DeleteDoctorServlet")
public class DeleteDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteDoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int DoctorId=Integer.parseInt(request.getParameter("doctorid"));
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root");
			PreparedStatement pstmt=con.prepareStatement("delete from doctor where doctorid=?");
			pstmt.setInt(1,DoctorId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("doctor.jsp");
			rd.forward(request,response);
		} 
		catch(Exception e6) { 
		System.out.println(e6); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
