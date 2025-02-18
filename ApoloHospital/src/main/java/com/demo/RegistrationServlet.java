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


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("name");
		String a=request.getParameter("address");
		String e=request.getParameter("email");
		String m=request.getParameter("mobile");
		PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital","root","root");
			PreparedStatement pstmt=con.prepareStatement("insert into patientregistration(patientname,patientaddress,patientemail,patientmobile) Values(?,?,?,?)");
			pstmt.setString(1,n);
			pstmt.setString(2,a);
			pstmt.setString(3,e);
			pstmt.setString(4,m);
			RequestDispatcher rd=request.getRequestDispatcher("patientregistration.jsp");
			rd.include(request,response);
			pstmt.executeUpdate();
			out.println("Registration Successfull!!");
			
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
