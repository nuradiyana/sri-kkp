-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: May 07, 2014 at 04:02 AM
-- Server version: 5.5.36
-- PHP Version: 5.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sridb`
--

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `ID` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `KODE_PEGAWAI` varchar(5) DEFAULT NULL,
  `NAMA_PEGAWAI` varchar(45) DEFAULT NULL,
  `JABATAN` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `KODE_PEGAWAI_UNIQUE` (`KODE_PEGAWAI`),
  UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`ID`, `KODE_PEGAWAI`, `NAMA_PEGAWAI`, `JABATAN`, `EMAIL`) VALUES
(0000000001, 'Test1', 'Test Nama', 'Test Jabatan', 'test@test.com'),
(0000000002, 'Test2', 'Test Nama 2', 'Test Jabatan 2', 'test2@test2.com');

-- --------------------------------------------------------

--
-- Table structure for table `perusahaan`
--

CREATE TABLE IF NOT EXISTS `perusahaan` (
  `ID` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `KODE_PERUSAHAAN` varchar(45) DEFAULT NULL,
  `NAMA_PERUSAHAAN` varchar(45) DEFAULT NULL,
  `ALAMAT` varchar(145) DEFAULT NULL,
  `KOTA` varchar(45) DEFAULT NULL,
  `KODEPOS` varchar(5) DEFAULT NULL,
  `NO_TELP` varchar(12) DEFAULT NULL,
  `NO_FAX` varchar(12) DEFAULT NULL,
  `SUMBER` varchar(45) DEFAULT NULL,
  `JENIS` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `KODE_PERUSAHAAN_UNIQUE` (`KODE_PERUSAHAAN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `program`
--

CREATE TABLE IF NOT EXISTS `program` (
  `ID` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `KODE_PROGRAM` varchar(45) DEFAULT NULL,
  `JENIS_PROGRAM` varchar(45) DEFAULT NULL,
  `JUDUL_PROGRAM` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `KODE_PROGRAM_UNIQUE` (`KODE_PROGRAM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `NAMA_LENGKAP` varchar(45) DEFAULT NULL,
  `USERNAME` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `USERNAME_UNIQUE` (`USERNAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `NAMA_LENGKAP`, `USERNAME`, `PASSWORD`) VALUES
(0000000001, 'TEST USER', 'Test', '1111');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
