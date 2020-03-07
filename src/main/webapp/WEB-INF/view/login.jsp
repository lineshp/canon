<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" method="post" modelAttribute="loginDetails" acceptCharset="UTF-8">
test************* ${name}
name <form:input type="text" path="name"/>

password <form:input type="password" path="password"/>
<form:button id="add-person">Add Person</form:button>
</form:form>
</body>
</html>