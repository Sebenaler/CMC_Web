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
<%String s = (String)session.getAttribute("loggedInUser"); %>
Welcome User: <%=s%>
<p><a href="manageProfile.jsp">Manage My Profile</a></p>
<p><a href="manageSavedSchools.jsp">Manage My Saved Schools</a></p>
<p><a href="search.jsp">Search for Schools</a></p>
</body>
</html>