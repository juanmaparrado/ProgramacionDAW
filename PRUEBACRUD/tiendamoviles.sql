
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE DATABASE IF NOT EXISTS `tiendamoviles` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `tiendamoviles`;

CREATE TABLE IF NOT EXISTS cliente 
(
  clienteID INT NOT NULL AUTO_INCREMENT ,
  NomCli VARCHAR(30) NOT NULL,
  ApeCli VARCHAR(70) NOT NULL,
  DNI VARCHAR(9)  NOT NULL,
  email VARCHAR(60) NOT NULL ,
  pass VARCHAR(30) NOT NULL,
  PRIMARY KEY (clienteID)
);

CREATE TABLE IF NOT EXISTS producto
(
  productoID INT  AUTO_INCREMENT NOT NULL,
  proveedor VARCHAR(60) NOT NULL,
  nomProd VARCHAR(60) NOT NULL,
  precio INT NOT NULL,
  cantPro INT NOT NULL,
  PRIMARY KEY (productoID)
);

CREATE TABLE IF NOT EXISTS pedidos
(
  pedidoID INT  AUTO_INCREMENT NOT NULL,
  fechaPed DATE NOT NULL,
  metodoPago VARCHAR(40) NOT NULL,
  clienteID INT NOT NULL,
  PRIMARY KEY (pedidoID),
  FOREIGN KEY (clienteID) REFERENCES cliente(clienteID)
    
);     


INSERT INTO `cliente`(`NomCli`,`ApeCli`,`DNI`,`email`,`pass`) VALUES
   ('Juan','Sanchez','24364724R','juansanchez@gmail.com','1234'),
   ('Antonio','Perez','26368724A','antonioper@gmail.com','aaaa'),
   ('Ana','Gomez','52372644J','agome@gmail.com','9876'),
   ('Jose','Gutierrez','36472424P','jgut@gmail.com','1111'),
   ('Alejandro','Casas','72264368N','casasale@gmail.com','6666'),
   ('Juan','Escribano','26523744J','admin@gmail.com','admin');
    
	

INSERT INTO `producto` (`proveedor`,`nomProd`,`precio`,`cantPro`) VALUES
    ('Xiaomi','Redmi Note 8','350','12'),
    ('Apple','Iphone 8','800','50'),
    ('Samsung','Galaxy 10','500','34'),
    ('Realme','NotePad 45','235','60'),
    ('Xiaomi','Mi Lite 5G','270','170'),
    ('Apple','Iphone XR','1000','5'),
    ('Samsung','Galaxy SE','467','12'),
    ('Apple','Iphone 5','370','43');


	INSERT INTO `pedidos`(`fechaPed`,`metodoPago`,`clienteID`) VALUES
  ('17/10/2020','TARJETA',1),
  ('10/01/2021','PAYPAL',1),
  ('10/02/2019','TARJETA',4),
  ('01/02/2020','BIZUM',2),
  ('01/02/2019','BIZUM',6),
  ('03/04/2014','TARJETA',2),
  ('22/11/2018','TARJETA',1);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
  

