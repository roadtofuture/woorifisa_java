<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/view/include/header.jsp"%>
	<h1>게시글 상세</h1>
	<form method="post" action="/board/update">
		<!-- <input type="hidden" name="userId" value="${board.user.id}">-->
		<input type="text" name="no" value="${board.no }" readonly="readonly"><br>
		<input type="text" name="userId" value="${board.user.id }" readonly="readonly"><br>
		<input type="text" name="title" value="${board.title }"><p>
		<textarea rows="10" cols="100" name="content">${board.content }</textarea>
		<p>

			<c:if test="${!empty loginUser && loginUser.id==board.user.id }">

				<input type="submit" value="수정">
				<a href="/board/delete?no=${board.no }"><input type="button"
					value="삭제"></a>
			</c:if>
	</form>
</body>
</html>