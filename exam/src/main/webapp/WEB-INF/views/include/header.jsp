<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="/css/common.css">
<h1 class="center">Welcome!!</h1>
<div id="loginform">
    <c:if test="${empty loginMember }">
        <form method="post" action="/member/login">
            <input type="text" name="memberId">
            <input type="text" name="memberPass">
            <input type="submit" value="login">
        </form>
    </c:if>
    <c:if test="${!empty loginMember }">
        ${loginMember.memberName } 님 반갑습니다. <a href="/member/logout">로그아웃</a>
    </c:if>
</div>
<br>
<div>
    [<a href="/">홈</a>] [<a href="/member/list">사용자 관리</a>]
</div>
<hr>
