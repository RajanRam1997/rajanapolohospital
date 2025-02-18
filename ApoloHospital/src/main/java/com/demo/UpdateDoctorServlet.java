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


@WebServlet("/UpdateDoctorServlet")
public class UpdateDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateDoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int DoctorId=Integer.parseInt(request.getParameter("doctorid"));
		String DoctorName=request.getParameter("doctorname");
		String Specialization=request.getParameter("specialization");
		String Mobile=request.getParameter("mobile");
		String fees=request.getParameter("fees");
		PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital","root","root");
			PreparedStatement pstmt=con.prepareStatement("update doctor set doctorname=?, specialization=?, mobile=?, fees=? where doctorid=?");
			pstmt.setString(1,DoctorName);
			pstmt.setString(2,Specialization);
			pstmt.setString(3, Mobile);
			pstmt.setString(4,fees);
			pstmt.setInt(5, DoctorId);
			//pstmt.setInt(5,DoctorId);
			pstmt.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.forward(request,response);
			//out.println("Data Updated successful!");
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
