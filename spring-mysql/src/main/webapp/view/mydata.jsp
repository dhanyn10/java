<%@ page import="java.util.List" %>
<%@ page import="com.jsp.dbconn.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>My Data</title>
	</head>
	<body>
		data: <br/>
		<%
			List<User> dataList = (List<User>)request.getAttribute("data");
			for(int a = 0; a < dataList.size(); a++) {
				out.print("ID : " + dataList.get(a).getId() + " ");
				out.print("Name : " + dataList.get(a).getName() + " ");
				out.print("Address : " + dataList.get(a).getAddress() + " ");
				out.print("<br/>");
			}
		%>
	</body>
</html>