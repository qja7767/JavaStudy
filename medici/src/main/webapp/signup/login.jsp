<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../css/normalize.css">
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="index.html">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="./artists/all.html">Artists</a>
              <ul class="sub-menu">
                <li><a href="./artists/view_all.html">view_all</a></li>
                <li><a href="./artists/view_rising.html">view_rising</a></li>
                <li><a href="./artists/view_genre.html">view_genre</a></li>
              </ul>
            </li>
            <li><a href="./gallerys/gallerys.html">Gallerys</a></li>
            <li><a href="./exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="./storage/storage.html">Storage</a>
              <ul class="sub-menu">
                <li><a href="./community/notice.html">Notice</a></li>
                <li><a href="./community/faq.html">FAQ</a></li>
              </ul>
            </li>
            <li><a href="./notice/notice.html">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="./find/find.html"><img src="../img/icon/find.png" alt="find"></a></li>
            <li><a href="./mypage/mypage.html"><img src="../img/icon/mypage.png" alt="mypage"></a></li>
            <li><a href="./like/like.html"><img src="../img/icon/like.png" alt="like"></a></li>
            <li><a href="./cart/cart.html"><img src="../img/icon/cart.png" alt="cart"></a></li>
            <li><a href="login.html">login</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div id="login_wrap">
      <div class="title">
        <h1>ARANG 로그인</h1>
      </div>
      <form action="login" method="post">
        <table class="table_a">
          <tr>
            <td>
              <input type="text" class="middle" placeholder="이메일(아이디)" name="userId">
            </td>
          </tr>
          <tr>
            <td>
              <input type="password" class="middle" placeholder="비밀번호" name="passwd">
            </td>
          </tr>
        </table>
        <div class="button-group">
          <button class="gbtn normal">로그인</button>
          <button class="gbtn normal gray">취소</button>
          <input type="submit" value="로그인"/>	
        </div>
        <div class="join">
          <p>아직 회원이 아니신가요?&nbsp;&nbsp;</p>
          <a href="join"><strong>회원가입<strong></a>
        </div>
      </form>
    </div>
  </div>
</body>
</html>