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


@WebServlet("/AddNurseServlet")
public class AddNurseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddNurseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nn=request.getParameter("txtnursename");
		String nm=request.getParameter("txtmodile");
		int s=Integer.parseInt(request.getParameter("txtsalary"));
		
		
		  try { 
			   Class.forName("com.mysql.cj.jdbc.Driver"); 
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root"); 
			   PreparedStatement pstmt=con.prepareStatement("insert into nurse(nursename,mobile,salary)values(?,?,?)");
			   pstmt.setString(1,nn);
			   pstmt.setString(2,nm);
			   pstmt.setInt(3,s);
			   pstmt.executeUpdate();
			   RequestDispatcher rd=request.getRequestDispatcher("nurse.jsp");
			   
			   rd.forward(request,response);
		  }
		  catch(Exception e5){
			  System.out.println(e5);
		  }
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
