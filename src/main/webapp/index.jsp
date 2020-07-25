<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>todoapp</title>
	<%@ include file="WEB-INF/components/common-css-js.jsp" %>
</head>
<body>
	<%@ include file="WEB-INF/components/navbar.jsp" %>
	<div class="container indexpage">
		<h1>Welcome To Mytodo!</h1>
		<div class="write-to-do mybtn">
			<!-- <button type="button" class="btn btn-dark">Write Todo List</button> -->
			<a class="btn btn-secondary" href="home" role="button">Write Todo List</a>
		</div>
		<div class="update-to-do mybtn">
			<!-- <button type="button" class="btn btn-dark">Update Todo List</button> -->
			<a class="btn btn-secondary" href="home" role="button">Update Todo List</a>
		</div>
		<div class="read-to-do mybtn">
			<!-- <button type="button" class="btn btn-dark">Read Todo List</button> -->
			<a class="btn btn-secondary" href="home" role="button">Read Todo List</a>
		</div>
	</div>
</body>
</html>
