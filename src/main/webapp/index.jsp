<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring rest</title>
</head>
<body>
	<h3>SPRING REST DEMO APPLICATION</h3>
	<a href="${pageContext.request.contextPath}/test/hello">go to welcome page</a>
	
	<br>
	<a href="${pageContext.request.contextPath}/api/students">Get all students</a>
</body>
</html>