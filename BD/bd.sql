-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: emprendimientosudea
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `business` (
  `business_id` int NOT NULL AUTO_INCREMENT,
  `business_delivery` bit(1) NOT NULL,
  `business_description` mediumtext NOT NULL,
  `business_location` varchar(255) NOT NULL,
  `business_name` varchar(150) NOT NULL,
  `business_phone_number` varchar(15) NOT NULL,
  `business_service_hours` varchar(200) NOT NULL,
  `business_status` bit(1) NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`business_id`),
  KEY `FKjkjjimeu5p0gv4orhue734xni` (`user_id`),
  CONSTRAINT `FKjkjjimeu5p0gv4orhue734xni` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
INSERT INTO `business` VALUES (1,_binary '','Bugros B.A. es un negocio especializado en la venta de condones y productos de bienestar sexual, dise├▒ado para ofrecer protecci├│n, placer y confianza con un enfoque moderno y libre de tab├║es.\n\nDescripci├│n detallada:\n- Variedad de productos:\n  ΓÇó Condones de l├ítex y no l├ítex (para alergias).\n  ΓÇó Sabores cl├ísicos y ex├│ticos (fresa, chocolate, menta).\n  ΓÇó Texturas (ultrafinos, con relieves, retardantes).\n  ΓÇó Lubricantes a base de agua y silicona.\n  ΓÇó Pruebas r├ípidas de ETS y juguetes ├¡ntimos b├ísicos.\n\n- Experiencia de compra:\n  ΓÇó Tienda f├¡sica: Dise├▒o minimalista y privado.\n  ΓÇó Venta online: Env├¡os discretos y pagos seguros.\n\n- P├║blico objetivo: Hombres/mujeres de 18 a 45 a├▒os.\n- Valor diferencial: Precios competitivos y asesor├¡a b├ísica.','Bloque 19, segundo piso','Condoms Bugros B.A','3218509336','Lunes a Viernes: 9am-7pm, S├íbados: 10am-5pm',_binary '',1),(2,_binary '','Moda Urbana es un emprendimiento especializado en ropa contempor├ínea, ofreciendo estilo, calidad y tendencias accesibles para hombres y mujeres.\n\nDescripci├│n detallada:\n- Variedad de productos:\n  ΓÇó Ropa casual: Camisetas, jeans, sudaderas y shorts en dise├▒os exclusivos.\n  ΓÇó Ropa formal: Camisas, blazers y pantalones de oficina.\n  ΓÇó Accesorios: Gorras, cinturones y bolsos de moda.\n  ΓÇó Colecciones limitadas: Ediciones especiales por temporada.\n\n- Experiencia de compra:\n  ΓÇó Tienda f├¡sica: Ambiente moderno con probadores espaciosos.\n  ΓÇó E-commerce: Cat├ílogo online con tallas precisas y gu├¡a de medidas.\n  ΓÇó Env├¡os express en 24/48 horas (gratis en compras superiores a $50).\n\n- P├║blico objetivo:\n  ΓÇó Hombres y mujeres de 15 a 40 a├▒os que buscan estilo urbano.\n  ΓÇó Profesionales j├│venes que necesitan ropa vers├ítil oficina/afterwork.\n\n- Valor diferencial:\n  ΓÇó Precios justos (20% m├ís econ├│mico que marcas establecidas).\n  ΓÇó Talleres de styling gratuito cada mes para clientes frecuentes.\n  ΓÇó Sistema de trueque: Lleva prendas en buen estado y recibe descuentos.','En la casa de Alex','Peluches y locuras','3023803018','Lunes a Sabado: 10am-5pm',_binary '',2),(3,_binary '','Delicias Express es un restaurante especializado en comida r├ípida gourmet, con ingredientes frescos y opciones saludables.\n\nEspecialidades:\n- Hamburguesas artesanales\n- S├índwiches premium\n- Ensaladas personalizadas\n\nHorarios flexibles y servicio a domicilio r├ípido.','Cra 45 #12-34, Medell├¡n','Delicias Express','3105678923','Lunes a Domingo: 11am-10pm',_binary '',4),(4,_binary '\0','FitLife Gym es un centro de entrenamiento integral con entrenadores expertos y equipos de ├║ltima generaci├│n.\n\nServicios:\n- Pesas y musculaci├│n\n- Clases grupales (yoga, spinning, HIIT)\n- Planes de nutrici├│n personalizados.','Calle 50 #32-11, Envigado','FitLife Gym','3229987766','Lunes a Viernes: 6am-10pm, S├íbados: 8am-5pm',_binary '',3),(5,_binary '\0','RetroGaming Zone es una tienda y caf├⌐ tem├ítico de videojuegos retro con consolas cl├ísicas disponibles para jugar.\n\nDestacado por:\n- Venta de juegos y consolas retro\n- Torneos de videojuegos semanales\n- Experiencia inmersiva en un ambiente vintage.','Centro Comercial Viva, Local 14','RetroGaming Zone','3117891234','Lunes a Domingo: 2pm-11pm',_binary '',5),(6,_binary '','Glow Beauty ofrece productos y tratamientos para el cuidado de la piel con ingredientes naturales y cruelty-free.\n\nServicios:\n- Faciales personalizados\n- Venta de productos org├ínicos\n- Tratamientos rejuvenecedores.','Carrera 70 #45-23, Itag├╝├¡','Glow Beauty','3204456677','Martes a S├íbado: 10am-7pm',_binary '',6),(7,_binary '','Relax Spa es un centro de relajaci├│n y bienestar que ofrece masajes terap├⌐uticos y tratamientos antiestr├⌐s.\n\nServicios:\n- Masajes relajantes y descontracturantes\n- Aromaterapia\n- Hidrataci├│n y cuidado corporal.','Av. Las Palmas #22-18, Medell├¡n','Relax Spa','3151122334','Lunes a Domingo: 9am-9pm',_binary '',7);
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `business_category`
--

