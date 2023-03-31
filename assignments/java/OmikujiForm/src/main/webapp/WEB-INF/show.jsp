<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Omikuji Form</title>
</head>
<body>
	<header>
		<h1>Here's Your Omikuji!</h1>
	</header>
	<h2>In
	<c:out value="${number }" /> years, you will live in
	<c:out value="${city}" /> with
	<c:out value="${name}" /> as your roommate,
	<c:out value="${hobby }" /> for a living. The next time you see a
	<c:out value="${living }" />, you will have good luck. Also,
	<c:out value="${comment }"/>!
	</h2>
</body>
</html>