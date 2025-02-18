<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Appointments</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background: content-box radial-gradient(crimson, skyblue);
            font-family: Arial, sans-serif;
        }
        .container {
            background: brown;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #343a40;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .table {
            border-radius: 8px;
            overflow: hidden;
        }
        .table thead {
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            color: white;
        }
        .table tbody tr:hover {
            background-color: #f1f1f1;
        }
        .table-bordered {
            border: 2px solid #dee2e6;
        }
    </style>
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Booked Appointments</h2>
        <table class="table table-bordered text-center">
            <thead>
                <tr>
                    <th>Patient ID</th>
                    <th>Patient Name</th>
                    <th>Doctor Name</th>
                    <th>Appointment Date</th>
                    <th>Appointment Time</th>
                </tr>
            </thead>
            <tbody>
                <%
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apolohospital", "root", "root");
                        PreparedStatement pst = con.prepareStatement("SELECT patient_id,patient_name, doctor_name, appointment_date, appointment_time FROM appointments");
                        ResultSet rs = pst.executeQuery();

                        while (rs.next()) {
                            int patientId = rs.getInt(1);
                            String patientName=rs.getString(2);
                            String doctorName = rs.getString(3);
                            String appointmentDate = rs.getString(4);
                            String appointmentTime = rs.getString(5);
                %>
                <tr>
                    <td><%= patientId %></td>
                    <td><%=patientName %>
                    <td><%= doctorName %></td>
                    <td><%= appointmentDate %></td>
                    <td><%= appointmentTime %></td>
                </tr>
                <%
                        }
                        rs.close();
                        pst.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>