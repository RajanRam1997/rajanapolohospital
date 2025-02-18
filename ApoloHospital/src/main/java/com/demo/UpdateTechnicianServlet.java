package com.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@WebServlet("/UpdateTechnicianServlet")
public class UpdateTechnicianServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateTechnicianServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int TechnicianId=Integer.parseInt(request.getParameter("technicianid"));
		String TechnicianName=request.getParameter("technicianname");
		String MachineOperator=request.getParameter("machineoperator");
		String Mobile=request.getParameter("mobile");
		String Salary=request.getParameter("salary");
		PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital","root","root");
			PreparedStatement pstmt=con.prepareStatement("update technician set technicianname=?, machineoperator=?, mobile=?, salary=? where technicianid=?");
			pstmt.setString(1,TechnicianName);
			pstmt.setString(2,MachineOperator);
			pstmt.setString(3, Mobile);
			pstmt.setString(4,Salary);
			pstmt.setInt(5, TechnicianId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("updatetechnician.jsp");
			
			rd.forward(request,response);
		}
		catch(Exception e) {
			out.println(e);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
