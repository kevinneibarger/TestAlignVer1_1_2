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
  
  <form action="${pageContext.request.contextPath}/testalign/testaligncontroller/projectLogin/">
  	<input type="text" name="company" placeholder="Company"><br/>
    <input type="text" name="user" placeholder="Username"><br/>
    <input type="password" name="pass" placeholder="Password"><br/>
    <input type="submit" name="login" class="login login-submit" value="Sign In"><br/>
    <input type="checkbox" name="ssoLogin"> Stay signed in &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="">Need Help?</a>
  </form>
</div>

</body>

</html>