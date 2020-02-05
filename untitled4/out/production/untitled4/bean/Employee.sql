-- auto Generated on 2020-02-04
-- DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	last_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'lastName',
	email VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'email',
	gender VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'gender',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'employee';