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
<title>Book</title>
</head>
<body>
	<header class="headerpart">
		<h1><c:out value="${theBook.title}"></c:out></h1>
		<h4><a href="/books">back to the shelves</a></h4>
	</header>
    <main>
    	<h3><c:out value="${theBook.poster.name}"></c:out> read <c:out value="${theBook.title}"></c:out> by <c:out value="${theBook.author}"></c:out></h3>
    	<h3>Here are <c:out value="${theBook.poster.name}"></c:out>'s thoughts:</h3>
    	<hr/>
    	<h3><c:out value="${theBook.thoughts}"></c:out></h3>
    	<hr/>
    	<div class="viewbuttons">
    		<a href="/books/${theBook.id}/edit" class="btn btn-primary">Edit</a>
    		<a href="/books/${ theBook.id }/delete" class="btn btn-danger">Delete</a>
    	</div>
    </main>
    <footer>
    
    </footer>
</body>
</html>