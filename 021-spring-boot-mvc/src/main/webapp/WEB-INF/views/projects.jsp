<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Manager</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script></script>
</head>
<body>
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	<div class="container">
		<h2>Projects</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Sponsor</th>
					<th>Description</th>
				</tr>
				<c:forEach items="${projects }" var="project">
					<tr>
						<td><a   href="<spring:url value="/project/${project.projectId}" />">${project.name }</a></td>
						<td>${project.sponsor}</td>
						<td>${project.description }</td>
					</tr>
				</c:forEach>
				

			</tbody>
		</table>
	</div>
</body>
</html>