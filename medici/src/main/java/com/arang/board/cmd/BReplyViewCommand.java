package com.arang.board.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arang.board.dao.Bdao;
import com.arang.board.dto.Bdto;

public class BReplyViewCommand implements BCommand{
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		String bId = request.getParameter("bId");
		Bdao dao = new Bdao();
		Bdto dto = dao.replyView(bId);
		
		request.setAttribute("replyView", dto);
	}
}
