<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.varxyz.jv300.mod007.*" %>
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
<%
		@SuppressWarnings("unchecked")
		List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");		
		for(String errorMsg : errorMsgs){
%>
		<li><%=errorMsg %></li>	
<%
		}	
%>
	</ul>		
    </div>
</div>
</body>
</html>