package gallBoard;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gallBoard/find_board.do")
public class FindBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BoardService boardService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		BoardService boardService = BoardService.getInstance();
		boardService = new BoardService(new BoardDao());
		List<Board> boardList = boardService.findBoard();
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("find_board.jsp");
		dispatcher.forward(request, response);
	}

}
