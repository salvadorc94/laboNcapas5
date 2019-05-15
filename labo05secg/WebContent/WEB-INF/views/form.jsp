<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>

<form  action="${pageContext.request.contextPath}/user" method="POST">
	<input type="text" name="id"/><br>
	<input type="submit" value="Buscar">
</form>
</body>
</html>