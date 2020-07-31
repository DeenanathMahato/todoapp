<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		
		<%
			String msg = request.getParameter("msg");
		%>
		
		<div class="show-message text-center text-light">
			<h5><c:out value="<%= msg %>"></c:out></h5>
		</div>

		<div class="card-deck">
			<div class="card col-md-2 border-0 mx-4 px-0 text-center h-100">
				<div class="list-group todolistgroup">
				  <a href="home" class="list-group-item todolist">Todo List</a>
				  <a href="home" class="list-group-item list-group-item-secondary">Write Todo</a>
				  <a href="processupdate" class="list-group-item list-group-item-dark">Update Todo</a>
				  <a href="readtodo" class="list-group-item list-group-item-secondary">Read Todo</a>
				  <a href="#" class="list-group-item list-group-item-dark">Next Plan</a>
				</div>
			</div>
			<div class="card col-md-10 card-right" style="height:375px; overflow-y: scroll;">
			  <div class="card-header">${todoHeader }</div>
			  <div class="card-body">
			    <c:if test="${todoHeader == 'Write Todo'}">
				    <form:form action="savetodo" modelAttribute="todolist" method="post">
						<div class="form-group write-todo">
							<label for="title">Title</label>
							<form:input class="form-control" path="title" id="title" />
							<label for="description">Description</label>
							<form:textarea class="form-control " path="description" id="description" rows="4" />
						</div>
						<form:button class="btn btn-secondary">${changeBtn }</form:button>
				     </form:form>
			  	</c:if>
			  	<c:if test="${todoHeader == 'Update Todo'}">
			  		<c:forEach var="todoData" items="${todolist }">
			  			<form action="updatetodo" >
					  		<div class="form-group my-3">
					  			<input type="hidden" name="id" value="${todoData.id}">
					  			<label for="title">Title</label>
					  			<input type="text"  class="form-control" name="title"value="${todoData.title}">
					  			<label for="description">Description</label>
					  			<textarea  class="form-control max-height" rows="4" name="description" id="description">${todoData.description}</textarea>
					  		</div>
					  		<button class="btn btn-secondary">${changeBtn }</button>
				  		</form>
			  		</c:forEach>
			  	</c:if>
			  	<c:if test="${todoHeader == 'Read Todo'}">
			  		<c:forEach var="eachTodo" items="${todolist }">
		  				<p><strong>Title: </strong>${eachTodo.title}</p>
		  				<strong>Description:</strong>
		  				<p>${eachTodo.description}</p>
		  				<hr>
			  		</c:forEach>
			  	</c:if>
			  </div>
			</div>
		</div>
	</div>
</body>
</html>
