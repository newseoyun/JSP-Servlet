<%@ page contentType="text/html; charset=UTF-8" %> 
<html>
<body>
<h1>쿠키 냠냠</h1>

<br><br>

<%
	Cookie theCookie = new Cookie("NyamNyamCookie", "test");
	theCookie.setMaxAge(60*60);
	response.addCookie(theCookie);
%>


</body>
</html>