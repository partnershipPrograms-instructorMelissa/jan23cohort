<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome User</h1>
	<a href="/counter">Go To Counter Page</a>
	
	<form action="/omikuji" method="post">
	<label for="num" name="num">Pick any number from 5 to 25</label>
	<input type="number" name="num" />
	<label for="city" name="city">Enter the name of any city</label>
	<input type="text" name="city" />
	<label for="name" name="name">Enter the name of any real person</label>
	<input type="text" name="name" />
	<label for="hobby" name="hobby">Enter professional endeavor or hobby:</label>
	<input type="text" name="hobby" />
	<label for="thing" name="thing">Enter any type of living thing</label>
	<input type="text" name="thing" />
	<label for="something" name="something">Say something nice to someone:</label>
	<textarea name="something" id="" cols="30" rows="10"></textarea>
	<h4>Send a show to a friend!</h4>
	<button>Send</button>
	</form>
</body>
</html>