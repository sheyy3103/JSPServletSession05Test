<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.2/css/bootstrap.min.css"
	integrity="sha512-rt/SrQ4UNIaGfDyEXZtNcyWvQeOq0QLygHluFQcSjaGB04IxWhal71tKuzP6K8eYXYB6vJV4pHkXcmFGGQ1/0w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="container-fluid px-5">
		<h1 class="text-center text-uppercase text-danger">List Companies</h1>
		<div class="row">
			<div class="col-12">
				<a href="add.jsp">Add a new company</a>
				<table class="table table-borderless table-stripped">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Company name</th>
							<th scope="col">Address</th>
							<th scope="col">Director</th>
							<th scope="col">Inauguration day</th>
							<th scope="col">Field of activity</th>
							<th scope="col">Total employees</th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list }" var="c">
							<tr>
								<th scope="row">${c.companyId}</th>
								<td>${c.companyName }</td>
								<td>${c.address }</td>
								<td>${c.director }</td>
								<td>${c.inaugurationDay }</td>
								<td>${c.fieldOfActivity }</td>
								<td>${c.totalEmployees }</td>
								<td class="text-right">
									<a href="Edit?companyId=${ c.companyId}" class="btn btn-outline-info rounded-pill">Edit</a>
									<a href="Delete?companyId=${ c.companyId}" class="btn btn-outline-danger rounded-pill">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.2/js/bootstrap.min.js"
		integrity="sha512-7rusk8kGPFynZWu26OKbTeI+QPoYchtxsmPeBqkHIEXJxeun4yJ4ISYe7C6sz9wdxeE1Gk3VxsIWgCZTc+vX3g=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>
</html>