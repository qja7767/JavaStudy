package gallBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arang.signup.User;

public class BoardDao {
	private DataSource dataSource;
	public BoardDao() {
		NamingService namingService = NamingService.getInstance();
		dataSource = (DataSource)namingService.getAttribute("dataSource");
	}
	
	
	//글쓰기
	public void writeBoard(Board board) {
		String sql = "INSERT INTO GallBoard (galleryName, name,"
				+ " exhibitionArea, exhibitonHeight, specialNote, rentalFee,"
				+ " address, phone, email, title, userId, boardContent)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;			
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, board.getGalleryName());
				pstmt.setString(2, board.getName());
				pstmt.setString(3, board.getExhibitionArea());
				pstmt.setString(4, board.getExhibitionHeight());
				pstmt.setString(5, board.getSpecialNote());
				pstmt.setString(6, board.getRentalFee());
				pstmt.setString(7, board.getAddress());
				pstmt.setString(8, board.getPhone());
				pstmt.setString(9, board.getEmail());
				pstmt.setString(10, board.getTitle());
				pstmt.setString(11, board.getUserId());
				pstmt.setString(12, board.getBoardContent());
				pstmt.executeUpdate();
			} finally {
				dataSource.close(pstmt, con);
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}
	
	//글 수정
	public void updateBoard(Board board) {
		String sql = "UPDATE GallBoard SET boardContent = ? WHERE userId";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, board.getBoardContent());
				pstmt.setString(2, board.getUserId());				
				pstmt.executeUpdate();
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//글 삭제
	public void deleteBoardByTitle(Board board) {
		String sql = "DELETE FROM GallBoard WHERE title = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, board.getTitle());
				pstmt.executeUpdate();
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}

	//게시글 번호 부여 메소드
	public int getNext() {
		String sql = "SELECT testNum from GallBoard order by testNum desc";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs= pstmt.executeQuery();
				if(rs.next()) {
					return rs.getInt(1) + 1;
				}
				return 1; // 첫번째 게시물인 경우
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}	
		return -1; // DB 오류
	}
	
	//글 목록 조회
	public List<Board> findBoard() {
		String sql = "SELECT * FROM GallBoard";
		List<Board> boardList = new ArrayList<Board>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Board c = new Board();
					c.setTestNum(rs.getInt("testNum"));
					c.setName(rs.getString("name"));
					c.setTitle(rs.getString("title"));
					c.setUserId(rs.getString("userId"));
					c.setBoardContent(rs.getString("boardContent"));					
					boardList.add(c);
				}
			}finally {
				dataSource.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return boardList;
	}
	
	//페이징 처리
	public boolean nextPage(int pageNumber) {
		String sql = "SELECT * FROM GallBoard WHERE testNum < ? AND available = 1";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, getNext() - (pageNumber - 1) * 10 );
				rs = pstmt.executeQuery();
				while(rs.next()) {
					return true;	
				}
			}finally {
				dataSource.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
