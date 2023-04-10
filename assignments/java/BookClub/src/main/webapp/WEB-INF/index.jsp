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
<title>HomePage</title>
</head>
<body>
	<header>
		<div class="headerpart">
			<h1>Welcome, <c:out value="${theUser.name}"></c:out></h1>
			<h4><a href="/logout">logout</a></h4>		
		</div>		
		<div class="headerpart">
			<h4>Books from everyone's shelves:</h4>
			<h4><a href="/books/new">+ Add a book to my shelf!</a></h4>		
		</div>
	</header>
    <main>
    	<table>
    		<tr>
    			<th>ID</th>
    			<th>Title</th>
    			<th>Author's Name</th>
    			<th>Posted By</th>
    		</tr>
    		<c:forEach var="book" items="${allBooks}">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.poster.name }"></c:out></td>					
				</tr>
			</c:forEach>
    	</table>
    </main>
    <footer>
    
    </footer>
</body>
</html>