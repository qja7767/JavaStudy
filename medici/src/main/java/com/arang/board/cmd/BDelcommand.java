package com.arang.board.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arang.board.dao.Bdao;

public class BDelcommand implements BCommand{
	public void execute(HttpServletRequest request, HttpServletResponse response){
		String bId = request.getParameter("bId");
		Bdao dao = new Bdao();
		dao.delete(bId);
	}
}
