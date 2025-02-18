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


@WebServlet("/DeleteTechnicianSevlet")
public class DeleteTechnicianSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteTechnicianSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int TechnicianId=Integer.parseInt(request.getParameter("technicianid"));
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root");
			PreparedStatement pstmt=con.prepareStatement("delete from technician where technicianid=?");
			pstmt.setInt(1,TechnicianId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("technician.jsp");
			rd.forward(request,response);
		} 
		catch(Exception e8) { 
		System.out.println(e8); 
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
