<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>home</title>
	
	<%@ include file="../components/common-css-js.jsp" %>
	
</head>
<body>
	<%@ include file="../components/navbar.jsp" %>
	<div class="container home-container">
		<h3 class="text-center">${greeting }</h3>
		<div class="card-deck">
			<div class="card col-md-2 border-0 mx-4 px-0 text-center">
				<div class="list-group todolistgroup">
				  <a href="home" class="list-group-item todolist">Todo List</a>
				  <a href="#" class="list-group-item list-group-item-secondary">Write Todo</a>
				  <a href="#" class="list-group-item list-group-item-dark">Update Todo</a>
				  <a href="#" class="list-group-item list-group-item-secondary">Read Todo</a>
				  <a href="#" class="list-group-item list-group-item-dark">Next Plan</a>
				</div>
			</div>
			<div class="card col-md-10">
			  <div class="card-header">Featured</div>
			  <div class="card-body">
			    <h5 class="card-title">Special title treatment</h5>
			    <p class="card-text">With supporting text below as a natural lead-in to additional content.
		    	
			    </p>
			    <a href="#" class="btn btn-primary">Go somewhere</a>
			  </div>
			</div>
		</div>
	</div>
</body>
</html>
