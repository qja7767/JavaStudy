package gallBoard;

import java.util.List;

public class BoardService {
	private static BoardService service = new BoardService();
	public BoardDao boardDao;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public BoardService() {
		
	}
	
	public void writeBoard(Board board) {
		boardDao.writeBoard(board);
	}
	
	public void updateBoard(Board board) {
		boardDao.updateBoard(board);
	}
	
	public void deleteBoardByTitle(Board board) {
		boardDao.deleteBoardByTitle(board);
	}
	
	public List<Board> findBoard() {
		return boardDao.findBoard();
	}
	
	public static BoardService getInstance() {
		return service;
	}

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
}
