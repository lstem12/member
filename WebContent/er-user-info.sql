
/* Drop Triggers */

DROP TRIGGER TRI_member_num;



/* Drop Tables */

DROP TABLE member CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_member_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_member_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE member
(
	num number(10,0) NOT NULL,
	name varchar2(20) NOT NULL,
	id varchar2(20) NOT NULL UNIQUE,
	pwd varchar2(20) NOT NULL,
	joindate date NOT NULL,
	etc varchar2(2000),
	PRIMARY KEY (num)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_member_num BEFORE INSERT ON member
FOR EACH ROW
BEGIN
	SELECT SEQ_member_num.nextval
	INTO :new.num
	FROM dual;
END;

/




