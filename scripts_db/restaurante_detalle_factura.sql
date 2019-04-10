-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: restaurante
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.18.04.2

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
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_factura` (
  `id_detalle_factura` int(20) NOT NULL AUTO_INCREMENT,
  `id_factura` int(20) NOT NULL,
  `id_cocinero` int(20) NOT NULL,
  `plato` varchar(45) NOT NULL,
  `importe` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_detalle_factura`),
  KEY `fk_detalle_factura_1_idx` (`id_factura`),
  KEY `fk_detalle_factura_2_idx` (`id_cocinero`),
  CONSTRAINT `fk_detalle_factura_1` FOREIGN KEY (`id_factura`) REFERENCES `factura` (`id_factura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_factura_2` FOREIGN KEY (`id_cocinero`) REFERENCES `cocinero` (`id_cocinero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES (4,1,1,'pollo al sahara',52000.00),(5,1,1,'carne deshidratada',43000.00),(6,1,1,'vino a las cañas',80000.00),(7,2,2,'pollo al sahara',52000.00),(8,2,2,'pollo al sahara',52000.00),(9,3,1,'pollo broaster picante',22000.00),(10,3,2,'carne alicante',34000.00),(11,4,1,'papa loca',22000.00),(12,4,2,'Coca Sola',5000.00),(13,5,3,'carne alicante',34000.00),(14,5,2,'pollo al sahara',52000.00),(15,6,2,'pollo al sahara',52000.00),(16,6,2,'pollo al sahara',52000.00),(17,7,1,'vino a las cañas',80000.00),(18,8,3,'carne alicante',34000.00),(19,9,3,'carne alicante',34000.00),(20,10,1,'carne',12500.00);
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-09 22:59:07
