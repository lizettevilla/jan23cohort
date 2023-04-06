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
		<h1>Save Travels</h1>
	</header>
	<main>
				<table>
				<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="e" items="${allExpenses}">
				<tr>
					<td><a href="/expenses/${e.id}">${e.expenseName}</a></td>
					<td>${e.vendor}</td>
					<td>${e.amount} </td>
					<td><a href="/expenses/${e.id}/edit">edit</a> <a href="/expenses/${e.id}/delete">delete</a></td>
				</tr>
				</c:forEach>
				</tbody>
				</table>
		<h1>Add an expense:</h1>
		<form:form action="/createExpense" method="post" modelAttribute="expense">
			<section>
				<form:label path="expenseName">Expense Name</form:label>
				<form:errors path="expenseName"/>
				<form:input path="expenseName"/>
			</section>
			<section>
				<form:label path="vendor">Vendor</form:label>
				<form:errors path="vendor"/>
				<form:input path="vendor"/>
			</section>
			<section>
				<form:label path="amount">Amount</form:label>
				<form:errors path="amount"/>
				<form:input path="amount"/>
			</section>
			<section>
				<form:label path="description">Description</form:label>
				<form:errors path="description"/>
				<form:input path="description"/>
			</section>
			<button>Submit</button>
		</form:form>
	</main>
</body>
</html>