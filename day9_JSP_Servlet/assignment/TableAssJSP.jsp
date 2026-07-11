<%@ page language="java" %>

<html>
<body>

<h2>Multiplication Table of 5</h2>

<table border="1">

<%
for(int i = 1; i <= 10; i++){
%>

<tr>
    <td>5 × <%= i %></td>
    <td>=</td>
    <td><%= 5 * i %></td>
</tr>

<%
}
%>

</table>

</body>
</html>