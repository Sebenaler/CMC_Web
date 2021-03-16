<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language= "java" import = "cmc.DBController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String s = request.getParameter("SchoolName2");
String n = (String)session.getAttribute("loggedInUser");
DBController.saveSchool(n, s);%>
<%
response.sendRedirect("search.jsp");
%>
</body>
</html>