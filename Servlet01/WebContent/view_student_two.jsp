<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Student Table Two</h1>
<table border="1">
	<tr>
		<th>Name</th>
		<th>Email</th>
	</tr>
	
	<c:forEach var="tempStudent" items="${student_list}">
	<tr>
		<td>${tempStudent.name}</td>
		<td>${tempStudent.email}</td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>