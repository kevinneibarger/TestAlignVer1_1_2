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

<h1>Test Align Accounts</h1>

<c:choose>
<c:when test="${accounts eq null}">
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
		<td width="50">Account Id</td>
		<td width="50">Company ID</td>
		<td width="50">First Name</td>
		<td width="50">Last Name</td>
		<td width="50">Email Address</td>
		<td width="50">Password1</td>
		<td width="50">Account Status</td>
		<td width="50">Create Date</td>
		<td width="50">Last Login Date</td>
		
	</tr>
	
	<c:forEach items="${accounts}" var="account">
		<tr>
			<td><c:out value="${account.accountID}" /></td>
			<td><c:out value="${account.testAlignCompanyMain.companyID}" /></td>
			<td><c:out value="${account.firstName}" /></td>
			<td><c:out value="${account.lastName}" /></td>
			<td><c:out value="${account.emailAddress}" /></td>
			<td><c:out value="${account.password1}" /></td>
			<td><c:out value="${account.accountStatus}" /></td>
			<td><c:out value="${account.createDate}" /></td>
			<td><c:out value="${account.lastLoginDate}" /></td>
		</tr>
	</c:forEach>
	</table>
</c:otherwise>
</c:choose> 

</body>
</html>