<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Align, the only Online Testing you'll ever need!!</title>
</head>
<body>

<h1>Test Align Projects</h1>

<c:choose>
<c:when test="${projects eq null}">
<table>
	<tr>
		<td width="50">Error Message</td>
	</tr>
	<tr>
		<td> <c:out value="${nodata}"/>
	</td>
	</tr>
</table>
</c:when>
<c:otherwise>

<table>
	<tr>
		<td width="50">Project Id</td>
		<td width="50">Project Name</td>
		<td width="150">Project Description</td>
		<td width="50">Release Name</td>
		<td width="150">Release Description</td>
		<td width="50">Target Start Date</td>
		<td width="50">Target Close Date</td>
		<td width="50">Company ID</td>
		<td width="50">Last Activity Date</td>
		
	</tr>
	
<c:forEach items="${projects}" var="project">
		<tr>
			<td><c:out value="${project.projectID}" /></td>
			<td><c:out value="${project.projectName}" /></td>
			<td><c:out value="${project.projectDesc}" /></td>
			<td><c:out value="${project.releaseName}" /></td>
			<td><c:out value="${project.releaseDesc}" /></td>
			<td><c:out value="${project.targetStartDate}" /></td>
			<td><c:out value="${project.targetCloseDate}" /></td>
			<td><c:out value="${project.testAlignCompanyMain.companyID}" /></td>
			<td><c:out value="${project.lastActivityDate}" /></td>
		</tr>
	</c:forEach> 
</table>
</c:otherwise>
</c:choose>

</body>
</html>