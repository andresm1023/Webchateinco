-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-04-2018 a las 12:39:57
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_prueba`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_verificaEmpleado` (`pdni` VARCHAR(45), `ppass` VARCHAR(45), `pprivilegio` VARCHAR(45))  BEGIN
	select * from empleado where dni =pdni and pass=ppass and privilegio=pprivilegio;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombres` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombres`, `correo`, `nickname`, `pass`) VALUES
('12345', 'Ruiz Benites', 'Oscar', 'Gerente'),
('54321', 'Orches Montero', 'Angela', 'Recepción'),
('camilo', 'andrusmart@hotmail.com', 'andrus612', '123456'),
('andres', 'andrusmart@hotmail.com', 'camilo123', '12345'),
('juan', 'juan@hotmail.com', 'juancho', '123456'),
('luz', 'luz@hotmail.com', 'mery', '1234'),
('aurora', 'auro@gmail.com', 'auro', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
