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
	
    <div id="wrap">
        <p>
        <c:if test="${userId==null}">
            <a href='<c:url value="/signup/login"/>'>로그인</a><br>
		<a href='<c:url value="/signup/add_user_db.jsp"/>'>유저회원가입</a><br>
        </c:if>
        <c:if test="${userId!=null}">
          		<a href='<c:url value="/signup/logout"/>'>로그아웃</a><br>
		<a href='<c:url value="/signup/delete_user.jsp"/>'>유저삭제</a><br>
		<a href='<c:url value="/signup/update_user.jsp"/>'>유저수정</a><br>
         </c:if>
        <c:if test="${userId!=null&&userId=='admin'}">
		<h3>관리자 계정입니다.</h3>
		<a href='<c:url value="/signup/select_user.do"/>'>모든가입유저조회</a><br>
        </c:if>
       	</p>
		
	<jsp:include page="/list.jsp">
  		<jsp:param name="boardData" value=""/>
  	</jsp:include>	
		
	</div>
		<%@ include file="/list.jsp" %>		
		<a href='<c:url value="/list.do"/>'>리스트</a>
		<a href='<c:url value="/signup/logout"/>'>로그아웃</a><br>
		<a href='<c:url value="/signup/login"/>'>로그인</a><br>
		<a href='<c:url value="/signup/add_user_db.jsp"/>'>유저회원가입</a><br>
		<a href='<c:url value="/signup/delete_user.jsp"/>'>유저삭제</a><br>
		<a href='<c:url value="/signup/select_user.do"/>'>모든가입유저조회</a><br>
		<a href='<c:url value="/signup/update_user.jsp"/>'>유저수정</a><br>
		<a href='<c:url value="/signup/mypage.jsp"/>'>마페제</a><br>
	</div>
	
		${userId}님 환영합니다. 
	<label>Last Access Time : </label> ${lastAccessTime}
	
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
	
</body>
</html>
