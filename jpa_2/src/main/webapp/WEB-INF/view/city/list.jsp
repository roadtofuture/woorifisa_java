<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도시 목록(전체)</h1>
	<ul>
		<c:forEach items="${cities }" var="city">
			<li>${city }
		</c:forEach>
	</ul>
</body>
</html>