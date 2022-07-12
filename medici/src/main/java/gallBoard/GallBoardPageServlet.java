package gallBoard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arang.signup.UserService;

@WebServlet("/gallBoard/write.do")
public class GallBoardPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardService boardService;
	
	public void init(ServletConfig config) throws ServletException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");
		BoardService boardService = BoardService.getInstance();
		boardService = new BoardService(new BoardDao());
		
		//1. 폼 파라미터 얻기
		String galleryName = request.getParameter("galleryName");
		String name = request.getParameter("name");
		String exhibitionArea = request.getParameter("exhibitionArea");
		String exhibitonHeight = request.getParameter("exhibitonHeight");
		String specialNote = request.getParameter("specialNote");
		String rentalFee = request.getParameter("rentalFee");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String userId = request.getParameter("userId");
		String boardContent = request.getParameter("boardContent");
		
		//2. 유효성 검증 및 변환
		Board board = new Board();
		board.setGalleryName(galleryName);
		board.setName(name);
		board.setExhibitionArea(exhibitionArea);
		board.setExhibitionHeight(exhibitonHeight);
		board.setSpecialNote(specialNote);
		board.setRentalFee(rentalFee);
		board.setAddress(address);
		board.setPhone(phone);
		board.setEmail(email);
		board.setTitle(title);
		board.setUserId(userId);
		board.setBoardContent(boardContent);
		
		//3. 비즈니스 서비스 호출
		boardService.writeBoard(board);
		request.setAttribute("board", board);
		//4. NextPage
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("/gallBoard/board.jsp");
		dispatcher.forward(request, response);	
	}
	
}
