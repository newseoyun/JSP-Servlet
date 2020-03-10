<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="java.util.*, com.seoyun.Student" %>

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

<table border="1">
<tr>
	<th>Name</th>
	<th>Gold Customer</th>
	<th></th>
</tr>

	<c:forEach var="stu" items="${myStudent}">
		<tr>
			<td>${stu.name}</td>
			<td>${stu.goldCustomer}</td>
			<td>
				<c:if test="${stu.goldCustomer}">
					Special Discount
				</c:if>
				<c:if test="${not stu.goldCustomer}">
					-
				</c:if>
			</td>
		</tr>
	</c:forEach>
	
</table>
<br><br>
<h2>* 간단한 fn 테스트</h2>
<br>
<c:set var="data" value="hello~" />
Length of the string <b>${data}</b>: ${fn:length(data)}
<br><br>
Uppercase version of teh string <b>${data}</b>: ${fn:toUpperCase(data)}
<br><br>
Does the string <b>${data}</b> start with <b>hell</b>?: ${fn:startsWith(data, "hell")}
<br><br><br>

<h2>* fn split</h2>
<c:set var="cities" value="Seoul,Tokyo,Beijing,London,LA" />
<c:set var="citiesArray" value="${fn:split(cities, ',')}" />
<c:forEach var="tempCity" items="${citiesArray}">
	${tempCity} <br>
</c:forEach>
<br><br>

<h2>* fn join</h2>
<c:set var="fun" value="${fn:join(citiesArray, '*')}" />
Result of joining: ${fun}


</body>

</html>