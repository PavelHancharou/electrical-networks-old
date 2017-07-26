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
		<jsp:include page="header.jsp"/>
 
 		<jsp:include page="nav.jsp"/>
		
		<section id="home_left_section">
			<figure>
				<img src="photos/line.jpg" alt="Логотип МЭС" alt="ВЛ-110кВ" width=100%>
				<figcaption>Линии электропередач</figcaption>
			</figure>
		</section>
		
		<jsp:include page="footer.jsp"/>
	</body>
</html>