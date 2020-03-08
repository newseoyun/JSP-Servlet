<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2> HTTP 통신 테스트 </h2>

Request user agent: <%= request.getHeader("user-Agent") %>
<br><br>
Request language: <%= request.getLocale() %>

<!-- 이걸 이용해서 사용자 시스템, 언어에 따라 다른 서비스를 제공할 수 있다  -->
</body>
</html>