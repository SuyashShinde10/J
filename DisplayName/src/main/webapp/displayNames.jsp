<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>List of Names</h1>
    
    <%
        // Define an array of names
        String[] names = {"Yash", "Aniket", "Rahul", "Aditya", "Suyash"};
        
        // Iterate through the array and display each name
        for (String name : names) {
    %>
            <p><%= name %></p>
    <%
        }
    %>

</body>
</html>