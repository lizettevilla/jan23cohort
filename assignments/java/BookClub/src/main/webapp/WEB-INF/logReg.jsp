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
<title>Login & Registration</title>
</head>
<body>
	<header>
		<h1 class="purpleheader">Book Club</h1>
		<h3>A place for friends to share thoughts on books.</h3>
	</header>
    <main id="logregrow">
    	<div class="userform">
    		<h1>Register</h1>
	    	<form:form action="/register" method="post" modelAttribute="newUser">
				<section>
					<form:label path="name">Name:</form:label>
					<form:input type="text" class="input" path="name" />
					<form:errors path="name" class="text-danger"/>
				</section>
				<section>
					<form:label path="email">Email:</form:label>
					<form:input type="text" class="input" path="email" />
					<form:errors path="email" class="text-danger"/>
				</section>
				<section>
					<form:label path="password">Password:</form:label>
					<form:input type="password" class="input" path="password" />
					<form:errors path="password" class="text-danger"/>
				</section>
				<section>
					<form:label path="confirmPassword">Confirm PW:</form:label>
					<form:input type="password" class="input" path="confirmPassword"/>
					<form:errors path="confirmPassword" class="text-danger"/>
				</section>
				<button class="btn btn-primary">Submit</button>
			</form:form>   	
    	</div>
    	<div class="userform">
     		<h1>Log in</h1>
	    	<form:form action="/login" method="post" modelAttribute="newLogin">
				<section>
					<form:label path="email">Email:</form:label>
					<form:input type="text" class="input" path="email"/>
					<form:errors path="email" class="text-danger"/>
				</section>
				<section>
					<form:label path="password">Password:</form:label>
					<form:input type="password" class="input" path="password" />
					<form:errors path="password" class="text-danger"/>
				</section>
				<button class="btn btn-primary">Submit</button>
			</form:form>      		
    	</div>
    </main>
    <footer>
    
    </footer>
</body>
</html>