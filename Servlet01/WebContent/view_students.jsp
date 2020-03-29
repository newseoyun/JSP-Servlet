<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>
	<c:forEach var="tempStudent" items="${student_list}">
		${tempStudent} <br>
	</c:forEach>
</h1>
</body>
</html>