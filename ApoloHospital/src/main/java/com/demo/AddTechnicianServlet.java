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


@WebServlet("/AddTechnicianServlet")
public class AddTechnicianServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public AddTechnicianServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tn=request.getParameter("txttechnicianname");
		String tm=request.getParameter("txtmachineoperator");
		String m=request.getParameter("txtmodile");
		int s=Integer.parseInt(request.getParameter("txtsalary"));
		
		
		  try { 
			   Class.forName("com.mysql.cj.jdbc.Driver"); 
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root"); 
			   PreparedStatement pstmt=con.prepareStatement("insert into technician(technicianname,machineoperator,mobile,salary)values(?,?,?,?)");
			   pstmt.setString(1,tn);
			   pstmt.setString(2,tm);
			   pstmt.setString(3,m);
			   pstmt.setInt(4, s);
			   pstmt.executeUpdate();
			   RequestDispatcher rd=request.getRequestDispatcher("technician.jsp");
			   
			   rd.forward(request,response);
		  }
		  catch(Exception e5){
			  System.out.println(e5);
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
