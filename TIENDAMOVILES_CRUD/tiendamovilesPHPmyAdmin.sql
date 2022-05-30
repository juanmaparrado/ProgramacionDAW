-- phpMyAdmin SQL Dump
-- version 4.6.6deb4+deb9u2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 30-05-2022 a las 13:32:54
-- Versión del servidor: 10.1.48-MariaDB-0+deb9u2
-- Versión de PHP: 7.0.33-0+deb9u10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendamoviles`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `clienteID` int(11) NOT NULL,
  `NomCli` varchar(30) NOT NULL,
  `ApeCli` varchar(70) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `email` varchar(60) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`clienteID`, `NomCli`, `ApeCli`, `DNI`, `email`, `pass`) VALUES
(1, 'Juani', 'Sanchez  ', '24364724R', 'juansanchez@gmail.com', '1234'),
(2, 'Antonio', 'Perez', '26368724A', 'antonioper@gmail.com', 'aaaa'),
(3, 'Ana', 'Gomez', '52372644J', 'agome@gmail.com', '9876'),
(4, 'Jose', 'Gutierrez', '36472424P', 'jgut@gmail.com', '1111'),
(5, 'Alejandro', 'Casas', '72264368N', 'casasale@gmail.com', '6666'),
(6, 'Juan', 'Escribano', '26523744J', 'admin@gmail.com', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `pedidoID` int(11) NOT NULL,
  `fechaPed` date NOT NULL,
  `metodoPago` varchar(40) NOT NULL,
  `clienteID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`pedidoID`, `fechaPed`, `metodoPago`, `clienteID`) VALUES
(1, '0000-00-00', 'TARJETA', 1),
(2, '0000-00-00', 'PAYPAL', 1),
(3, '0000-00-00', 'TARJETA', 4),
(4, '0000-00-00', 'BIZUM', 2),
(5, '0000-00-00', 'BIZUM', 6),
(6, '0000-00-00', 'TARJETA', 2),
(7, '0000-00-00', 'TARJETA', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `productoID` int(11) NOT NULL,
  `proveedor` varchar(60) NOT NULL,
  `nomProd` varchar(60) NOT NULL,
  `precio` int(11) NOT NULL,
  `cantPro` int(11) NOT NULL,
  `proce` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`productoID`, `proveedor`, `nomProd`, `precio`, `cantPro`, `proce`) VALUES
(1, 'Xiaomi', 'Redmi Note 8 ', 350, 12, 'España'),
(2, 'Apple', 'Iphone 8', 800, 50, 'China'),
(3, 'Samsung', 'Galaxy 10', 500, 34, 'Japon'),
(4, 'Realme', 'NotePad 45', 235, 60, 'Alemania'),
(5, 'Xiaomi', 'Mi Lite 5G', 270, 170, 'Holanda'),
(6, 'Apple', 'Iphone XR', 1000, 5, 'Holanda'),
(7, 'Samsung', 'Galaxy SE', 467, 12, 'Tailandia'),
(8, 'Apple', 'Iphone 5', 370, 43, 'Italia');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`clienteID`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`pedidoID`),
  ADD KEY `clienteID` (`clienteID`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`productoID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `clienteID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `pedidoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `productoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`clienteID`) REFERENCES `cliente` (`clienteID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
