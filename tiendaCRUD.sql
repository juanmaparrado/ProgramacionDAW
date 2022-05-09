

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

CREATE DATABASE IF NOT EXISTS `tiendaCRUD` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `tiendaCRUD`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `productoID` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `proveedor` varchar(100) NOT NULL CHECK ( proveedor IN ('Xiaomi','Apple','Samsung','LG','Realme','Huawei')),
  `precio` int(11) NOT NULL,
  `cantidad` INT(11) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`productoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `producto` (`productoID`, `nombre`, `proveedor`, `precio`, `cantidad`) VALUES
(1200, 'Iphone XR', 'Apple', 1000, 46),
(1201, 'Redmi Note 10', 'Xiaomi', 250, 150),
(1202, 'Galaxy S10', 'Samsung', 750, 67),
(1203, 'P40', 'Huawei', 600, 230),
(1204, 'POPOO 32', 'Realme', 500, 70),
(1205, 'Galaxy S12', 'Samsung', 1200, 20),
(1206, 'Iphone 8', 'Apple', 500, 34),
(1207, 'Mi Lite 10', 'Xiaomi', 250, 150);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
