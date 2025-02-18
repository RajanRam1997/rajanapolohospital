<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apolo Hospital</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Apolo Hospital</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="#">About</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Staff </a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="doctor.jsp">Doctor</a></li>
								<li><a class="dropdown-item" href="nurse.jsp">Nurse</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="technician.jsp">Technician</a></li>
							</ul></li>
							<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Patient </a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="patientregistration.jsp">Registration</a></li>
								<li><a class="dropdown-item" href="patientappointment.jsp">Book Appointment</a></li>
								<li><a class="dropdown-item" href="showappointment.jsp">Show Appointment</a></li>
							</ul>
							</li>
					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>

	</div>
</body>
</html>