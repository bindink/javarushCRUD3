DROP DATABASE IF EXISTS test;

CREATE DATABASE test;

CREATE TABLE `users` 
(
	`id` INT(8) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(25) NOT NULL DEFAULT '0',
	`age` INT NOT NULL DEFAULT '0',
	`isAdmin` BIT(1)  DEFAULT b'0',
	`createdDate` TIMESTAMP,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci';

INSERT INTO `users` (`id`,`name`,`age`,`isAdmin`,`createdDate`) VALUES (1,"Iola",31,1,"2015-10-11 16:50:27"),(2,"Christian",44,1,"2016-07-10 01:52:28"),(3,"Alfreda",32,0,"2017-01-01 18:04:23"),(4,"Dominic",36,0,"2015-12-01 19:14:05");
