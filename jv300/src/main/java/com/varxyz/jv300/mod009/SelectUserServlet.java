package com.varxyz.jv300.mod009;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod009/select_user.do")
public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	public void init(ServletConfig config) throws ServletException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		UserService userService = UserService.getInstance();
		userService = new UserService(new UserDao());
		List<User> userList = userService.findUser();
		request.setAttribute("userList", userList);
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("select_user.jsp");
		dispatcher.forward(request, response);	
	}

}
