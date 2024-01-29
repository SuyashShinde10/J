<%@page import="java.beans.IntrospectionException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page buffer="5kb" autoFlush="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Buffer Demo </title>
</head>
<body>
<%	
	out.println("Hello !, this is page buffer demo.<br>");
	out.flush();
	
%>
<%	
	out.println("This is some content added to buffer.<br>");	
%>
<%
	out.println("This is some content added to buffer<br>");

	for(int i=1;i<10;i++)
	{
		out.println(i+"This is some content added to buffer.<br>");
	}
	
%>
<%	
	out.println("This is some content added to buffer.<br>");	
	try
	{
		Thread.sleep(5000);
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	out.flush();
%>
<%	
	out.println("This  content is not in the buffer and will be sent directly. <br>");	
%>
</body>
</html>