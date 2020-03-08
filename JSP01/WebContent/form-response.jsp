<%@ page contentType="text/html; charset=euc-kr" %> 
<html>
<body>
이름: ${param.userName} 
<br><br>
국가: ${param.contry}
<br><br>
제일 좋아하는 언어: ${param.lan}
<br><br>
좋아하는 언어: 
<ul>
<%
	String[] langs = request.getParameterValues("multiLan");
	
	if (langs != null) {
		for (String t : langs) {
			out.println("<li>" + t + "</li>");
		}
	}
%>
</ul>
</body>
</html>