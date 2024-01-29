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

	String uname = null; 
    String pwd = null; 
%>
<%
	uname=request.getParameter("name");
    pwd=request.getParameter("password");
    if(uname.equals("admin") && pwd.equals("password"));
    {
    	config.getServletContext().getRequestDispatcher("/welcome.jsp").forward(request,response);
    }
    else
    {
    	config.getServletContext().getRequestDispatcher("/index2.jsp").forward(request,response);
		out.print("Invalid Password !!! Reenter password!!!");
    }



%>
</body>
</html>