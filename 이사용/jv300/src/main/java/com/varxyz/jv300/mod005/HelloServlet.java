package com.varxyz.jv300.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet2", urlPatterns = {"/mod005/hello.view"})
public class HelloServlet extends HttpServlet { //서블릿은 자체사용이 아닌 상속을 해서 사용해야함
	private static final String DEFAULT_NAME = "World";
	
	public void init() {
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String pageTitle = "Hello World";
		String name = request.getParameter("userName");
		if(name == null || name.length() == 0){
			name = DEFAULT_NAME;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<h3>" + name + "</h3>");					
		out.println("</body></html>");
		out.close();
	}
}
