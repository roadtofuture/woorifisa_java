<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.servletContext.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${empty loginName }">
		<h1>로그인 - 세션에서 loginName이 없을 때만 필요</h1>
		<form action="${root }/login" method="post">
		
			<!-- post로 보낸다는 말 외에는 모두get방식 -->
			<!-- loginservlet이 받음 -->
			<!-- 보안상의 이유로 post로 -->
			
			<input name="id" type="text"> 
			<input name="password" type="password"> 
			<input type="submit" value="login">
			
		</form>
	</c:if>
	<c:if test="${!empty loginName }">
		${loginName}님 반갑습니다.  <!-- 값을 출력해야 하니까 -->
		<a href="${root }/logout">로그아웃</a>
	</c:if>


</body>
</html>