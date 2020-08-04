<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sign Up</title>
	<%@ include file="../components/common-css-js.jsp"%>
</head>
<body class="bg-secondary">
	<%@ include file="../components/navbar.jsp"%>
	<div class="container my-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card"><div class="card-body">
					<h5 class="text-center"><u>Sign Up Form</u></h5>
					<form action="formsubmited">
						<div class="form-group">
							<label for="nameid">Your Name</label> 
							<input type="text" class="form-control" name="name" id="nameid" aria-describedby="nameHelp" placeholder="Enter Your Name">
							<small id="nameHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
						</div>
						<div class="form-group">
							<label for="yourid">Your Id</label> 
							<input type="text" class="form-control" name="id" id="yourid" placeholder="Enter Id">
						</div>
						<div class="form-group">
							<label for="dobid">Your DOB</label> 
							<input type="text" class="form-control" name="dob" id="dobid" placeholder="dd/mm/yyyy">
						</div>
						<div class="form-group">
							<label for="courseId">Select Courses</label> 
							<select multiple class="form-control" name="courses" id="courseId">
								<option>Core Java</option>
								<option>Spring</option>
								<option>Hibernate</option>
								<option>Bootstrap</option>
								<option>AngularJS</option>
								<option>ReactJS</option>
							</select>
						</div>
						<div class="form-group">
							<label>Select Gender</label>
							<div class="form-check form-check-inline">
							  <input class="form-check-input" type="radio" name="gender" id="male-btn" value="male">
							  <label class="form-check-label" for="male-btn">Male</label>
							</div>
							<div class="form-check form-check-inline">
							  <input class="form-check-input" type="radio" name="gender" id="female-btn" value="female">
							  <label class="form-check-label" for="female-btn">Female</label>
							</div>
						</div>
						<div class="form-group">
							<label for="typeid">Select Type</label> 
							<select class="form-control" name="type" id="typeid">
								<option>Old Student</option>
								<option>New Student</option>
							</select>
						</div>
						<button type="button" class="btn btn-secondary btn-sm btn-block">Submit</button>
					</form>
				</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
