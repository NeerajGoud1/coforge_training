<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- JSP Declaration Tag--%>
	<%!
	String name = "Neeraj";
	int a = 10, b = 20;
	%>
	
	<%-- JSP Scriptlet Tag--%> 
	<%
	out.println("Welcome " + name + "<br/>");
	if(a > b){
		out.println("A is Big" + "<br/>");
	}else{
		out.println("B is Big" + "<br/>");
	}
	
	int sum = a + b;
	%>

	
	<%--JSP Expression Tag --%>
	sum = <%= sum %>
	

</body>
</html>