<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please enter your DETAILS for Login: </h1>
	
	<form action="/mvcAssignment6/validate.html" method="post">
		<p>
			username : <input type="text" name="username"/>
		</p>
		<p>
			Password : <input type="text" name="password"/>
		</p>
				
			 <input type="submit" value="Login"/>
	</form>
</body>
</html>