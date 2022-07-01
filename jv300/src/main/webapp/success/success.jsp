<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>success</h1>
	<%
	String userName = (String)request.getAttribute("userName");
	String passwd = (String)request.getAttribute("passwd");
	String userId = (String)request.getAttribute("userId");
	String ssn = (String)request.getAttribute("ssn");
		%>
	<h3>Test, <%=userName %></h3>
	<h3>Test, <%=passwd %></h3>
	<h3>Test, <%=userId %></h3>
	<h3>Test, <%=ssn %></h3>
</body>
</html>