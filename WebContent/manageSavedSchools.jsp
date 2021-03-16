<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language= "java" import = "userUses.UserInteraction"%>
    <%@page language= "java" import = "cmc.School"%>
    <%@page language= "java" import = "java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
<body>
<p> <a href="UserMenu.jsp">Back to Menu</a></p>
<%String s = (String)session.getAttribute("loggedInUser");
UserInteraction ui = new UserInteraction();
List<School> schools = ui.viewSavedSchools();%>
<table style="text-align: left; width: 500px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
	<tr>
	<td width="45%" name= "SchName" style= "vertical-allign: top;">School Name<br>
	</td>
	<td width="9%" name= "ViewSch" style= "vertical-allign: top;">View<br>
	</td>
	</tr>
<%for(int i = 0; i < schools.size(); i++){%>
	<tr>
	<td name= "SchoolName" style= "vertical-allign: top;"><%=schools.get(i).getName()%><br>
	</td>
	<td style="vertical-align: top;">
	<form method="post" action="ViewSavedSchools_action.jsp" name="View">
    <input name="View" value="View" type="submit">
    <input name="SchoolName" value="<%=schools.get(i).getName()%>" type="hidden">
	</form>
	</td>
	</tr>
<%} %>
</tbody>
</table>
<br>
</body>
</html>