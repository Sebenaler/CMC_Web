<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> <a href="UserMenu.jsp">Back to Menu</a></p>
<%if((request.getParameter("message")) != null)
		{%>
<%=request .getParameter("message")%>
		<%}%>
<form method="post" action="Search_action.jsp" name="Login"><br>
<table style="text-align: left; width: 500px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">by STATE<br>
</td>
<td name="contains" style="vertical-align: top;"><input name="State"> </td>
</tr>
<tr>
<td style="vertical-align: top;">by NUMBER OF STUDENTS<br>
</td>
<td name="between" style="vertical-align: top;"><input name="NumberOfStudentsLower"><td name="and" style="vertical-align: top;"><input name="NumberOfStudentsUpper"><br> 
</td></td>
</tr>
<td style="vertical-align: top;"><input value="Search For Schools"
name="Search For Schools" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td style="vertical-align: top;"><input value="Reset Form"
name="Reset Form" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
</body>
</html>