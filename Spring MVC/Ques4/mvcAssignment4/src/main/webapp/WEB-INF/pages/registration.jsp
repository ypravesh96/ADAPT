<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/mvcAssignment6/submit.html" method = "post">
	
		<p>
			User Name : <input type="text" name="username" required/>
		</p>
		<p>
			Password : <input type="text" name="password" required/>
		</p>		
		<p>
			Email : <input type="text" name="email" required/>
		</p>
		
				
		<input type="submit" value="Register"/>
	
	</form>

</body>
</html>