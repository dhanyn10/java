<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index</title>
	</head>
	<body>
		<form action="/save">
			<label>name</label>
			<input type="texy" name="name"/><br/>
			<label>address</label>
			<input type="texy" name="address"/><br/>
			<input type="submit" value="submit">
		</form>
		<form action="/update">
			<label>ID</label>
			<input type="text" name="id"/><br/>
			<label>name</label>
			<input type="text" name="name"/><br/>
			<label>address</label>
			<input type="text" name="address"/><br/>
			<input type="submit" value="update"/>
		</form>
		<form action="/delete">
			<label>ID to delete</label>
			<input type="text" name="id"/><br/>
			<input type="submit" value="delete"/>
		</form>
	</body>
</html>