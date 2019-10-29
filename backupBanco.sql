-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gerenciamentopecas
-- ------------------------------------------------------
-- Server version	5.7.23-log

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
-- Table structure for table `fabricante`
--

DROP TABLE IF EXISTS `fabricante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fabricante` (
  `idFabricante` int(11) NOT NULL AUTO_INCREMENT,
  `emailFabricante` varchar(255) DEFAULT NULL,
  `nomeFabricante` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idFabricante`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricante`
--

LOCK TABLES `fabricante` WRITE;
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
/*!40000 ALTER TABLE `fabricante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peca`
--

DROP TABLE IF EXISTS `peca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peca` (
  `idPeca` int(11) NOT NULL AUTO_INCREMENT,
  `idFabricante` int(11) NOT NULL,
  `idSetor` int(11) NOT NULL,
  `nomePeca` varchar(255) DEFAULT NULL,
  `precoPeca` int(11) NOT NULL,
  `quantidadePeca` int(11) NOT NULL,
  `fabricante_idFabricante` int(11) DEFAULT NULL,
  `setor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPeca`),
  KEY `FKpw1ged2k1u944fp7xe5ge4aj0` (`fabricante_idFabricante`),
  KEY `FK9vue7sp9y16gslleyo5t95syb` (`setor_id`),
  CONSTRAINT `FK9vue7sp9y16gslleyo5t95syb` FOREIGN KEY (`setor_id`) REFERENCES `setor` (`id`),
  CONSTRAINT `FKpw1ged2k1u944fp7xe5ge4aj0` FOREIGN KEY (`fabricante_idFabricante`) REFERENCES `fabricante` (`idFabricante`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peca`
--

LOCK TABLES `peca` WRITE;
/*!40000 ALTER TABLE `peca` DISABLE KEYS */;
/*!40000 ALTER TABLE `peca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpfPessoa` int(11) NOT NULL,
  `emailPessoa` varchar(255) DEFAULT NULL,
  `horasTrabalhadas` int(11) NOT NULL,
  `idSetor` int(11) NOT NULL,
  `idadePessoa` int(11) NOT NULL,
  `loginPessoa` varchar(255) DEFAULT NULL,
  `nomePessoa` varchar(255) DEFAULT NULL,
  `rgPessoa` int(11) NOT NULL,
  `salarioPessoa` int(11) NOT NULL,
  `senhaPessoa` varchar(255) DEFAULT NULL,
  `setor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgifj9qck823psj0ws6pgok2nf` (`setor_id`),
  CONSTRAINT `FKgifj9qck823psj0ws6pgok2nf` FOREIGN KEY (`setor_id`) REFERENCES `setor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setor`
--

DROP TABLE IF EXISTS `setor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `setor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeSetor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setor`
--

LOCK TABLES `setor` WRITE;
/*!40000 ALTER TABLE `setor` DISABLE KEYS */;
INSERT INTO `setor` VALUES (1,'Almoxarife'),(2,'Almoxarife'),(3,'Almoxarife3');
/*!40000 ALTER TABLE `setor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-29 19:49:14
