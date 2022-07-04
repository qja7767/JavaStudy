<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.varxyz.jv300.mod008.*" %>
<%@page import="java.net.URLDecoder" %>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<div id="content-wrapper">
	<h1>Error, 다시 입력해주세요</h1>
	<ul>		
	<c:forEach var="message" items="${errorMsgs}">
		<li>${errorMsgs}</li>
	</c:forEach>
	</ul>
    </div>
</div>
</body>
</html>