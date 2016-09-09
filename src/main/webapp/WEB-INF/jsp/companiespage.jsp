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

<h1>Test Align Companies</h1>

<c:choose>
<c:when test="${companies eq null}">
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
		<td width="50">Company Id</td>
		<td width="50">Company Name</td>
		<td width="50">Primary Contact Name</td>
		<td width="50">Primary Contact Email</td>
		<td width="50">Primary Contact Phone</td>
		<td width="50">Total User Purchase</td>
		<td width="50">Total Active User</td>
		<td width="50">Company Status</td>
		
	</tr>
	
<c:forEach items="${companies}" var="company">
		<tr>
			<td><c:out value="${company.companyID}" /></td>
			<td><c:out value="${company.companyName}" /></td>
			<td><c:out value="${company.primaryContactName}" /></td>
			<td><c:out value="${company.primaryContactEmail}" /></td>
			<td><c:out value="${company.primaryContactPhone}" /></td>
			<td><c:out value="${company.totalUserPurchase}" /></td>
			<td><c:out value="${company.totalActiveUser}" /></td>
			<td><c:out value="${company.companyStatus}" /></td>
		</tr>
	</c:forEach> 
</table>
</c:otherwise>
</c:choose>

</body>
</html>