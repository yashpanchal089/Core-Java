<%@ page errorPage="exception.jsp" %>>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String num1=request.getParameter("number1");
String num2=request.getParameter("number2");
float n1=Float.parseFloat(num1);
float n2=Float.parseFloat(num2);
float result=n1/n2;
out.print("Output is: "+ result);
%>

</body>
</html>