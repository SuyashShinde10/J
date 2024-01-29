<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html>
<html>
<head>                                          
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Wellcome to First JSTL Program. ' }"> </c:out><br>
	Name is <c:out value="${param.userNM }"></c:out><br>
	Age is <c:out value="${param.age }"></c:out><br>
	
	<c:set var="userNM"  scope="session" value="${param.userNM }"> </c:set>
	User Name in session is - <c:out value="${userNM }"></c:out> <br>
	<c:set var="age"  scope="session" value="${param.age }"> </c:set>
	User Age in session is - <c:out value="${age }"></c:out><br> 
	
	<c:if test="${age>18 }">
		<c:out value="${'Your eligible for voting!' }"></c:out>
	</c:if>
	
	<c:set var="income"  scope="session" value="${4000*4}"> </c:set>
	<c:if test="${income>8000 }">
		<p>Your income is : <c:out value="${ income}"></c:out></p>
	</c:if>
	
	<c:forEach var="i" begin="5" end="10">
		Count is : <c:out value="${i}"></c:out>
	</c:forEach>
	
	<br>
	<c:set var="myNM" value="Suyash"></c:set>
	<c:set var="clgNM" value="FAMT"></c:set>
	Hi!,This is ${fn:toUpperCase(myNM)} at college ${fn: toUpperCase(clgNM)}.
	
		<c:set var="Ammount" value="9999.9999"></c:set>
		<fmt:parseNumber var="j" type="number" value="${Ammount }"> </fmt:parseNumber>
		<p> <i> Ammount is :</i> <c:out value="${j }"></c:out> </p>
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>