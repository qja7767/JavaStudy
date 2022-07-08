<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>My Page</h3>
	${userId}님
	<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>
	<label>Last Access Time : </label> ${lastAccessTime}
		<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>
		<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>
		<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>
		<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>		
</body>
</html>
