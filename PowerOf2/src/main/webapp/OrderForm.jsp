<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Order Form</title>
</head>

<body>
<h1 align="center">A Sample Order Form</h1>

<%! String item []={"Pen", "Pencil", "Book", "Mouse", "Keyboard"} ;
	double price[]={10.10, 5.5, 99.99, 200.00, 600.00};
	int quantity[]={10,12,12,5,2};
%>
	
<table align="center" bgcolour="Blue" border="1" width="50%">

<tr><td>Item</td>
	<td>Price</td>
	<td>Quantity</td>
	<td>Total Price</td>
</tr>

<%for(int i=0;i<5;i++){ %>
<tr><td><%=item[i] %></td>
	<td><%=price[i] %></td>
	<td><%=quantity[i] %></td>
	<td><%=price[i] * quantity[i] %></td>
	
<%}//end for loop %>

</table>
</body>
</html>