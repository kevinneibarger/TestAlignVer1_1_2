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

<h1>Test Align Login Dashboard</h1>
<!-- Temp hidden params to show working architecture -->
<input type="hidden" name="companyName" value="Rammstien Company" />
<input type="hidden" name="emailAddr" value="tillindemann@xyzcomp.com" />
<input type="hidden" name="password" value="lindemann666" />

<c:choose>
<c:when test="${invalidUser ne null}">
<table>
	<tr>
		<td width="50">Error Message</td>
	</tr>
	<tr>
		<td> <c:out value="${invalidUser}"/>
	</td>
	</tr>
</table>
</c:when>
<c:otherwise>

<table>
	<tr>
		<td width="50">Willkommen!</td>
	</tr>
	<tr>
		<td> <c:out value="${validUser}"/>
	</td>
	</tr>
</table>
</c:otherwise>
</c:choose>

</body>
</html>