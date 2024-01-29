<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Calendar" %>
<% Calendar cal=Calendar.getInstance(); %>
<%
String name=request.getParameter("username");
int h = cal.get(Calendar.HOUR_OF_DAY);
if(h>0 && h<12)
	out.println("<b>Good Morning"+name+" !!</b>");
else if(h>=12 && h<15)
	out.println("<b>Good Afternoon"+name+" !!</b>");
if(h>=15 && h<19)
	out.println("<b>Good evening"+name+" !!</b>");
else
	out.println("<b>Good night"+name+" !!</b>");


%>

</body>
</html>