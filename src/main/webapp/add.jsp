<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.2/css/bootstrap.min.css"
	integrity="sha512-rt/SrQ4UNIaGfDyEXZtNcyWvQeOq0QLygHluFQcSjaGB04IxWhal71tKuzP6K8eYXYB6vJV4pHkXcmFGGQ1/0w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="container">
		<h1 class="text-danger text-uppercase py-3">Add a new company</h1>
		<div class="row">
			<div class="col-8">
				<form action="Store" method="post">
					<div class="form-group">
						<label for="exampleInputPassword1">Company ID:</label> <input
							type="text" class="form-control rounded-pill" name="companyId">
						<small id="emailHelp" class="form-text text-danger">${companyIdErr }</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Company name:</label> <input
							type="text" class="form-control rounded-pill" name="companyName">
						<small id="emailHelp" class="form-text text-danger">${companyNameErr }</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Address:</label> <input
							type="text" class="form-control rounded-pill" name="address">
						<small id="emailHelp" class="form-text text-danger">${addressErr }</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Director:</label> <input
							type="text" class="form-control rounded-pill" name="director">
						<small id="emailHelp" class="form-text text-danger">${directorErr }</small>
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Inauguration day:</label> <input
							type="date" class="form-control rounded-pill" name="inaugurationDay">
						<small id="emailHelp" class="form-text text-danger">${inaugurationDayErr }</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Field of activity:</label> <input
							type="text" class="form-control rounded-pill" name="fieldOfActivity">
						<small id="emailHelp" class="form-text text-danger">${fieldOfActivityErr }</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Total employees:</label> <input
							type="text" class="form-control rounded-pill" name="totalEmployees">
						<small id="emailHelp" class="form-text text-danger">${totalEmployeesErr }</small>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-outline-primary rounded-pill">Submit</button>
						<button type="reset" class="btn btn-outline-warning rounded-pill">Clear</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.2/js/bootstrap.min.js"
		integrity="sha512-7rusk8kGPFynZWu26OKbTeI+QPoYchtxsmPeBqkHIEXJxeun4yJ4ISYe7C6sz9wdxeE1Gk3VxsIWgCZTc+vX3g=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>
</html>