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

<h1>Test Align Roles Accounts</h1>

<c:choose>
<c:when test="${roleAccts eq null}">
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
		<td width="50">Role Account Id</td>
		<td width="50">Project Id </td>
		<td width="50">Account ID</td>
		<td width="50">Role Type</td>
		
	</tr>
	
<c:forEach items="${roleAccts}" var="roleAcct">
		<tr>
			<td><c:out value="${roleAcct.roleAcctID}" /></td>
			<td><c:out value="${roleAcct.testAlignProjectMain.projectID }" /></td>
			<td><c:out value="${roleAcct.testAlignAccountsMain.accountID}" /></td>
			<td><c:out value="${roleAcct.roleType}" /></td>
	
		</tr>
	</c:forEach> 
</table>
</c:otherwise>
</c:choose>


</body>
</html>