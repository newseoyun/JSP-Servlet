<%@ page contentType="text/html; charset=euc-kr" %> 
<html>
<body>
�̸�: ${param.userName} 
<br><br>
����: ${param.contry}
<br><br>
���� �����ϴ� ���: ${param.lan}
<br><br>
�����ϴ� ���: 
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