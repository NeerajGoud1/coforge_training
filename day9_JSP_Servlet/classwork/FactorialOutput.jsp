<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="FactorialInput.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n = request.getParameter("n");
String fact = request.getParameter("fact");

%>

<h1>input : <%=n%></h1>
<h1>fact : <%=fact%></h1>

</body>
</html>