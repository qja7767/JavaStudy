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
	<div id="banner">
		<%@ include file="/incl/banner.jsp" %>
	</div>
		<div id="menu">
		<%@ include file="/incl/menu.jsp" %>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
	<h3>My Page</h3>
	${userId}님 환영합니다. 
	<label>Last Access Time : </label> ${lastAccessTime}
</body>
</html>
