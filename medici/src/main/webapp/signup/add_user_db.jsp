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
			<jsp:param name="subtitle" value="mod009 : 0706 Connection TEST"/>
		</jsp:include>
	</div>
	<div id="signup_wrapper">
		<h3>회원가입</h3>
	<form action="add_user_db.do" method="post">
		<div class="container">
			<div class="input">
		아이디  <input type ="text" name="userId"/>
			</div>
			<div class="input">
		비밀번호  <input type ="password" name="passwd"/>
			</div>
			<div class="input">
		한국 이름  <input type ="text" name="koreanName"/>
			</div>
			<div class="input">
		영문 이름  <input type ="text" name="koreanName"/>
			</div>
			<div class="input">
		주민번호  <input type ="text" name="ssn"/>
			</div>
			<div class="input">
		학력  <input type ="text" name="koreanName"/>
			</div>
			<div class="input">
		경력(개인전 단체전 기타) <input type ="text" name="koreanName"/>
			</div>						
			<div class="input">
		이메일1  <input type ="text" name="email"/>		 
   이메일2<select name="email2">
	    	<option value="google.com">google.com</option>
    		<option value="naver.com">naver.com</option>
    		<option value="daum.com">daum.net</option>
	    	<option value="korea.com">koreait.com</option>
		</select>
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