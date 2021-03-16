<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language= "java" import = "userUses.UserInteraction"%>
    <%@page language= "java" import = "account.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
<body>

<p> <a href="UserMenu.jsp">Back to Menu</a></p>
<%if((request.getParameter("message")) != null)
		{%>
<%=request .getParameter("message")%>
		<%}%>
<%String s = (String)session.getAttribute("loggedInUser");
UserInteraction ui = new UserInteraction();
User user = ui.viewProfile();
String fn = user.getFn();
String ln = user.getLn();
String un = user.getUn();
String pass = user.getPass();
String type = user.getType();%>
<form method="post" action="Edit_action.jsp" name="Login"><br>
<table style="text-align: left; width: 500px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">First Name:<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value=<%=fn%>>  </td>
</tr>
<tr>
<td style="vertical-align: top;">Last Name:<br>
</td>
<td style="vertical-align: top;"><input name="LastName" value=<%=ln%>> </td>
</tr>
<tr>
<td style="vertical-align: top;">Username:<br>
</td>
<td style="vertical-align: top;"><input name="Username" value=<%=un%> readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password:<br>
</td>
<td style="vertical-align: top;"><input name="Password" value=<%=pass%> > </td>
</tr>
<tr>
<td style="vertical-align: top;">Type:<br>
</td>
<td style="vertical-align: top;"><input name="Type" value=<%=type%> readonly> </td>
</tr>
<td style="vertical-align: top;"><input value="Edit User"
name="Edit User" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td style="vertical-align: top;"><input value="Reset"
name="Reset" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
</body>
</html>