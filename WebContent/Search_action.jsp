<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language= "java" import = "userUses.UserInteraction"%>
    <%@page language= "java" import = "cmc.School"%>
    <%@page language= "java" import = "java.util.List"%>
    <%@page language= "java" import = "cmc.DBController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String state = request.getParameter("State");
String numStLower = request.getParameter("NumberOfStudentsLower");
String numStUpper = request.getParameter("NumberOfStudentsUpper");
int numStL;
int numStU;

if(numStLower == "" || numStLower == null) {
	numStL = -1;
}
else {
	numStL = Integer.valueOf(numStLower);
}

if(numStUpper == "" || numStLower == null) {
	numStU = -1;
}
else {
	numStU = Integer.valueOf(numStUpper);
}

UserInteraction ui = new UserInteraction();
List<School> schools = ui.search(state, numStL, numStU);
if(schools.size() == 0)
{
	response.sendRedirect("search.jsp?message= No Schools Found!");
}%>
<table style="text-align: left; width: 700px; height: 250px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
	<td width="42%" name= "SchoolName" style= "vertical-allign: top;">School Name<br>
	</td>
	<td width="25%" name= "State" style= "vertical-allign: top;">State<br>
	</td>
	<td width="15%" name= "NumberOfStudents" style= "vertical-allign: top;">Number of Students<br>
	</td>
	<td width="9%" name= "View" style= "vertical-allign: top;">View<br>
	</td>
	<td width="9%" name= "Save" style= "vertical-allign: top;">Save<br>
	</td>
	</tr>
<%for(int i = 0; i < schools.size(); i++) {%>
	<tr>
	<td name= "SchoolName" style= "vertical-allign: top;"><%=schools.get(i).getName()%><br>
	</td>
	<td name= "State" style= "vertical-allign: top;"><%=schools.get(i).getState()%><br>
	</td>
	<td name= "NumberOfStudents" style= "vertical-allign: top;"><%=schools.get(i).getNumStudents()%><br>
	</td>
	<td style="vertical-align: top;">
	<form method="post" action="ViewSearchedSchool_action.jsp" name="View">
    <input name="View" value="View" type="submit">
    <input name="SchoolName" value="<%=schools.get(i).getName()%>" type="hidden">
	</form>
	</td>
	<td style="vertical-align: top;">
	<form method="post" action="SaveSchool_action.jsp" name="Save">
    <input name="Save" value="Save" type="submit" >
    <input name="SchoolName2" value="<%=schools.get(i).getName()%>" type="hidden">
	</form>
	</td>
	</tr>
<%}%>
</tbody>
</table>
<br>
<script>

function saveSchool(){
	<%
String s = request.getParameter("SchoolName2");
String n = (String)session.getAttribute("loggedInUser");
DBController.saveSchool(n, s);%>
}
</script>
</body>
</html>