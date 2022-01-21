-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 29, 2021 at 02:05 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siom`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `password`) VALUES
(1, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `quali` varchar(250) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `speci` varchar(250) NOT NULL,
  `avali` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `drugs`
--

CREATE TABLE `drugs` (
  `Id` int(11) NOT NULL,
  `DrugName` varchar(255) NOT NULL,
  `istock` varchar(255) NOT NULL,
  `Exdate1` varchar(255) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drugs`
--

INSERT INTO `drugs` (`Id`, `DrugName`, `istock`, `Exdate1`, `Total`) VALUES
(16, 'aspirine', '120', '08/12', 120);

-- --------------------------------------------------------

--
-- Table structure for table `inpacaserec`
--

CREATE TABLE `inpacaserec` (
  `Id` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `page` varchar(255) NOT NULL,
  `psex` varchar(255) NOT NULL,
  `poccu` varchar(255) NOT NULL,
  `popno` varchar(255) NOT NULL,
  `pdoa` varchar(255) NOT NULL,
  `pdod` varchar(255) NOT NULL,
  `pdia` varchar(255) NOT NULL,
  `pda` varchar(255) NOT NULL,
  `ppc` varchar(255) NOT NULL,
  `pph` varchar(255) NOT NULL,
  `ppe` varchar(255) NOT NULL,
  `pi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inpacaserec`
--

INSERT INTO `inpacaserec` (`Id`, `pname`, `page`, `psex`, `poccu`, `popno`, `pdoa`, `pdod`, `pdia`, `pda`, `ppc`, `pph`, `ppe`, `pi`) VALUES
(6, ' Rosha  Jadhav', '25', 'male', 'business', '1', '11/07/2022', 'NA', 'Heart rate\n Blood Pressure', 'Skin rash or hives\nItching', 'No', 'No', 'endoscopy', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `id` int(11) NOT NULL,
  `nurseid` varchar(250) NOT NULL,
  `name` varchar(250) NOT NULL,
  `quali` varchar(250) NOT NULL,
  `age` varchar(250) NOT NULL,
  `sal` varchar(250) NOT NULL,
  `dept` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`id`, `nurseid`, `name`, `quali`, `age`, `sal`, `dept`) VALUES
(7, '1', 'Zeenal Patel', 'Bsc Nursing', '-20', '30000', '5');

-- --------------------------------------------------------

--
-- Table structure for table `opregister`
--

CREATE TABLE `opregister` (
  `Id` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `page` varchar(255) NOT NULL,
  `popno` varchar(255) NOT NULL,
  `pdate` varchar(255) NOT NULL,
  `psex` varchar(255) NOT NULL,
  `poccu` varchar(255) NOT NULL,
  `pdiag` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `opregister`
--

INSERT INTO `opregister` (`Id`, `pname`, `page`, `popno`, `pdate`, `psex`, `poccu`, `pdiag`) VALUES
(3, 'Pritam Kumar', '30', '2', '25/08/2021', 'Male', 'Manager', ' endoscopy\n Cardiac\n Pulmonar');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Id` int(11) NOT NULL,
  `OPNO` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `DEP` varchar(255) NOT NULL,
  `AGE` varchar(255) NOT NULL,
  `SEX` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `FAMILY` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Id`, `OPNO`, `NAME`, `DEP`, `AGE`, `SEX`, `ADDRESS`, `FAMILY`) VALUES
(19, '1', 'Deepak Kumar', 'Cardiology', '25', 'Male', 'Pune', 'no'),
(20, '5', 'Siddharth Pawar', 'General Medicine', '30', 'Male', 'Kothrud', 'no'),
(21, '10', 'Ritesh Jadhav', 'Radiology Department ', '30', 'Male', 'Katraj', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `drugs`
--
ALTER TABLE `drugs`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `inpacaserec`
--
ALTER TABLE `inpacaserec`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `opregister`
--
ALTER TABLE `opregister`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `drugs`
--
ALTER TABLE `drugs`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `inpacaserec`
--
ALTER TABLE `inpacaserec`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `opregister`
--
ALTER TABLE `opregister`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
