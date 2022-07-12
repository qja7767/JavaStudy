package gallBoard;

import java.util.List;

public class Board {
	private String galleryName;
	private int testNum;
	private int available;
	private String name;
	private String exhibitionArea;
	private String exhibitionHeight;
	private String specialNote;
	private String rentalFee;
	private String address;
	private String phone;
	private String email;
	private String title;
	private String userId;
	private String boardContent;
	private String regDate;
	private List<Board> boardList;
	
	
	
	public List<Board> getBoardList() {
		return boardList;
	}
	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getTestNum() {
		return testNum;
	}
	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGalleryName() {
		return galleryName;
	}
	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExhibitionArea() {
		return exhibitionArea;
	}
	public void setExhibitionArea(String exhibitionArea) {
		this.exhibitionArea = exhibitionArea;
	}
	public String getExhibitionHeight() {
		return exhibitionHeight;
	}
	public void setExhibitionHeight(String exhibitionHeight) {
		this.exhibitionHeight = exhibitionHeight;
	}
	public String getSpecialNote() {
		return specialNote;
	}
	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}
	public String getRentalFee() {
		return rentalFee;
	}
	public void setRentalFee(String rentalFee) {
		this.rentalFee = rentalFee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTestNum(String testNum) {
		
	}
	
}
