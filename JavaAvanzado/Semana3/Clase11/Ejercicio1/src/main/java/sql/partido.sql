-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-01-2024 a las 17:53:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `ID` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `PUNTUACIONEQUIPOLOCAL` int(11) DEFAULT NULL,
  `PUNTUACIONEQUIPOVISITANTE` int(11) DEFAULT NULL,
  `idEquipoLocal` int(11) DEFAULT NULL,
  `idEquipoVisitante` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`ID`, `FECHA`, `PUNTUACIONEQUIPOLOCAL`, `PUNTUACIONEQUIPOVISITANTE`, `idEquipoLocal`, `idEquipoVisitante`) VALUES
(1, '2024-01-02', 23, 43, 3, 3),
(2, '2024-01-01', 12, 33, 2, 2),
(3, '2024-01-01', 1, 2, 1, 1),
(4, '2024-01-01', 123, 123123, 1, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PARTIDO_idEquipoLocal` (`idEquipoLocal`),
  ADD KEY `FK_PARTIDO_idEquipoVisitante` (`idEquipoVisitante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `FK_PARTIDO_idEquipoLocal` FOREIGN KEY (`idEquipoLocal`) REFERENCES `equipo` (`ID`),
  ADD CONSTRAINT `FK_PARTIDO_idEquipoVisitante` FOREIGN KEY (`idEquipoVisitante`) REFERENCES `equipo` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
