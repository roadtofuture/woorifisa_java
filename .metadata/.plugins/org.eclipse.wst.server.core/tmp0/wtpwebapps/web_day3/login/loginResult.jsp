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
	<h1>로그인 성공</h1>
	${ loginName}님 반갑습니다.
	<a href="${root }/login/loginform.jsp">처음으로</a>

	<h2>위시리스트</h2>
	<form action="${root }/cart" method="post">
		<input type="text" name="product"> <input type="submit"
			value="담기">

	</form>

	<h2>장바구니 현황</h2>
	<div>
		<c:if test="${empty cart }">
			<h1>텅</h1>
		</c:if>
		<c:if test="${!empty cart }">
			<c:forEach items = "${cart }" var="item">
				${item }<br>
			</c:forEach>
		</c:if>
		<!-- cart이름을 가진 걸 불러올거기 때문에 세션도 cart라는 이름으로 저장해야함 -->
	</div>
	<form action="${root }/buy" method="post">
		<input type="submit" value="구매하기">
	</form>
</body>
</html>