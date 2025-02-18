<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Registration </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<style>
  body {
            background: content-box radial-gradient(crimson, skyblue);
            font-family: Arial, sans-serif;
        }
        .container {
            background: orange;
            padding: 30px;
            border-radius: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
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
	<form action="RegistrationServlet" method="post">
	<div class="container text-center mt-2">
	<h1 class="text-center mt-5">Registration Form</h1>
	<label>Enter Name :</label>
	<input type="text" name="name"><br><br>
	<label>Enter Address :</label>
	<input type="text" name="address"><br><br>
	<label>Enter Email :</label>
	<input type="email" name="email"><br><br>
	<label>Enter Mobile Number :</label>
	<input type="number" name="mobile"><br><br>
	<input class="text-center" type="submit" value="register">
	</div>
	</form>
</body>
</html>