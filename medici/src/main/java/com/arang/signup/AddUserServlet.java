package com.arang.signup;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup/add_user_db.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
		
	public void init(ServletConfig config) throws ServletException {
		userService = new UserService(new UserDao());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");
		
		//1. 폼 파라미터 얻기
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		//2. 유효성 검증 및 변환
		List<String> errorMsgs = new ArrayList<>();
		if(userId == null || userId.length() == 0) {
			errorMsgs.add("id는 필수입력 정보입니다.");
		}if(passwd == null || passwd.length() == 0) {
			errorMsgs.add("비밀번호는 필수입력 정보입니다.");
		}
		
		RequestDispatcher dispatcher = null;
		if(errorMsgs.size() > 0) {
			request.setAttribute("errorMsgs", errorMsgs);
			dispatcher = request.getRequestDispatcher("/signup/error.jsp");
			dispatcher.forward(request, response);
			return;
		}
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		user.setUserName(userName);
		user.setSsn(ssn);
		user.setEmail(email1 + "@" + email2);
		user.setAddr(addr1 + " " + addr2);
		
		//3. 비즈니스 서비스 호출
		userService.addUser(user);
//		userService.findUser(user);
		request.setAttribute("user", user);
		
		//4. NextPage
		request.setAttribute("userName", userName);
		request.setAttribute("passwd", passwd);
		request.setAttribute("userId", userId);
		request.setAttribute("ssn", ssn);
		
		dispatcher = request.getRequestDispatcher("/signup/success.jsp");
		dispatcher.forward(request, response);	
	}
		
}
