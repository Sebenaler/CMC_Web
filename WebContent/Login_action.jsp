<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language= "java" import = "userUses.UserInteraction"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
<body>
<% 	String un = request.getParameter("Username");
	String pass = request.getParameter("Password");
	UserInteraction ui = new UserInteraction();
	boolean result = ui.login(un, pass);
	if(result == true)
	{
		response.sendRedirect("UserMenu.jsp");
		session.setAttribute("loggedInUser", un);
	}
	else
	{
		response.sendRedirect("index.jsp?message= Error Message: Invalid Username or Password!");
	}%>
</body>
</html>
