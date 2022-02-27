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
   String str1=request.getParameter("number1");   
   String str2=request.getParameter("number2");
   try{
	   //str1="";
	   float n1=Float.parseFloat(str1);
	   float n2=Float.parseFloat(str2);
	   float result=n1+n2;
	   out.print("Output is: "+ result);
   }
   catch(Exception e){
	  // System.out.println("exception:"+e);

   }
%>
</body>
</html>