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
	<%
	//scriptlet "_jsp.service의 local 영역 
	String name = "hong";
	%>
	<!-- expression 출력하고 싶을때 -->
	<%-- jsp주석을 써야 html상에 남아있지 않음 --%>
	<%=name%>
	<!-- declaration tag: member 구성  -->
	<%!public String hi(String name) {
		return "hi " + name;
	}%>
	<%=hi("jang")%>

	<h1>더해볼까?</h1>
	<!-- action에 링크를 연결해줘야 하는데 container 다음에  -->
	<form action="${root }/add" method="get">
		<input type="checkbox" name="type" value="forward" id="type">
		<label for="type">forward</label> <input name="num1" type="text">
		<input name="num2" type="text"> <input type="submit"
			value="plus">
	</form>

</body>
</html>

<!--  결론적으로는 서블릿으로 돌아가게 되는  -->
<!-- jsp를 실행하는 것임 -->