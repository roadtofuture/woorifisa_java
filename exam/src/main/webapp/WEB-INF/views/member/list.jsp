<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%@include file="/WEB-INF/views/include/header.jsp"%>
    <h1>사용자 목록</h1>
    <table>
        <tr>
            <th>id</th>
            <th>pass</th>
            <th>name</th>
        </tr>
        <c:forEach items="${page.content }" var="member">
			<tr>
				<td>${member.memberId }</td>
				<td>${member.memberPass }</td>
				<td>${member.memberName }</td>
			</tr>
		</c:forEach>
    </table>
    <div class="center">
        <form method="get" action="/member/list">
            <input type="text" name="page" value="${page.number+1}"}>
            / ${page.totalPages }
            <input type="submit" value="이동">
        </form>
    </div>
</body>
</html>
