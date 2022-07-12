<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="board TEST"/>
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3>boardTest</h3>
	<form action="write.do" method="post">
	<div class="container">
	<div class="input">
	테스트번호  <input type ="text" name="testNum"/>
	</div>
	
	<div class="input">
	갤러리이름  <input type ="text" name="galleryName"/>
	</div>
	
	<div class="input">
	이름  <input type ="text" name="name"/>
	</div>
	
	<div class="input">
	전시장크기  <input type ="text" name="exhibitionArea"/>
	</div>
	
	<div class="input">
	전시장높이  <input type ="text" name="exhibitonHeight"/>
	</div>
	
	<div class="input">
	특이사항  <input type ="text" name="specialNote"/>
	</div>
	
	<div class="input">
	대여료  <input type ="text" name="rentalFee"/> 
	</div>
	
	<div class="input">
	주소  <input type ="text" name="address"/>
	</div>
	
	<div class="input">
	전화번호  <input type ="text" name="phone"/>
	</div>
	
	<div class="input">
	이메일  <input type ="text" name="email"/> 
	</div>
	
	<div class="input">
	제목  <input type ="text" name="title"/>
	</div>
	
	<div class="input">
	유저 아이디  <input type ="text" name="userId"/> 
	</div>
	
	<div class="input">
	글 내용  <input type ="text" name="boardContent"/>
	</div>
	
	<div class="input">
	관심분야
	<input type="checkbox" name="concerns" value="HTML">HTML
	<input type="checkbox" name="concerns" value="CSS" checked="checked">CSS
	<input type="checkbox" name="concerns" value="JS">JS
    <input type="submit" value="전송" class="input_button">
	</div>
   </div>
</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>

</body>
</html>