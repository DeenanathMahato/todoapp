<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Image Uploaded</title>
</head>
<body>
	<div class="show-message text-center text-light">
		<div class="card"
			style="float: right; width: 2rem; height: 2rem; border-radius:10px; display: inline-block;">
			<img alt="img" style="width:35px; height:35px;" src="<c:url value="/resources/imgs/${filename }" />">
		</div>
		<h5>
			<c:out value="${msg }"></c:out>
			<c:out value="${filename }" />
		</h5>
	</div>
</body>
</html>
