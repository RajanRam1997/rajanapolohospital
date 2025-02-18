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


@WebServlet("/BookAppointmentServlet")
public class BookAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BookAppointmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String pn=request.getParameter("patientname");
		String dn=request.getParameter("doctorname");
		String ad=request.getParameter("appointmentdate");
		String at=request.getParameter("appointmenttime");
		try { 
			   Class.forName("com.mysql.cj.jdbc.Driver"); 
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root","root");
			   PreparedStatement pstmt=con.prepareStatement("insert into appointments(patient_name,doctor_name,appointment_date,appointment_time)values(?,?,?,?)");
			   pstmt.setString(1,pn);
			   pstmt.setString(2,dn);
			   pstmt.setString(3,ad);
			   pstmt.setString(4,at);
			   RequestDispatcher rd=request.getRequestDispatcher("patientappointment.jsp");
			   rd.forward(request,response);
			   pstmt.executeUpdate();
		}
		catch(Exception r) {
			out.println(r);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
