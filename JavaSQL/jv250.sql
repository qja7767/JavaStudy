DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no			INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40)		DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1997-11-25', '대구 남구 반월당');
INSERT INTO Sample10 VALUES (3, '장비', '1998-12-25', '대구 동구 반월당');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name 		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone 		VARCHAR(14)		NOT NULL,
	customerID 	VARCHAR(16)		NOT NULL,
	passwd 		VARCHAR(16)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111'),
('관우', '911213-1234567', '010-5323-2323', 'mava', '2111'),
('장비', '921213-1234567', '010-7323-2323', 'pava', '3111');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111');

UPDATE Customer SET ssn='901213-1111111', phone='010-2222-3333' WHERE cid=1001;
UPDATE Customer SET ssn='901213-2222222', phone='010-5555-7777' WHERE cid=1004;
UPDATE Customer SET ssn='901213-2222222', phone='010-5555-7777' WHERE cid=1007;

DELETE FROM Customer WHERE cid=1001;
