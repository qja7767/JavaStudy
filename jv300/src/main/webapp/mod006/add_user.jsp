<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add_user.do" method="post">
	<div class="container">
	<div class="input">
	아이디  <input type ="text" name="userId"/>
	<input type="submit" value="확인" class="input_button"/>
	</div>
	<div class="input">
	비밀번호  <input type ="password" name="passwd"/>
	<input type="submit" value="확인" class="input_button"/>
	</div>
	<div class="input">
	이름  <input type ="text" name="userName"/>
	<input type="submit" value="확인" class="input_button"/>
	</div>
	<div class="input">
	주민번호  <input type ="text" name="ssn"/>
	<input type="submit" value="확인" class="input_button"/> 
	</div>
	<div class="input">
	이메일1  <input type ="text" name="email"/>
	이메일2 
	<select name="email2">
    	<option value="google.com">google.com</option>
    	<option value="naver.com">naver.com</option>
    	<option value="daum.com">daum.net</option>
    	<option value="korea.com">koreait.com</option>
	<input type="submit" value="확인" class="input_button"/>
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
</body>
</html>