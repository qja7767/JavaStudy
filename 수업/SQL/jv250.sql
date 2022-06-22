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

DROP TABLE Account;
CREATE TABLE Account(
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,			-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerID		BIGINT			NOT NULL,
	regDATE			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerID) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;

INSERT INTO Account (accountNum, balance, interestRate, overDraft, accountType, customerID)
VALUES ('111-11-1111', 1000.0, 1.2, 2000.0, "S", 1002),
('222-22-2222', 2000.0, 2.2, 3000.0, "S", 1004);




