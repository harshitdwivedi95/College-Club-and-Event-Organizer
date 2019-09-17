-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: club_system
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `dept` varchar(10) NOT NULL,
  PRIMARY KEY (`admin_id`),
  UNIQUE KEY `Admin_id_UNIQUE` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Harshit','123','CSE'),(2,'123456789','Nimisha','CSE');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `club` (
  `club_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `dept` varchar(10) NOT NULL,
  `tag` varchar(1025) NOT NULL,
  PRIMARY KEY (`club_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (1,'Big Data','CSE','The purpose of Big Data Club is to provide a structure through which students can learn, teach and network in the field of Big Data. The main purpose of this club is to create a group which have members who are highly motivated and interested in the field of Big Data. We are planning to conduct workshops and boot-camps in the highly evolving field of Big Data where technology is getting updated every 3 months. In this way all the students who are interested in the field of Big Data can stay abreast of the latest technologies, changes happening in this field.'),(2,'Drama','Pharmacy','Drama Club is an organization that provides theatre programming to young people who are incarcerated and/or court-involved. We are a mobile drama club, bringing our classes into juvenile detention centers, jails and community centers throughout the city. It started as a rehearsal process of a play at Crossroads Juvenile Center, which was presented as a staged reading for staff, fellow residents and family members. The success of this project blossomed into a consistent year-round program.'),(3,'AI','CSE','Are you interested, curious, or knowledgeable about Artificial Intelligence? The AI Club is a group of students that are interested in AI and seek a place to talk about it. Our goal is to form a community of interested students that share knowledge, passion, and skills. Let us know if you are interested.\n\nWhat do you mean by Artificial Intelligence (AI)? \nWe like to give AI a broad definition. From Data Science, to Machine Learning, to Computer Vision, to Autonomous Robots, to Natural Language Processing, to Self Driving Cars; we will explore all of these fields.\n\nWhat do we do? \n- Listen to guest speakers knowledgeable in AI fields (industry experts, researchers, or graduate students) \n- Discuss the latest/greatest cool stuff happening in AI \n- Skills workshops \n- Talk about the philosophical and ethical questions in AI \n- Network and socialize with like-minded peers'),(4,'dance','EC','dance'),(7,'musc','CSE','music'),(8,'Tanya','Tanya','Tanya'),(9,'tanya','EC','music'),(10,'tanya','CSE','music'),(11,'rohit','CSE','dance'),(12,'Data Analytics','CSE','Tanya');
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `event` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `club_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`event_id`,`club_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,1,'Boot camp by Google on Hadoop Technology'),(2,3,'1 day seminar on Ardino'),(3,2,'Drama Contest by LN Star'),(4,4,'X Factor by Dainik Bhaskar');
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `s_id` int(250) NOT NULL AUTO_INCREMENT,
  `enroll_id` varchar(250) NOT NULL,
  `contact` varchar(250) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `college` varchar(255) NOT NULL,
  `interest` varchar(255) NOT NULL,
  `club_id` int(11) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (2,'61071','800529197','Harshit Dwivedi','1234568','harshitdwivedi95@gmail.com','LNCTS','Big Data',1),(6,'6071','800529197','Tanya Dwivedi','1234568','harshitdwivedi95@gmail.com','LNCTS','Big Data',1),(7,'0157CS161071','7007746002','Harshit Dwivedi','lkjhv','rohit@gmail.com','Lakshmi Narain College of Technology & Excellence','Story-telling',1),(8,'0157CS161064','7389746058','Divjot Singh Grover','bhaadmejaa','divjotgrover87@gmail.com','Lakshmi Narain College of Technology & Science','Gaming',0),(9,'0157CS161103','1234567787','Nimisha Gupta','Nimisha123','nimishagupta208@gmail.com','Lakshmi Narain College of Technology & Science','Fashion',0),(10,'0157CS161099','7049601156','Nidhi','nidhi123','nidhi2274@gmail.com','Lakshmi Narain College of Technology & Science','Gaming',0);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 11:52:04
