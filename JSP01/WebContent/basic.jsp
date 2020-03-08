<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>

<h1>Hello World of Java</h1>

<!-- 결과를 출력하는 자바 표현식 -->
The time on the server is <%= new java.util.Date() %>
<br>
지금 시간은 <%= new java.util.Date() %>
<br>
converting a string to uppercase: <%= new String("hello nice to meet you").toUpperCase() %>
<br>
4 * 3 = <%= 4*3 %>
<br>
boolean: 7은 5보다 작다 ?  <%= 7 < 5 %>
<br><br>


<!-- 스크립틀릿 scriptlet -->
<%
	for (int i = 1; i <= 5; i++){
		out.println("<br>hello~~ " + i);
	}
%>
<br><br>


<!-- 선언식과 표현식의 활용 -->
<%!
	String makeItLower(String data) {
	return data.toLowerCase();
}
%>
<br>
Lower Case HIHIHIHIHI~ :  <%= makeItLower("HIHIHIHIHIHIHI~~~") %>

</body>
</html>