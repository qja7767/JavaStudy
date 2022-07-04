package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/user.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String DEFAULT_NAME = "DEFAULT";   
    private static final String DEFAULT_PASSWD = "DEFAULT";
    private static final String DEFAULT_USERNAME = "DEFAULT";
    private static final String DEFAULT_SSN = "DEFAULT";
    private static final String DEFAULT_EMAIL = "DEFAULT";
    private static final String DEFAULT_EMAIL2 = "DEFAULT";
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		if( userId == null || userId.length() == 0) {
			userId = DEFAULT_NAME;
		}
		String passwd = request.getParameter("passwd");
		if( passwd == null || passwd.length() == 0) {
			passwd = DEFAULT_PASSWD;
		}
		String userName = request.getParameter("userName");
		if( userName == null || userName.length() == 0) {
			userName = DEFAULT_USERNAME;
		}
		String ssn = request.getParameter("ssn");
		if( ssn == null || ssn.length() == 0) {
			ssn = DEFAULT_SSN;
		}
		String email = request.getParameter("email");
		if( email == null || email.length() == 0) {
			email = DEFAULT_EMAIL;
		}
		String email2 = request.getParameter("email2");
		if( email2 == null || email2.length() == 0) {
			email2 = DEFAULT_EMAIL2;
		}
		String[] concerns = request.getParameterValues("concerns");

		String pageTitle = "My AddUser TEST";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title> test" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h1>USER INFO</h1>");
		out.println("<ul>");
		out.println("<li>아이디 : " + userId + "</li>");
		
		out.println("<li>비밀번호 : " + masking(passwd) + "</li>");
		out.println("<li>주민등록번호 : " + ssn + "</li>");
		out.println("<li>이메일 : " + email + "@" + email2 + "</li>");
		for(String concern2 : concerns) {
			out.println("<li>관심분야: " + concern2 + "</li>");
		}				
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//POST할때 한글깨짐 임시방편(첫줄)
		doGet(request, response);
	}
	
	public static String masking(String number) {
		char[] ch = number.toCharArray();
		for( int i = 0; i < ch.length; i ++ ) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	}

}
