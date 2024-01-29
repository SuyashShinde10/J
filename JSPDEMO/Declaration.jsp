<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int myVar=15;%>
<%!String str="My String"; %>
<%!class Circle{
	double rad;
	Circle(double rad){
		this.rad=rad;
	}
	public String toString(){
		return"Radious of circle="+rad;
	}
	}
	%>
	<%!Circle crObj=new Circle(15.5); %>
	<% out.println(crObj); %>
	
	<%out.print(myVar); %>
	
	<%for(int fontsize=1;fontsize<=3;
			fontsize++){%>
			<font color="red" size="<%=fontsize%>
			"
			
}
</body>
</html>