DROP TABLE IF EXISTS `business_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `business_category` (
  `business_category_id` int NOT NULL AUTO_INCREMENT,
  `business_id` int NOT NULL,
  `category_id` int NOT NULL,
  PRIMARY KEY (`business_category_id`),
  KEY `FKpphxqd3m7af7xsylvpb26gqp8` (`business_id`),
  KEY `FK8ueqig0umcgcl43meu9onmfsg` (`category_id`),
  CONSTRAINT `FK8ueqig0umcgcl43meu9onmfsg` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
  CONSTRAINT `FKpphxqd3m7af7xsylvpb26gqp8` FOREIGN KEY (`business_id`) REFERENCES `business` (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business_category`
--

LOCK TABLES `business_category` WRITE;
/*!40000 ALTER TABLE `business_category` DISABLE KEYS */;
INSERT INTO `business_category` VALUES (1,1,7),(2,2,6),(3,3,1),(4,3,1),(5,4,2),(6,5,3),(7,6,4),(8,7,5);
/*!40000 ALTER TABLE `business_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) NOT NULL,
  `category_status` bit(1) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Food',_binary ''),(2,'Sport',_binary ''),(3,'Entertainment',_binary ''),(4,'Cosmetic',_binary ''),(5,'Personal Service',_binary ''),(6,'Miscellaneous',_binary ''),(7,'Other',_binary '');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_type`
--

DROP TABLE IF EXISTS `document_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document_type` (
  `document_type_id` int NOT NULL AUTO_INCREMENT,
  `document_type_name` varchar(30) NOT NULL,
  PRIMARY KEY (`document_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_type`
--

LOCK TABLES `document_type` WRITE;
/*!40000 ALTER TABLE `document_type` DISABLE KEYS */;
INSERT INTO `document_type` VALUES (1,'National ID Card'),(2,'MinorΓÇÖs ID Card'),(3,'Passport'),(4,'Foreigner ID Card');
/*!40000 ALTER TABLE `document_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ethnicity`
--

DROP TABLE IF EXISTS `ethnicity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ethnicity` (
  `ethnicity_id` int NOT NULL AUTO_INCREMENT,
  `ethnicity_name` varchar(50) NOT NULL,
  PRIMARY KEY (`ethnicity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ethnicity`
--

LOCK TABLES `ethnicity` WRITE;
/*!40000 ALTER TABLE `ethnicity` DISABLE KEYS */;
INSERT INTO `ethnicity` VALUES (1,'Indigenous'),(2,'Afrocolombian'),(3,'Palenquero'),(4,'Raizal'),(5,'Mestizo'),(6,'White'),(7,'Gypsy'),(8,'None');
/*!40000 ALTER TABLE `ethnicity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `image` (
  `image_id` int NOT NULL AUTO_INCREMENT,
  `imageurl` varchar(255) NOT NULL,
  `business_id` int NOT NULL,
  PRIMARY KEY (`image_id`),
  KEY `FK2fm9g06pkjyg0q8vqbl48l2ef` (`business_id`),
  CONSTRAINT `FK2fm9g06pkjyg0q8vqbl48l2ef` FOREIGN KEY (`business_id`) REFERENCES `business` (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` VALUES (1,'https://www.who.int/images/default-source/departments/reproductive-health/family-planning/shutterstock_21334383378e3e622f-940e-4db3-a9e3-e00376b87827.jpg?sfvrsn=e024aaef_11',1),(2,'https://mir-s3-cdn-cf.behance.net/projects/404/63e895133931967.Y3JvcCwxMTUwLDkwMCwxMjUsMA.jpg',2),(3,'https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Good_Food_Display_-_NCI_Visuals_Online.jpg/1200px-Good_Food_Display_-_NCI_Visuals_Online.jpg',3),(4,'https://www.hussle.com/blog/wp-content/uploads/2020/12/Gym-structure-1080x675.png',4),(5,'https://cdn.bluent.com/images/wher-are-we-going.webp',5),(6,'https://media.istockphoto.com/id/1658893205/es/foto/inventar-productos-en-la-vista-superior-de-fondo-rosa.jpg?s=612x612&w=0&k=20&c=XX_FdY2MVCSnlJY-D9BuC-C6qCJAqStGokQRAoD58Go=',6),(8,'https://opcions.org/wp-content/uploads/elementor/thumbs/condons-granel-q16ux3xt5iw9d8rpvg62w3zbmbt7knugw0wskwd2ww.jpg',1),(9,'https://images.ctfassets.net/juauvlea4rbf/27ezpnnOY4qA0eYOYkwkig/ed0be23d7162e45f28b7182a1672747c/contenful_ES.png?w=960&h=480&q=50&fm=png',1),(10,'https://pymstatic.com/24505/conversions/mejores-marcas-preservativos-wide_webp.webp',1),(11,'https://marcas.genommalab.com/hubfs/condones-m-marketplace-packs.webp',1);
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `occupation`
--

DROP TABLE IF EXISTS `occupation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `occupation` (
  `occupation_id` int NOT NULL AUTO_INCREMENT,
  `occupation_name` varchar(100) NOT NULL,
  PRIMARY KEY (`occupation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `occupation`
--

LOCK TABLES `occupation` WRITE;
/*!40000 ALTER TABLE `occupation` DISABLE KEYS */;
INSERT INTO `occupation` VALUES (1,'Student'),(2,'Teacher'),(3,'Graduate'),(4,'Visitor');
/*!40000 ALTER TABLE `occupation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal_data`
--

DROP TABLE IF EXISTS `personal_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personal_data` (
  `personal_data_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `identification_number` varchar(12) NOT NULL,
  `last_names` varchar(50) NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  `document_type_id` int NOT NULL,
  `ethnicity_id` int NOT NULL,
  `occupation_id` int NOT NULL,
  `user_id` int NOT NULL,
  `vulnerability_id` int NOT NULL,
  PRIMARY KEY (`personal_data_id`),
  UNIQUE KEY `UK3lg58y8rawfxw06p5ujo92l96` (`user_id`),
  KEY `FKqhyy11c6oguahwi407qc48ja2` (`document_type_id`),
  KEY `FKg1e8drmtbjglo5udm9df3dssg` (`ethnicity_id`),
  KEY `FKni7o5u9d80qie8ht3thj6l6t` (`occupation_id`),
  KEY `FKw9btvkqvb4rvvqm9q0h5gtvk` (`vulnerability_id`),
  CONSTRAINT `FKaldig96pctyux6eo4h01in4pw` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKg1e8drmtbjglo5udm9df3dssg` FOREIGN KEY (`ethnicity_id`) REFERENCES `ethnicity` (`ethnicity_id`),
  CONSTRAINT `FKni7o5u9d80qie8ht3thj6l6t` FOREIGN KEY (`occupation_id`) REFERENCES `occupation` (`occupation_id`),
  CONSTRAINT `FKqhyy11c6oguahwi407qc48ja2` FOREIGN KEY (`document_type_id`) REFERENCES `document_type` (`document_type_id`),
  CONSTRAINT `FKw9btvkqvb4rvvqm9q0h5gtvk` FOREIGN KEY (`vulnerability_id`) REFERENCES `vulnerability` (`vulnerability_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal_data`
--

LOCK TABLES `personal_data` WRITE;
/*!40000 ALTER TABLE `personal_data` DISABLE KEYS */;
INSERT INTO `personal_data` VALUES (1,'Samuel','1022145229','Lopez Marin','3023803018',1,6,1,1,11),(2,'Alex','1000760816','Osorio Trespalacios','3137444865',1,6,1,2,11),(9,'Mar├¡a','1034567890','G├│mez Rodr├¡guez','3105678923',2,2,2,3,4),(11,'Juan','1011121314','P├⌐rez Fern├índez','3204456677',1,5,3,4,3),(12,'Lina','1022233445','Mart├¡nez Pardo','3117891234',3,4,1,5,6),(13,'Sebasti├ín','1009876543','L├│pez Ram├¡rez','3229987766',4,3,4,6,2),(14,'Camila','1098765432','S├ínchez Torres','3151122334',2,1,3,7,5),(15,'Juan','4380865710','Marin','3137444865',1,8,4,12,11),(16,'Jerardo','1234567891','ajjaja','3023803018',3,1,2,13,10),(17,'Bugro','1022145229','asdasd','3023803018',2,4,1,14,9),(18,'Frank','1111111111','Lopez','3023803018',1,1,1,15,4),(19,'Nelson','1234567890','Palacio ','3025555555',1,8,2,16,9);
/*!40000 ALTER TABLE `personal_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `review_id` int NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) NOT NULL,
  `rating` int NOT NULL,
  `review_description` mediumtext NOT NULL,
  `business_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`review_id`),
  KEY `FKm13yaprj13mwwfooaqvn8u31b` (`business_id`),
  KEY `FKiyf57dy48lyiftdrf7y87rnxi` (`user_id`),
  CONSTRAINT `FKiyf57dy48lyiftdrf7y87rnxi` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKm13yaprj13mwwfooaqvn8u31b` FOREIGN KEY (`business_id`) REFERENCES `business` (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'2025-04-03 15:48:01.000000',5,'The best condoms in the world',1,2),(2,'2025-04-03 15:54:02.000000',5,'What awful clothes!',2,1),(3,'2025-04-03 16:36:47.000000',4,'Great burgers and fast service!',3,1),(4,'2025-04-03 17:06:30.000000',5,'Best gym in town!',4,4),(5,'2025-04-03 17:11:15.000000',5,'Awesome place for retro gamers!',5,3),(6,'2025-04-03 17:14:16.000000',4,'Great skin products!',6,7),(8,'2025-04-04 22:55:32.000000',2,'Thats crazy',1,7);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `roles_id` int NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) NOT NULL,
  `updated_at` datetime(6) NOT NULL,
  `user_id` int NOT NULL,
  `user_type_id` int NOT NULL,
  PRIMARY KEY (`roles_id`),
  KEY `FKkipq0epw9t7dv8j9bsmrg3wdg` (`user_id`),
  KEY `FKq7tixe94c8yv9156ril4y8h0r` (`user_type_id`),
  CONSTRAINT `FKkipq0epw9t7dv8j9bsmrg3wdg` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKq7tixe94c8yv9156ril4y8h0r` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`user_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'2025-04-03 15:38:58.000000','2025-04-03 15:38:58.000000',1,1),(2,'2025-04-03 15:40:53.000000','2025-04-03 15:40:53.000000',2,1),(3,'2025-04-03 15:44:26.000000','2025-04-03 15:44:26.000000',3,1),(4,'2025-04-03 15:44:32.000000','2025-04-03 15:44:32.000000',4,1),(5,'2025-04-03 15:44:40.000000','2025-04-03 15:44:40.000000',5,1),(6,'2025-04-03 15:44:54.000000','2025-04-03 15:44:54.000000',6,1),(7,'2025-04-03 15:44:59.000000','2025-04-03 15:44:59.000000',7,1),(8,'2025-04-04 13:31:26.620567','2025-04-04 13:31:26.620567',1,2),(9,'2025-04-05 16:50:34.665439','2025-04-05 16:50:34.665439',8,1),(10,'2025-04-05 17:01:50.810707','2025-04-05 17:01:50.810707',12,1),(11,'2025-04-05 20:43:07.679785','2025-04-05 20:43:07.679785',13,1),(12,'2025-04-05 20:49:07.899822','2025-04-05 20:49:07.899822',14,1),(13,'2025-04-06 08:24:51.587980','2025-04-06 08:24:51.587980',15,1),(14,'2025-04-06 08:49:13.537561','2025-04-06 08:49:13.537561',16,1);
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `set_updated_at_on_insert` BEFORE INSERT ON `roles` FOR EACH ROW BEGIN
    -- Si es una nueva inserci├│n (no tiene created_at a├║n)
    IF NEW.created_at IS NOT NULL THEN
        SET NEW.updated_at = NEW.created_at;
    ELSE
        -- Si created_at no viene, usamos la fecha/hora actual
        SET NEW.created_at = NOW();
        SET NEW.updated_at = NEW.created_at;
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `social_media`
--

DROP TABLE IF EXISTS `social_media`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `social_media` (
  `social_media_id` int NOT NULL AUTO_INCREMENT,
  `platform` enum('FACEBOOK','INSTAGRAM','TIKTOK','TWITTER','WEBSITE','WHATSAPP') NOT NULL,
  `url` varchar(255) NOT NULL,
  `business_id` int NOT NULL,
  PRIMARY KEY (`social_media_id`),
  KEY `FKmtqfaox8diokuaj5365r17b40` (`business_id`),
  CONSTRAINT `FKmtqfaox8diokuaj5365r17b40` FOREIGN KEY (`business_id`) REFERENCES `business` (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_media`
--

LOCK TABLES `social_media` WRITE;
/*!40000 ALTER TABLE `social_media` DISABLE KEYS */;
INSERT INTO `social_media` VALUES (1,'FACEBOOK','https://www.facebook.com/',1),(2,'FACEBOOK','https://www.facebook.com/',2),(3,'INSTAGRAM','https://www.instagram.com/delicias_express',3),(4,'INSTAGRAM','https://www.instagram.com/delicias_express',3),(5,'FACEBOOK','https://www.facebook.com/fitlifegym',4),(6,'FACEBOOK','https://www.youtube.com/retrogamingzone',5),(7,'INSTAGRAM','https://www.instagram.com/glowbeauty',6),(9,'INSTAGRAM','https://www.instagram.com/',1),(10,'TIKTOK','https://www.tiktok.com/',1),(11,'WHATSAPP','https://wa.me/573218509336',1),(12,'TWITTER','https://x.com/',1),(13,'WEBSITE','https://github.com/Bugro',1);
/*!40000 ALTER TABLE `social_media` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_status` bit(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'samuellopezmarin2006@gmail.com','123456789',_binary ''),(2,'alexDev@gmail.com','987654321',_binary ''),(3,'maria.gomez@gmail.com','maria1234',_binary ''),(4,'juan.perez@hotmail.com','juanpass567',_binary ''),(5,'lina.martinez@yahoo.com','linaSecure!',_binary ''),(6,'sebastian.lopez@outlook.com','seb2024!!',_binary ''),(7,'camila.sanchez@gmail.com','camiPass456',_binary ''),(8,'linamaria301072@gmail.com','123456789',_binary ''),(12,'juanjuan@gmail.com','123456789',_binary ''),(13,'jerardo@gmail.com','123456789',_binary ''),(14,'bugro@gmail.com','123456789',_binary ''),(15,'frank@gmail.com','123456789',_binary ''),(16,'nelson@meil.com','11111111',_binary '');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_type` (
  `user_type_id` int NOT NULL AUTO_INCREMENT,
  `user_type_name` varchar(50) NOT NULL,
  PRIMARY KEY (`user_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'User'),(2,'Admin');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vulnerability`
--

DROP TABLE IF EXISTS `vulnerability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vulnerability` (
  `vulnerability_id` int NOT NULL AUTO_INCREMENT,
  `vulnerability_name` varchar(50) NOT NULL,
  PRIMARY KEY (`vulnerability_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vulnerability`
--

LOCK TABLES `vulnerability` WRITE;
/*!40000 ALTER TABLE `vulnerability` DISABLE KEYS */;
INSERT INTO `vulnerability` VALUES (1,'Disabled person'),(2,'Invalid person'),(3,'Victim of armed conflict'),(4,'Single mother'),(5,'Extreme poverty'),(6,'Homeless'),(7,'Migrant of refugee'),(8,'LGBTQ+ community'),(9,'Displaced by armed conflict'),(10,'Displaced by natural disaster'),(11,'None');
/*!40000 ALTER TABLE `vulnerability` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-06  9:48:16
