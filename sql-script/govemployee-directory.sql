CREATE DATABASE  IF NOT EXISTS `gov_employee_directory`;
USE `gov_employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `govemployee`;

CREATE TABLE `govemployee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `govemployee` VALUES 
	(1,'Abedi','Mavangu','amavangu@dummyemail.com'),
	(2,'Fatshi','Beton','fabet@@dummyemail.com'),
	(3,'Peter','Kazadi','pkaz@@dummyemail.com'),
	(4,'Manu','Adil','manad@@dummyemail.com'),
	(5,'Odel','Brian','juan@@dummyemail.com');

