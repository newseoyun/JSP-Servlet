<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.seoyun.Student %>

<%
	List<Student> data = new ArrayList<>();

	data.add(new Student("John", true));
	data.add(new Student("Chad", false));
	data.add(new Student("Sia", true));

	pageContext.setAttribute("myStudent", data); /* 여길 주의할 것. data 바로 안쓰고 myStudent에 넣었음 */
%>

<html>
<body>

<c:set var="stuff" value="<%= new java.util.Date() %>" />

현재시간: ${stuff}
<br><br>

	<c:forEach var="stu" items="${myStudent}">
		${stu.name}, ${stu.goldCustomer}
	</c:forEach>


</body>

</html>