<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Humi</title>
</head>
<body>
	<h1>Hello Humi, <c:out value="${Name}"></c:out></h1>
	
	<!-- <h2><c:out value="${2 + 2}"/></h2> -->
</body>
</html>