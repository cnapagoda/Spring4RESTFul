<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HelloWorld page</title>
</head>
<body>
<c:if test="${not empty name}">
    Hello ${name}
</c:if>

<c:if test="${empty name}">
    Welcome!
</c:if>
<br/><br/><br/><br/>
Please navigate to:<br/>
<a href="http://localhost:8080/SpringMVCREST/">http://localhost:8080/SpringMVCREST/</a><br/>
<a href="http://localhost:8080/SpringMVCREST/hello/chandana">http://localhost:8080/SpringMVCREST/hello/chandana</a><br/>
</body>
</html>