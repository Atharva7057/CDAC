<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Thank you ,${sessionScope.details.name}!</h5>
	<h5>Logging you out....</h5>
	<%
		session.invalidate();
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request,response);/* 
		response.sendRedirect("login.jsp"); */
	%>
	
</body>
</html>