<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apolo Hospital</title>
<link
	href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css'
	rel='stylesheet'>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div id="carouselExampleFade" class="carousel slide carousel-fade">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="img4.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="img.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="img1.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="img2.jpg" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="img3.jpg" class="d-block w-100" alt="...">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleFade" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleFade" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>