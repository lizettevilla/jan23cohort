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
<title>Safe Travels</title>
</head>
<body>
	<header>
		<h1>Edit Expense</h1>
		<a href="/">Go Back</a>
	</header>
	<main>
		<form:form action="/expenses/${expense.id}/update" method="post" modelAttribute="updateForm">
   		<input type="hidden" name="_method" value="put">
			<section>
				<form:label path="expenseName">Expense Name</form:label>
				<form:errors path="expenseName"/>
				<form:input path="expenseName" type="text" value="${expense.expenseName}" />
			</section>
			<section>
				<form:label path="vendor">Vendor</form:label>
				<form:errors path="vendor"/>
				<form:input path="vendor" type="text" value="${expense.vendor}"/>
			</section>
			<section>
				<form:label path="amount">Amount</form:label>
				<form:errors path="amount"/>
				<form:input path="amount" type="number" value="${expense.amount}"/>
			</section>
			<section>
				<form:label path="description">Description</form:label>
				<form:errors path="description"/>
				<form:input path="description" type="text" value="${expense.description}"/>
			</section>
			<button>Update</button>
		</form:form>
	</main>
</body>
</html>