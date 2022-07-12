package gallBoard;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arang.signup.User;
import com.arang.signup.UserDao;
import com.arang.signup.UserService;

@WebServlet("/gallBoard/writeAction.jsp")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService boardService;	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		BoardService boardService = BoardService.getInstance();
		boardService = new BoardService(new BoardDao());
		//폼 파라미터 얻기
		String title = request.getParameter("title");
		String boardContent = request.getParameter("boardContent");
		//유효성 검증 및 반환	
//		HttpSession session = request.getSession(false);
//		String userId = (String)session.getAttribute("userId");
//		if(userId == null) {
//			request.getRequestDispatcher("error.jsp").forward(request, response);
//			return;
//		}
		//유효성 통과
		Board board = new Board();
		board.setTitle(title);
		board.setBoardContent(boardContent);
		//비즈니스 서비스 호출
		int pageNumber = 1;
		if(request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
		
		boardService.writeBoard(board);
		request.setAttribute("board", board);
		//NEXT PAGE
		RequestDispatcher dispatcher = null;
		//성공 페이지
		dispatcher = request.getRequestDispatcher("board.jsp");
		dispatcher.forward(request, response);
	}

}
