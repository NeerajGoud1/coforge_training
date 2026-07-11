<%@ page language="java" %>

<html>
<body>

<%!
int a = 10;

public int square(int x){
    return x * x;
}
%>

<%
int b = 20;
%>

<h2>Declaration Variable: <%= a %></h2>

<h2>Scriptlet Variable: <%= b %></h2>

<h2>Square of 5: <%= square(5) %></h2>

</body>
</html>