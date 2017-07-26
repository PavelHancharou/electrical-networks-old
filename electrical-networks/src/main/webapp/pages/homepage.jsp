<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>МЭС</title>
		<style>
			<%@ include file='../styles/style.css' %>
		</style>
	</head>
 
	<body>		
		<jsp:include page="include/header.jsp"/>
 
 		<jsp:include page="include/nav.jsp"/>
		
		<section id="photo_central_section">
			<header>
				<h2>ФОТОАЛЬБОМ</h2>
			</header>
			<figure>
				<img src="photos/lavanda.jpg" alt="цветы лаванды" width=100%>
				<figcaption>Красивые цветочки на лугу</figcaption>
			</figure>
		</section>

		<section id="info_left_section">
			<header>
				<h2>ИНФА о ЧЕЛЕ</h2>
			</header>
			<article>
				<p>Тут должна содержаться информация о человеке ...</p>
			</article>
		</section>
		
		<jsp:include page="include/footer.jsp"/>
	</body>
</html>