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
		
		<section id="home_left_section">
			<table border="1">
				<caption>Перечень существующих таблиц</caption>
				 <tr>
				 	<th>Название таблицы</th>
				 	<th>Перейти</th>
				 </tr>
				 
			</table>
		</section>
		
		<jsp:include page="include/footer.jsp"/>
	</body>
</html>