<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ page import="java.util.*" %>
<html>
<body>
<h1>To Do List</h1>
<form action="todo.jsp">

할 일 : <input type="text" name="listItem">

<input type="submit" value="등록하기">

</form>

<!-- 세션에 저장하고 가져오기 -->
<%
	List<String> items = (List<String>) session.getAttribute("listItem");

	if(items == null) {
		items = new ArrayList<String>();
		session.setAttribute("listItem", items);
	}

	String theItem = request.getParameter("listItem");
	if (theItem != null) {
		items.add(theItem);
	}
%>

할 일 목록 :
<ol>
<%
	for (String temp : items) {
		out.println("<li>" + temp + "</li>");
	}
%>
</ol>





</body>
</html>