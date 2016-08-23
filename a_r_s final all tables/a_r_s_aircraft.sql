CREATE DATABASE  IF NOT EXISTS `a_r_s` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `a_r_s`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: a_r_s
-- ------------------------------------------------------
-- Server version	5.1.70-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aircraft`
--

DROP TABLE IF EXISTS `aircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aircraft` (
  `aircraftTypeID` varchar(10) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  `bseats` int(2) DEFAULT NULL,
  `xseats` int(3) DEFAULT NULL,
  `eseats` int(3) DEFAULT NULL,
  PRIMARY KEY (`aircraftTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aircraft`
--

LOCK TABLES `aircraft` WRITE;
/*!40000 ALTER TABLE `aircraft` DISABLE KEYS */;
INSERT INTO `aircraft` VALUES ('R025','RMR AIRBUS 025',100,150,200),('R026','RMR AIRBUS 026',80,150,200),('R027','RMR AIRBUS 027',90,130,150),('R028','RMR AIRBUS 028',60,130,130),('R029','RMR AIRBUS 029',100,110,150),('R030','RMR AIRBUS 030',80,100,160),('R031','RMR AIRBUS 031',90,120,150),('R032','RMR AIRBUS 032',130,130,150),('R033','RMR AIRBUS 033',100,150,200),('R034','RMR AIRBUS 034',80,120,200),('R035','RMR AIRBUS 035',90,130,200),('R036','RMR AIRBUS 036',100,120,200),('R037','RMR AIRBUS 037',70,120,150),('R038','RMR AIRBUS 038',80,130,150),('R039','RMR AIRBUS 039',100,130,150),('R040','RMR AIRBUS 040',90,130,150),('R041','RMR AIRBUS 041',100,130,150),('R042','RMR AIRBUS 042',90,120,150),('R043','RMR AIRBUS 043',80,80,80),('R044','RMR AIRBUS 044',70,90,100),('R045','RMR AIRBUS 045',100,100,150),('R046','RMR AIRBUS 046',80,100,150),('R047','RMR AIRBUS 047',100,100,100),('R048','RMR AIRBUS 048',60,120,180),('R049','RMR AIRBUS 049',80,180,200),('R050','RMR AIRBUS 050',100,120,140),('R051','RMR AIRBUS 051',120,90,140),('R052','RMR AIRBUS 052',80,100,160),('R053','RMR AIRBUS 053',120,120,160),('R054','RMR AIRBUS 054',100,120,200),('R055','RMR AIRBUS 055',120,90,200),('R056','RMR AIRBUS 056',80,100,150),('R057','RMR AIRBUS 057',100,80,200),('R058','RMR AIRBUS 058',120,90,160),('R059','RMR AIRBUS 059',100,100,140),('R061','RMR AIRBUS 061',80,80,200),('R062','RMR AIRBUS 062',100,120,150),('R063','RMR AIRBUS 063',50,100,120),('R064','RMR AIRBUS 064',80,130,200),('R065','RMR AIRBUS 065',80,200,200),('R066','RMR AIRBUS 066',100,160,160),('R067','RMR AIRBUS 067',75,200,50),('R068','RMR AIRBUS 068',75,200,200),('R069','RMR AIRBUS 069',60,75,80),('R071','RMR AIRBUS 071',80,150,200),('R072','RMR AIRBUS 072',100,150,200),('R073','RMR AIRBUS 073',80,90,90),('R074','RMR AIRBUS 074',100,150,180),('R075','RMR AIRBUS 075',30,150,200),('R076','RMR AIRBUS 076',80,50,120),('R077','RMR AIRBUS 077',50,50,250),('R078','RMR AIRBUS 078',50,50,250),('R079','RMR AIRBUS 079',40,80,50),('R081','RMR AIRBUS 081',50,100,120),('R082','RMR AIRBUS 082',30,150,200),('R083','RMR AIRBUS 083',80,100,140),('R084','RMR AIRBUS 084',100,130,130),('R085','RMR AIRBUS 085',90,100,120),('R086','RMR AIRBUS 086',80,55,100),('R087','RMR AIRBUS 087',100,120,150),('R088','RMR AIRBUS 088',30,75,110),('R089','RMR AIRBUS 089',50,50,110);
/*!40000 ALTER TABLE `aircraft` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-16 17:30:39
