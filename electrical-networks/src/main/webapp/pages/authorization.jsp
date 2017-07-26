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
			<article id="auto_registr">
				<form action="#" method="POST">
					Имя пользователя: <br />
					<input name="text" name="name" value="" size="40"></textarea> <br />
					Пороль: <br />
					<input type="password" name="password" value="" size="40"/> <br />
					<input type="checkbox" name="remember" value="Запомнить">Запомнить меня
					<input type="submit" value="Войти" />
				</form>
			</article>
		</section>
		
		<jsp:include page="include/footer.jsp"/>
	</body>
</html>