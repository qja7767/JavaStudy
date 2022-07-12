DROP TABLE GallBoard;
CREATE TABLE GallBoard (
	pkNum 			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	testNum			INT				DEFAULT NULL,
	available		INT				DEFAULT NULL,
	galleryName		VARCHAR(30)		DEFAULT NULL,
	name			VARCHAR(20)		DEFAULT NULL,
	exhibitionArea	VARCHAR(20) 	DEFAULT NULL,
	exhibitonHeight VARCHAR(20) 	DEFAULT NULL,
	specialNote		VARCHAR(100)	DEFAULT NULL,
	rentalFee		VARCHAR(20)		DEFAULT NULL,
	address			VARCHAR(100)	DEFAULT NULL,
	phone			VARCHAR(20)		DEFAULT NULL,
	email			VARCHAR(100)	DEFAULT NULL,
	title			VARCHAR(50)		DEFAULT NULL,
	userId			VARCHAR(30)		DEFAULT NULL,
	boardContent	VARCHAR(2000)	DEFAULT NULL,
	regDate			TIMESTAMP		DEFAULT NULL	DEFAULT CURRENT_TIMESTAMP	
)AUTO_INCREMENT = 1;

SELECT * FROM GallBoard;

INSERT INTO GallBoard (testNum, available, galleryName, name, exhibitionArea,
exhibitonHeight, specialNote, rentalFee, address, phone, email,
title, userId, boardContent)
VALUES (1, 1, '땡떙갤러리', 'KGB', '100M', '20M', '주차장없음', '10만원',
'대구', '010-1234-1234', 'kgb1234@naver.com', '무제','testID', '안녕하세요');

com.arang.medici.gallery
	갤러리등록
			- 갤러리명 name of gallery
			- 등록자명 name
			- 전시공간면적 exhibition space area
			- 전시공간높이 exhibition space height
			- 특이사항 special note.
			- 대관료 venue rental fee
      		- 주소 address
      		- 전화번호 phone
			- 이메일 e-mail