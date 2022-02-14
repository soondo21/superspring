DROP TABLE user IF EXISTS;

CREATE TABLE user (
		 id               bigint auto_increment primary key,
		 mobile               VARCHAR2(30),
		 password                 VARCHAR2(30),
		 sex                 VARCHAR2(30),
		 address            VARCHAR2(30),
		 email                 VARCHAR2(30),
		 state                VARCHAR2(30),
		 birthdate_str             VARCHAR2(8),
		 birthdate DATE,
		create_time	DATE,
		update_time	DATE
);