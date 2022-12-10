<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
	</head>
	<body>
		<h1>Login</h1>
		<form action="/login">
			<input type="text" name="username" placeholder="username"/>
			<input type="password" name="password" placeholder="password"/>
			<input type="submit" value="send"/>
		</form>
		${SPRING_SECURITY_LAST_EXCEPTION.message}
	</body>
</html>