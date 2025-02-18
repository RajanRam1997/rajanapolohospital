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


@WebServlet("/UpdateNurseServlet")
public class UpdateNurseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateNurseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int NurseId=Integer.parseInt(request.getParameter("nurseid"));
		String nm=request.getParameter("nursename");
		String m=request.getParameter("mobile");
		String s=request.getParameter("salary");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital","root","root");
			PreparedStatement pstmt=con.prepareStatement("update nurse set nursename=?,mobile=?,salary=? where nurseid=?");
			pstmt.setString(1,nm);
			pstmt.setString(2, m);
			pstmt.setString(3, s);
			pstmt.setInt(4,NurseId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("updatenurse.jsp");
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
