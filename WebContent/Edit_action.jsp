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
<%	String pass = request.getParameter("Password");
	String fN = request.getParameter("FirstName");
	String lN = request.getParameter("LastName");
	UserInteraction ui = new UserInteraction();
	ui.editProfile(fN, lN, pass);
	if(fN == "" || lN == "" || pass == "")
	{
		response.sendRedirect("manageProfile.jsp?message= Error Message: All parameters must be filled!");
	}
	else{
		response.sendRedirect("manageProfile.jsp?message=");
	}
	%>
	
	
</body>
</html>