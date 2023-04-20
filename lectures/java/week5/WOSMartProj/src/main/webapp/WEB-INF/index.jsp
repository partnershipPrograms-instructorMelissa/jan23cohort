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
<script src="/js/components/nav.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: darkgray;">
	<header>
        <nav-component></nav-component>
	</header>
    <main>
    	<pre>
            <c:import url="/resources/ascii.txt" />
        </pre>
    </main>
    <footer>
    	<div><span style="color: #ff0000">E</span><span style="color: #ff0400">n</span><span style="color: #ff0800">t</span><span style="color: #ff0c00">e</span><span style="color: #ff1000">r</span><span style="color: #ff1400"> </span><span style="color: #ff1900">y</span><span style="color: #ff1d00">o</span><span style="color: #ff2100">u</span><span style="color: #ff2500">r</span><span style="color: #ff2900"> </span><span style="color: #ff2d00">m</span><span style="color: #ff3100">e</span><span style="color: #ff3500">s</span><span style="color: #ff3900">s</span><span style="color: #ff3d00">a</span><span style="color: #ff4200">g</span><span style="color: #ff4600">e</span><span style="color: #ff4a00"> </span><span style="color: #ff4e00">h</span><span style="color: #ff5200">e</span><span style="color: #ff5600">r</span><span style="color: #ff5a00">e</span><span style="color: #ff5e00">.</span><span style="color: #ff6200">.</span><span style="color: #ff6600">.</span></div><div><span style="color: #ff6b00">T</span><span style="color: #ff6f00">o</span><span style="color: #ff7300"> </span><span style="color: #ff7700">b</span><span style="color: #ff7b00">e</span><span style="color: #ff7f00"> </span><span style="color: #ff8300">o</span><span style="color: #ff8700">r</span><span style="color: #ff8b00"> </span><span style="color: #ff9000">n</span><span style="color: #ff9400">o</span><span style="color: #ff9800">t</span><span style="color: #ff9c00"> </span><span style="color: #ffa000">t</span><span style="color: #ffa400">o</span><span style="color: #ffa800"> </span><span style="color: #ffac00">b</span><span style="color: #ffb100">e</span><span style="color: #ffb500">,</span><span style="color: #ffb900"> </span></div><div><span style="color: #ffbd00">t</span><span style="color: #ffc100">h</span><span style="color: #ffc500">a</span><span style="color: #ffc900">t</span><span style="color: #ffcd00"> </span><span style="color: #ffd200">i</span><span style="color: #ffd600">s</span><span style="color: #ffda00"> </span><span style="color: #ffde00">t</span><span style="color: #ffe200">h</span><span style="color: #ffe600">e</span><span style="color: #ffea00"> </span><span style="color: #ffee00">q</span><span style="color: #fff300">u</span><span style="color: #fff700">e</span><span style="color: #fffb00">s</span><span style="color: #ffff00">t</span><span style="color: #f7ff00">i</span><span style="color: #efff00">o</span><span style="color: #e7ff00">n</span><span style="color: #dfff00">.</span><span style="color: #d7ff00">.</span><span style="color: #cfff00">.</span></div><div><span style="color: #c7ff00">m</span><span style="color: #bfff00">a</span><span style="color: #b7ff00">y</span><span style="color: #afff00">b</span><span style="color: #a7ff00">e</span><span style="color: #9fff00">,</span><span style="color: #97ff00"> </span><span style="color: #8fff00">I</span><span style="color: #87ff00"> </span><span style="color: #80ff00">t</span><span style="color: #78ff00">h</span><span style="color: #70ff00">i</span><span style="color: #68ff00">n</span><span style="color: #60ff00">k</span><span style="color: #58ff00">,</span><span style="color: #50ff00"> </span></div><div><span style="color: #48ff00">I</span><span style="color: #40ff00">'</span><span style="color: #38ff00">m</span><span style="color: #30ff00"> </span><span style="color: #28ff00">n</span><span style="color: #20ff00">o</span><span style="color: #18ff00">t</span><span style="color: #10ff00"> </span><span style="color: #08ff00">s</span><span style="color: #00ff00">u</span><span style="color: #00ff08">r</span><span style="color: #00ff10">e</span></div><div><span style="color: #00ff19">w</span><span style="color: #00ff21">a</span><span style="color: #00ff29">i</span><span style="color: #00ff31">t</span><span style="color: #00ff3a">,</span><span style="color: #00ff42"> </span><span style="color: #00ff4a">y</span><span style="color: #00ff52">o</span><span style="color: #00ff5a">u</span><span style="color: #00ff63">'</span><span style="color: #00ff6b">r</span><span style="color: #00ff73">e</span><span style="color: #00ff7b"> </span><span style="color: #00ff84">s</span><span style="color: #00ff8c">t</span><span style="color: #00ff94">i</span><span style="color: #00ff9c">l</span><span style="color: #00ffa5">l</span><span style="color: #00ffad"> </span><span style="color: #00ffb5">r</span><span style="color: #00ffbd">e</span><span style="color: #00ffc5">a</span><span style="color: #00ffce">d</span><span style="color: #00ffd6">i</span><span style="color: #00ffde">n</span><span style="color: #00ffe6">g</span><span style="color: #00ffef"> </span><span style="color: #00fff7">t</span><span style="color: #00ffff">h</span><span style="color: #00f7ff">i</span><span style="color: #00efff">s</span><span style="color: #00e6ff">?</span></div><div><span style="color: #00deff">T</span><span style="color: #00d6ff">y</span><span style="color: #00ceff">p</span><span style="color: #00c5ff">e</span><span style="color: #00bdff"> </span><span style="color: #00b5ff">a</span><span style="color: #00adff"> </span><span style="color: #00a5ff">g</span><span style="color: #009cff">o</span><span style="color: #0094ff">o</span><span style="color: #008cff">d</span><span style="color: #0084ff"> </span><span style="color: #007bff">m</span><span style="color: #0073ff">e</span><span style="color: #006bff">s</span><span style="color: #0063ff">s</span><span style="color: #005aff">a</span><span style="color: #0052ff">g</span><span style="color: #004aff">e</span><span style="color: #0042ff"> </span><span style="color: #003aff">a</span><span style="color: #0031ff">l</span><span style="color: #0029ff">r</span><span style="color: #0021ff">e</span><span style="color: #0019ff">a</span><span style="color: #0010ff">d</span><span style="color: #0008ff">y</span><span style="color: #0000ff">!</span></div>
    </footer>
    <script src="/js/script.js"></script>
</body>
</html>