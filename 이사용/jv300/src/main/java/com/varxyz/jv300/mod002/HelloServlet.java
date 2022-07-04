package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet { //서블릿은 자체사용이 아닌 상속을 해서 사용해야함
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String pageTitle = "Hello World";		 
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<h3>GugudanTest</h3>");
		out.println("<h1>");
		for ( int i = 1; i < 10; i++ ) {
			for ( int j = 2; j < 10; j++ ) {
				out.println( j + "X" + i + "=" + i*j);
			}			
		}
		out.println("</h1>");
		out.println("</body></html>");
		out.close();
	}
}
