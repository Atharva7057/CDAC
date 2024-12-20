<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
	int a = 10;
	
	public int pageVisited(){
		return a++;
	}

%>

<body>
<h1>User Details</h1>
<h1>SessionId: <%= session.getId() %></h1>
<h2>Hello, ${sessionScope.details.name}</h2>
<h2>The sum is <%=a%></h2>

<h5><a href = logout.jsp>log me out</a></h5>
</body>
</html>