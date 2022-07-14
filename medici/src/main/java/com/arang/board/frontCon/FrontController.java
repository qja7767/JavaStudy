package com.arang.board.frontCon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arang.board.cmd.BCommand;
import com.arang.board.cmd.BListCommand;
import com.arang.board.cmd.BWriteCommand;
import com.arang.board.cmd.BDelcommand;
import com.arang.board.cmd.BModifyCommand;
import com.arang.board.cmd.BReplyCommand;
import com.arang.board.cmd.BReplyViewCommand;
import com.arang.board.cmd.BViewCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest application, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		application.setCharacterEncoding("UTF-8");
		actionDo(application,response);
	}

	protected void doPost(HttpServletRequest application, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		application.setCharacterEncoding("UTF-8");
		actionDo(application,response);
	}

	protected void actionDo(HttpServletRequest application, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");
		
		BCommand command = null;
		
		String viewPage = null;
		
		String uri = application.getRequestURI();
		String conPath = application.getContextPath();
		String cmd = uri.substring(conPath.length());
		
		if(cmd.equals("/write_view.do")){
			viewPage = "write_form.jsp";
		}else if(cmd.equals("/write.do")){
			command = new BWriteCommand();
			command.execute(application, response);
			viewPage = "list.do";
		}else if(cmd.equals("/list.do")){
			command = new BListCommand();
			command.execute(application, response);
			viewPage = "list.jsp";
		}else if(cmd.equals("/view.do")){
			command = new BViewCommand();
			command.execute(application, response);
			viewPage = "view.jsp";
		}else if(cmd.equals("/modify.do")){
			command = new BModifyCommand();
			command.execute(application, response);
			viewPage = "list.do";
		}else if(cmd.equals("/delete.do")){
			command = new BDelcommand();
			command.execute(application, response);
			viewPage = "list.do";
		}else if(cmd.equals("/replyView.do")){
			command = new BReplyViewCommand();
			command.execute(application, response);
			viewPage = "reply_form.jsp";
		}else if(cmd.equals("/reply.do")){
			command = new BReplyCommand();
			command.execute(application,response);
			viewPage ="list.do";
		}
		
		
		RequestDispatcher dispat = application.getRequestDispatcher(viewPage);
		dispat.forward(application, response);

	}	
}
