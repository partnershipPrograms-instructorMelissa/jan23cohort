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
<title>WOS Mart</title>
</head>
<body>
	<header>
        <pre>
            <c:import url="/resources/ascii.txt" />
        </pre>
        <nav>
			<c:if test="${ user_id != null }">
				<a href="/dashboard">Dashboard</a>
				<a href="/store">Store</a>
				<a href="/logout">Logout</a>
			</c:if>
			<c:if test="${ user_id == null }">
                <a href="/">Home</a>
                <a href="/store">Store</a>
				<a href="/logReg">Login</a>
			</c:if>
        </nav>
	</header>
    <main>
        <button class="lg"><a href="/logReg">Join us / Log in</a></button>
    </main>
    <footer>
        <img src="/images/bee.png" alt="">
    </footer>
    <script src="/js/script.js"></script>
</body>
</html>