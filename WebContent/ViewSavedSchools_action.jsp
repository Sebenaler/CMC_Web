<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page language= "java" import = "cmc.School"%>
     <%@page language= "java" import = "cmc.DBController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
<body>
<p> <a href="manageSavedSchools.jsp">Go Back to Saved Schools</a></p>
<%	String n = request.getParameter("SchoolName");
	School school = DBController.getSchoolByName(n);
	String schName = school.getName();
	String state = school.getState();
	String numStuds = school.getNumStudents();
	String loc = school.getLocation();
	String con = school.getControl();
	String percF = school.getPercentFemale();
	String satV = school.getSatVerbal();
	String satM = school.getSatMath();
	String expen = school.getExpenses();
	String percAid = school.getPercentAid();
	String numApps = school.getNumApplicants();
	String percAdmit = school.getPercentAdmitted();
	String percEnroll = school.getPercentEnrolled();
	String aceScale = school.getAcademicScale();
	String socScale = school.getSocialScale();
	String qOLS = school.getQualityOfLife();
	//System.out.println(schName + "\n" + state + "\n" + numStuds);
	%>
<form method="post" name="SchoolInfo"><br>
<table style="text-align: left; width: 500px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">SCHOOL<br>
</td>
<td style="vertical-align: top;"><input name="School" value="<%=schName%>" disabled></td>
</tr>
<tr>
<td style="vertical-align: top;">STATE<br>
</td>
<td style="vertical-align: top;"><input name="State" value="<%=state%>" disabled></td>
</tr>
<tr>
<td style="vertical-align: top;">LOCATION<br>
</td>
<td style="vertical-align: top;"><input name="Location" value="<%=loc%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">CONTROL<br>
</td>
<td style="vertical-align: top;"><input name="Control" value="<%=con%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">NUMBER OF STUDENTS<br>
</td>
<td style="vertical-align: top;"><input name="NumberOfStudents" value="<%=numStuds%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">PERCENT FEMALE<br>
</td>
<td style="vertical-align: top;"><input name="PercentFemale" value="<%=percF%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">SAT VERBAL<br>
</td>
<td style="vertical-align: top;"><input name="SATVERBAL" value="<%=satV%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">SAT MATH<br>
</td>
<td style="vertical-align: top;"><input name="SATMATH" value="<%=satM%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">EXPENSES<br>
</td>
<td style="vertical-align: top;"><input name="EXPENSES" value="<%=expen%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">PERCENT FINANCIAL AID<br>
</td>
<td style="vertical-align: top;"><input name="PercentAID" value="<%=percAid%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">NUMBER OF APPLICANTS<br>
</td>
<td style="vertical-align: top;"><input name="NumberOfApplicants" value="<%=numApps%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">PERCENT ADMITTED<br>
</td>
<td style="vertical-align: top;"><input name="PERCENTADMITTED" value="<%=percAdmit%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">PERCENT ENROLLED<br>
</td>
<td style="vertical-align: top;"><input name="PercentEnrolled" value="<%=percEnroll%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">ACADEMIC SCALE<br>
</td>
<td style="vertical-align: top;"><input name="AcademicScale" value="<%=aceScale%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">SOCIAL SCALE<br>
</td>
<td style="vertical-align: top;"><input name="SocialScale" value="<%=socScale%>" disabled> </td>
</tr>
<tr>
<td style="vertical-align: top;">QUALITY OF LIFE<br>
</td>
<td style="vertical-align: top;"><input name="QualityofLife" value="<%=qOLS%>" disabled> </td>
</tr>
</tbody>
</table>
<br>
</form>
</body>
</html>