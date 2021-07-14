# Springboot_Security_with_Authentication_and_Autorization

___

# Important
## You should add your own mysql url,username,password to application.properties file

# SQL CODE
## You should create SCHEMA in Mysql using the code below.
(password is encrypted using bcrypt. it has always 60characters length. 

```sql
CREATE DATABASE IF NOT EXISTS `SPRING_SECURITY`;
USE `SPRING_SECURITY`;

DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER`(
	`id` varchar(11) NOT NULL,
	`pw` varchar(60) NOT NULL,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

```
















