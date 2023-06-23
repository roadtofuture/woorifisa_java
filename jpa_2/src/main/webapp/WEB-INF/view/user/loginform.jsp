<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<c:if test="${empty loginName }">
		<form method="post" action="/user/login">
			<input type="text" placeholder="아이디는 Name" name="id"> <input
				type="text" placeholder="비번은 District" name="pass"> <input
				type="submit" value="로그인">
		</form>
	</c:if>

	<c:if test="${!empty loginName }">
	${loginName } 님 반갑습니다. <a href="/user/logout">로그아웃</a>
	</c:if>

</body>
</html>