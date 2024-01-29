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
        // Retrieve the name parameter from the request
        String name = request.getParameter("name");
        
        // Check if the name is null or empty
        if (name == null || name.isEmpty()) {
            out.println("Please enter your name.");
        } else {
            // Generate a greeting message
            String greeting = "Good Morning, " + name + "!";
            out.println("<h1>" + greeting + "</h1>");
        }
    %>

</body>
</html>