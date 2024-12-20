<%@page import="day6.pojo.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		HashMap<String,User> user;
		public void jspInit(){
			user = new HashMap<>();
			user.put("atharvapatil7057@gmail.com",new User("Atharva","atharvapatil7057@gmail.com","123"));
			user.put("amey@gmail.com",new User("Amey","amey@gmail.com","1234"));
		}
	
	%>
	<%
		
	    String email = request.getParameter("em");
		String pwd = request.getParameter("pass");
		User userdetails = user.get(email);
		if(userdetails != null){
			if(pwd.equals(userdetails.getPassword())){
				RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
				/* response.sendRedirect("details.jsp"); */	
				session.setAttribute("details", userdetails);
				rd.forward(request, response);
				
			}else{
				out.print("<h3>Invalid user <a href=login.jsp>Try Again!</a> <h3>");
			}
		}else{
			out.print("<h3>Invalid user <a href=login.jsp>Try Again!</a> <h3>");
		}
	
	%>
	
</body>
</html>