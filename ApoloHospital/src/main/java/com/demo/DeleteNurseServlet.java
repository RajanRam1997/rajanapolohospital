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


@WebServlet("/DeleteNurseServlet")
public class DeleteNurseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteNurseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int NurseId=Integer.parseInt(request.getParameter("nurseid"));
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root");
			PreparedStatement pstmt=con.prepareStatement("delete from nurse where nurseid=?");
			pstmt.setInt(1,NurseId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("nurse.jsp");
			rd.forward(request,response);
		} 
		catch(Exception e7) { 
		System.out.println(e7); 
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
