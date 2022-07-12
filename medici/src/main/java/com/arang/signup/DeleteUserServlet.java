package com.arang.signup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup/delete_user.do")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userservice;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		
		UserService userService = UserService.getInstance();
		userService = new UserService(new UserDao());		
		User user = new User();
		user.setUserId(userId);
		System.out.println(user.getUserId());
		
		userService.deleteUserByUserId(user);
		request.setAttribute("user", user);
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("/mod009/delete_user.jsp");
		dispatcher.forward(request, response);	
	}

}
