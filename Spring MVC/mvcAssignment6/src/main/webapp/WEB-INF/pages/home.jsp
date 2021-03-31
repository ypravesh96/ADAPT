<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    
  </head>
  <body>
  <h1><form:errors path="student1.*" /></h1>
  
  <form action="/mvcAssignment6/students">
  
<table>

<tr>
<td>Username  </td><td> <input type="text" name="username"></td>
</tr>

<tr>
<td>Password </td><td> <input type="text" name="password"></td>
</tr>

<tr>
<td>Email  </td><td> <input type="text" name="email"></td>
</tr>

<tr>
<td>Contact  </td><td> <input type="text" name="contact"></td>
</tr>

<tr>
<td>City  </td><td> <select name="city" >
    <option value="Pune">Pune</option>
      <option value="Lucknow">Lucknow</option>
      <option value="Hyderabaad">Hyderabad</option>
   
      <option value="jalandhar">jalandhar</option>
      
    
  </select></td>
</tr>

<tr>
<td>ZipCode  </td><td> <input type="text" name="zip"></td>
</tr>

</table>
<input type="submit" value="Submit "/>
</form>
  </body>
</html>