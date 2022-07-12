<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width", initial-scale="1">

<title>TEST 게시판</title>
</head>
<body>
	<!-- 게시판 -->	
	<div class="container">
		<div class="row">
			<form method="post" action="writeAction.jsp">
				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 테스트</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					<td>
					<input type="text" class="form-control" placeholder="글 제목" name="title" maxlength="50">
					</td>
				</tr>
				<tr>
					<td>
					<textarea class="fomr-control" placeholder="글 내용" name="boardContent" maxlength="2048" style="height: 350px;"></textarea>
					</td>
				</tr>
				</tbody>
				</table>
	<!-- 글쓰기 버튼 -->
				<input type="submit" class="btn btn-primary pull-right" value="글쓰기">
			</form>
		</div>
	</div>
	
	
</body>
</html>