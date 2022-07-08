<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<p>MENU</p>
<a href='<c:url value="/mod010/logout"/>'>로그아웃</a><br>
<a href='<c:url value="/mod010/login"/>'>로그인</a><br>
<a href='<c:url value="/mod009/add_user_db.jsp"/>'>유저추가</a><br>
<a href='<c:url value="/mod009/delete_user.jsp"/>'>유저삭제</a><br>
<a href='<c:url value="/mod009/select_user.do"/>'>모든가입유저조회</a><br>
<a href='<c:url value="/mod009/update_user.jsp"/>'>유저수정</a><br>
