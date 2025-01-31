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
<title>LogReg</title>
</head>
<body>
	<header>
		<h1>Login & Registration</h1>
		<nav>
			<a href="/">Home</a>
			<c:if test="${ user_id != null }">
				<a href="/logout">Logout</a>
			</c:if>
			<c:if test="${ user_id == null }">
				<a href="/logReg">Login</a>
			</c:if>
		</nav>
	</header>
    <main>
    	<form:form action="/register" method="POST" modelAttribute="newUser">
				<section>
					<form:label path="username">Username</form:label>
					<form:input type="text" class="input" path="username" />
					<form:errors path="username" class="text-danger" />
				</section>
				<section>
					<form:label path="email">Email</form:label>
					<form:input type="email" class="input" path="email" />
					<form:errors path="email" class="text-danger" />
				</section>
				<section>
					<form:label path="password">Password</form:label>
					<form:input type="password" class="input" path="password" />
					<form:errors path="password" class="text-danger" />
				</section>
				<section>
					<form:label path="confirmPassword">Confirm Password</form:label>
					<form:input type="password" class="input" path="confirmPassword" />
					<form:errors path="confirmPassword" class="text-danger" />
				</section>
				<button class="btn btn-primary">Register and Login</button>
			</form:form>
			
			
			<form:form action="/login" method="POST" modelAttribute="newLogin">
				<section>
					<form:label path="email">Email</form:label>
					<form:input type="email" class="input" path="email" />
					<form:errors path="email" class="text-danger" />
				</section>
				<section>
					<form:label path="password">Password</form:label>
					<form:input type="password" class="input" path="password" />
					<form:errors path="password" class="text-danger" />
				</section>
				<button class="btn btn-primary">Login</button>
			</form:form>
    </main>
    <footer>
    
    </footer>
</body>
</html>