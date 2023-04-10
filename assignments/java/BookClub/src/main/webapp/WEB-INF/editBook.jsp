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
<title>Edit Book</title>
</head>
<body>
	<header class="headerpart">
		<h1>Change your Entry</h1>
		<h4><a href="/books">back to the shelves</a></h4>
	</header>
    <main>
        	<form:form action="/books/${ theBook.id }/update" method="post" modelAttribute="editBookForm">
    		<input type="hidden" name="_method" value="put"/>
    		<section>
    			<label for="title">Title</label>
    			<input type="text" name="title" id="" value="${ theBook.title }"/>
    			<form:errors path="title" class="text-danger" />
    		</section>
    		<section>
    			<label for="author">Author</label>
    			<input type="text" name="author" id="" value="${ theBook.author }" />
    			<form:errors path="author" class="text-danger" />
    		</section>
    		<section>
    			<label for="thoughts">My thoughts</label>
    			<textarea type="text" name="thoughts" id="">"${theBook.thoughts}"</textarea>
    			<form:errors path="thoughts" class="text-danger" />
    		</section>
    		<section>
    			<input type="hidden" name="poster" value="${ user_id }" />
    		</section>
    		<button>Submit</button>
    	</form:form>
    </main>
    <footer>
    
    </footer>
</body>
</html>