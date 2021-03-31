<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title><spring:message code="label.title" /></title>
</head>
<body>
<a href="/spring/?siteLanguage=en">Login(English)</a>|
<a href="/spring/?siteLanguage=fr">Login(French)</a>|
<a href="/spring/?siteLanguage=vt">Login(Vietnamese)</a>
	<form method="post" action="login">
		<table>
			<tr>
				<td><label> <strong><spring:message
								code="label.firstName" /></strong>
				</label></td>
				<td><input name="firstName" /></td>
			</tr>
			<tr>
				<td><label> <strong><spring:message
								code="label.lastName" /></strong>
				</label></td>
				<td><input name="lastName" /></td>
			</tr>
			<tr>
				<spring:message code="label.submit" var="labelSubmit"></spring:message>
				<td colspan="2"><input type="submit" value="${labelSubmit}" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
