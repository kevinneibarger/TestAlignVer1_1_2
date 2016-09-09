<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Test Align - Log-in(4)</title>
  <%-- <link href="../../css/testalign.css" rel="stylesheet" type="text/css"/>--%>
    <link href="${pageContext.request.contextPath}/css/testalign.css" rel="stylesheet" type="text/css"/> 
</head>

<body style="background:#F2F2F2">

  <jsp:include page="navigationBar.jsp" />
   <br/><br/><br/><br/><br/><br/><br/><br/>
  <div class="login-card">
 
  	<p style="color:red;"> Sorry this user has currently been deactivated. Please contact your local Admin. </p>
  	<br/><br/><br/>
  	<p style="color:red;">OR... </p>
  	<br/><br/><br/>
  	<p style="color:red;"> Sorry this Company has been locked. Please contact your local Admin.</p>
  
</div>

</body>

</html>