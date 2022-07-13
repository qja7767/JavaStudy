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

DROP TABLE UserSignUp;
CREATE TABLE UserSignUp (
	pkUser			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	koreanName		VARCHAR(20)		DEFAULT NULL,
	englishName		VARCHAR(30)		DEFAULT NULL,
	ssn				VARCHAR(20)		DEFAULT NULL,
	userId			VARCHAR(20)		DEFAULT NULL,
	passwd			VARCHAR(20)		DEFAULT NULL,
	gender			VARCHAR(10)		DEFAULT NULL,
	addr			VARCHAR(30)		DEFAULT NULL,
	acaBackGround	VARCHAR(30)		DEFAULT NULL,
	career			VARCHAR(20)		DEFAULT NULL,
	soloExhi		VARCHAR(30)		DEFAULT NULL,
	groupExhi		VARCHAR(30)		DEFAULT NULL,
	email			VARCHAR(30)		DEFAULT NULL,
	emailSite		VARCHAR(30)		DEFAULT NULL,
	level			VARCHAR(1)		DEFAULT 1,
	regDate			TIMESTAMP		DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1;

SELECT * FROM UserSignUp;

INSERT INTO UserSignUp(userId, passwd, koreanName, englishName, ssn, gender, addr, acaBackGround
, career, soloExhi, groupExhi, email, emailSite)
VALUES('su1234', 'pass123', '홍길동', 'KGB', '944121-1231451', '남',
'대구 어딘가','홍익대', '무경력', '무', '무', 'qqq123', '@test.com');

DROP TABLE board;
CREATE TABLE board(
	bid 		INT(4) 			DEFAULT NULL,
	bName 		VARCHAR(20)		DEFAULT NULL,
	bTitle 		VARCHAR(100)	DEFAULT NULL,
	bContent 	VARCHAR(300)	DEFAULT NULL,
	bDate 		TIMESTAMP 		DEFAULT CURRENT_TIMESTAMP,
	bHit 		INT(4) 			DEFAULT NULL,
	bGroup 		INT(4)			DEFAULT NULL,
	bStep		INT(4)			DEFAULT NULL,
	bIndent 	INT(10)			DEFAULT 1
);

SELECT * FROM board;