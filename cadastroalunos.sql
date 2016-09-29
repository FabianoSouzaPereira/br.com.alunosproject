-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 29, 2016 at 11:36 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cadastroalunos`
--
CREATE DATABASE IF NOT EXISTS `cadastroalunos` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `cadastroalunos`;

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Elevar_Ao_Quadrado` (INOUT `numero` INT)  BEGIN
	SET numero = numero * numero;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `alunos`
--

CREATE TABLE `alunos` (
  `idAluno` int(11) NOT NULL,
  `matriculaAluno` int(11) DEFAULT NULL,
  `nomeAluno` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `apelidoAluno` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idadeAluno` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cbIdadeAluno` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sexoAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT 'FEMININO',
  `paiAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maeAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `OutRespAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT 'Ninguém',
  `dataNascAluno` date DEFAULT NULL,
  `nacionalidadeAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `naturalidadeAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `endAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bairAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cidAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cepAluno` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `relAfetivoAluno` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `infoAdicionalAluno` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dataCadastroAluno` date DEFAULT NULL,
  `dataAtualizacaoAluno` date DEFAULT NULL,
  `fotoAluno` varchar(255) COLLATE utf8_unicode_ci DEFAULT '/iconi_grande/pessoa.png',
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `alunos`
--

INSERT INTO `alunos` (`idAluno`, `matriculaAluno`, `nomeAluno`, `apelidoAluno`, `idadeAluno`, `cbIdadeAluno`, `sexoAluno`, `paiAluno`, `maeAluno`, `OutRespAluno`, `dataNascAluno`, `nacionalidadeAluno`, `naturalidadeAluno`, `endAluno`, `bairAluno`, `cidAluno`, `cepAluno`, `relAfetivoAluno`, `infoAdicionalAluno`, `dataCadastroAluno`, `dataAtualizacaoAluno`, `fotoAluno`, `status`) VALUES
(1, 1001, 'TATIANE', 'TATA', '2', ' meses', 'FEMININO', 'PABLO LA PAZ E COSTA', 'CATRINA LA PAZ', 'NÃO HÁ', '2004-05-10', 'CHILENA', 'SANTA CLARA DE LOS PASSOS', 'RUA TIRADENTES,4532', 'FORTE SANTANA', 'FLOR DE NAPOLIS', '88032-123', 'NADA CONSTA', 'NADA CONSTA', '2016-09-21', '2016-09-22', '', 0),
(2, 1002, 'ANDRE', '', '3', ' anos ', 'MASCULINO', '', '', '', '2003-10-10', '', '', '', '', '', '     -   ', '', '', '2016-09-21', '2016-09-21', '', 0),
(3, 1003, 'CARLOS AZEVEDO', 'CACA', '4', ' meses', 'MASCULINO', 'JACKSON NETO AZEVEDO', 'MARTA AZEVEDO', 'NÃO HÁ', '2007-10-10', 'BRASILEIRO', 'MONTENEGRO', 'RUA ANTENOR DA SILVA,123', 'MARATA', 'CAMPINAS/SP', '88032-123', 'MORA COM A VÓ.', 'NÃO CONSTA.', '2016-09-21', '2016-09-22', '', 0),
(4, 1004, 'V X', '', '5', ' anos ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-21', '2016-09-21', '', 0),
(5, 1005, 'FDSF', '', '2', ' ano  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-21', '2016-09-21', '', 0),
(6, 1006, 'BXFB', ' XGF', '2', ' anos ', 'MASCULINO', 'ESRG S', 'ESRG SE', 'ERG ES', '2006-10-10', 'SERG SE', '', 'ESRG SERG ', 'SFE ES', ' SE SERG  SE', '11111-111', 'FB XFDBVXDV SFD ', '1 EFS GSEF SF', '2016-09-22', '2016-09-22', '', 0),
(7, 1007, 'ANDERSON', 'DEDE', '5', ' anos ', 'MASCULINO', 'JEFERSON ANDRADES', 'ANA CAROLINA ANDRADES', 'NÃO HÁ', '2011-10-05', 'BRASILEIRA', 'SÃO PAULO', 'RUA DO CARTÓRIO,123', 'ITAUNA', 'ITARARÉ', '94432-111', 'NADA INFORMADO', 'NADA CONSTA	', '2016-09-22', '2016-09-22', '', 0),
(8, 1008, 'FSDFS', 'DFSFD', '3', ' mês  ', 'MASCULINO', 'JULIO ROSA', 'ANITA ROSA', 'NÃO HÁ', '1111-11-11', 'URUGUAIA', 'MONTEVIDEO', 'RUA DAS VERGAMOTAS,23', 'SÃO PAULO', 'FLORIANÓPOLIS', '88032-588', 'NADA CONSTA', 'NADA CONSTA', '2016-09-22', '2016-09-22', '', 1),
(9, 1009, 'ARY MIGUEL', 'DIDI', '2', ' meses', 'MASCULINO', '', '', '', '2016-06-06', '', '', '', '', '', '     -   ', '', '', '2016-09-22', '2016-09-22', '', 0),
(11, 1011, 'VJHMHV', '', '3', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '     -   ', '', '', '2016-09-23', '2016-09-23', '', 1),
(12, 1012, 'DJGHJGJGJ', 'KHKHKH', '3', ' mês  ', 'MASCULINO', 'HBJHGJHY', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-23', '2016-09-24', '', 1),
(13, 1013, 'ABJHMJGJ', '', '3', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-23', '2016-09-24', '', 1),
(15, 1014, 'DEISE NASCIMENTO', '', '3', ' mês  ', 'MASCULINO', 'JHMFJHMT', '', '', '2014-12-10', 'UJMTCJFCJH', '', '', '', '', '-', '', '', '2016-09-23', '2016-09-28', NULL, 1),
(16, 1015, 'VALTER DOS SANTOS', '', '3', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-23', '2016-09-28', NULL, 1),
(17, 1016, 'FABIANO', '', '3', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '     -   ', '', '', '2016-09-25', '2016-09-25', '', 1),
(19, 1017, 'DEUCERTO', '', '1', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '     -   ', '', '', '2016-09-25', '2016-09-25', 'C:\\Users\\Fabiano\\Pictures\\DEUCERTO.jpg', 1),
(21, 1018, 'V X BCD XD', '', '3', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-25', '2016-09-25', 'C:\\Users\\Fabiano\\Documents\\GitHub\\mercado.com.br\\site\\imagens\\bg_320.jpg', 1),
(22, 1019, 'SAIS', '', '1', ' mês  ', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-25', '2016-09-27', 'C:\\Users\\Fabiano\\Documents\\GitHub\\mercado.com.br\\site\\imagens\\bg_smart_retrato.jpg', 1),
(24, 1020, 'DEDD', '', '2', ' meses', 'MASCULINO', '', '', '', '1111-11-11', '', '', '', '', '', '-', '', '', '2016-09-27', '2016-09-27', 'C:\\Users\\Fabiano\\Documents\\GitHub\\mercado.com.br\\site\\imagens\\bg_smart_paisagem.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `autoizadosbuscacrianca`
--

CREATE TABLE `autoizadosbuscacrianca` (
  `id` int(11) NOT NULL,
  `nomeAutorizado` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `parentescoAutorizado` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nomeTransporte` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `emails`
--

CREATE TABLE `emails` (
  `id` int(11) NOT NULL,
  `emailPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `emailMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `emailAluno` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `emailOutroResp` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `horariostransportes`
--

CREATE TABLE `horariostransportes` (
  `id` int(11) NOT NULL,
  `id_aluno` int(11) NOT NULL,
  `horaChegada` time NOT NULL,
  `horaSaida` time NOT NULL,
  `diasSemana` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `infomedica`
--

CREATE TABLE `infomedica` (
  `idAluno` int(11) NOT NULL,
  `tipoAlergia` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `tipoResAtividade` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nomeMedico` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `InfoAdicional` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mae`
--

CREATE TABLE `mae` (
  `id` int(11) NOT NULL,
  `nomeMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `profissaoMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `dataNascimento` date NOT NULL,
  `nacionalidadeMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `naturalidadeMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `endMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `bairMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cidMae` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cep` int(11) NOT NULL,
  `localTrabalho` int(60) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `outrosreponsaveis`
--

CREATE TABLE `outrosreponsaveis` (
  `id` int(11) NOT NULL,
  `nomeOutResp` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `parentescoOutResp` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `endOutResp` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `bairroOutRep` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cidOutResp` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cepOutroResp` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pai`
--

CREATE TABLE `pai` (
  `id` int(11) NOT NULL,
  `nomePai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `profissaoPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `dataNascimentoPai` date NOT NULL,
  `nacionalidadePai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `naturalidadePai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `endPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `bairroPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cidPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `estPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Santa Catarina',
  `paisPai` varchar(60) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Brasil',
  `cepPai` int(11) NOT NULL,
  `localTrabalho` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `telefones`
--

CREATE TABLE `telefones` (
  `idTelefones` int(11) NOT NULL,
  `telefonesAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `celularAluno` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefonesPai` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefonesMae` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tefefoneOutroResp` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefonesEnergencia` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefonesTranporte` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `telefones`
--

INSERT INTO `telefones` (`idTelefones`, `telefonesAluno`, `celularAluno`, `telefonesPai`, `telefonesMae`, `tefefoneOutroResp`, `telefonesEnergencia`, `telefonesTranporte`, `status`) VALUES
(1, '(21)3423-2232', '(21)9583-9382', NULL, NULL, NULL, NULL, NULL, 0),
(2, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 0),
(3, '(11)3232-2029', '(11)9698-2030', NULL, NULL, NULL, NULL, NULL, 0),
(4, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 0),
(5, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 0),
(6, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 0),
(7, '(67)3423-4233', '(67)9723-2342', NULL, NULL, NULL, NULL, NULL, 0),
(8, '(48)3232-3232', '(48)2323-4232', NULL, NULL, NULL, NULL, NULL, 1),
(9, '(48)3232-5654', '(48)4565-5433', NULL, NULL, NULL, NULL, NULL, 0),
(10, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(11, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(12, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(13, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(14, '(11)1111-1111', '(11)1111-1111', NULL, NULL, NULL, NULL, NULL, 1),
(15, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(16, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(17, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(18, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(19, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(20, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(21, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(22, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(23, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(24, '(  )    -    ', '(  )    -    ', NULL, NULL, NULL, NULL, NULL, 1),
(25, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(26, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1),
(27, '(  )    -', '(  )    -', NULL, NULL, NULL, NULL, NULL, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`idAluno`),
  ADD UNIQUE KEY `matriculaAluno_2` (`matriculaAluno`),
  ADD KEY `nomeAluno` (`nomeAluno`),
  ADD KEY `matriculaAluno` (`matriculaAluno`);

--
-- Indexes for table `emails`
--
ALTER TABLE `emails`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `horariostransportes`
--
ALTER TABLE `horariostransportes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `id_aluno` (`id_aluno`);

--
-- Indexes for table `infomedica`
--
ALTER TABLE `infomedica`
  ADD PRIMARY KEY (`idAluno`),
  ADD KEY `idAluno` (`idAluno`);

--
-- Indexes for table `mae`
--
ALTER TABLE `mae`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `outrosreponsaveis`
--
ALTER TABLE `outrosreponsaveis`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `pai`
--
ALTER TABLE `pai`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `telefones`
--
ALTER TABLE `telefones`
  ADD PRIMARY KEY (`idTelefones`),
  ADD KEY `id` (`idTelefones`),
  ADD KEY `idTelefones` (`idTelefones`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alunos`
--
ALTER TABLE `alunos`
  MODIFY `idAluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `telefones`
--
ALTER TABLE `telefones`
  MODIFY `idTelefones` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `emails`
--
ALTER TABLE `emails`
  ADD CONSTRAINT `emails_ibfk_1` FOREIGN KEY (`id`) REFERENCES `alunos` (`idAluno`),
  ADD CONSTRAINT `emails_ibfk_2` FOREIGN KEY (`id`) REFERENCES `pai` (`id`),
  ADD CONSTRAINT `emails_ibfk_3` FOREIGN KEY (`id`) REFERENCES `mae` (`id`);

--
-- Constraints for table `infomedica`
--
ALTER TABLE `infomedica`
  ADD CONSTRAINT `infomedica_ibfk_1` FOREIGN KEY (`idAluno`) REFERENCES `alunos` (`idAluno`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
