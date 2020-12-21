-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2020 at 06:03 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommerce_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_ID` int(11) NOT NULL,
  `Admin_Username` varchar(30) DEFAULT NULL,
  `Admin_Email` varchar(30) DEFAULT NULL,
  `Admin_Password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Admin_ID`, `Admin_Username`, `Admin_Email`, `Admin_Password`) VALUES
(1, 'Mahfuj373', 'mahfuj@gmail.com', 'papalup'),
(2, 'Dhrubo945', 'dhrubo@gmail.com', 'cg4amidhrubo'),
(3, 'progga294', 'progga@gmail.com', 'ami_arek_cg4'),
(4, 'pranto745', 'pranto@gmail.com', 'amio_cg4');

-- --------------------------------------------------------

--
-- Table structure for table `buyer`
--

CREATE TABLE `buyer` (
  `Buyer_ID` int(11) NOT NULL,
  `Buyer_Name` varchar(30) DEFAULT NULL,
  `Buyer_Gender` varchar(8) DEFAULT NULL,
  `Buyer_Email` varchar(100) DEFAULT NULL,
  `Buyer_Phone` varchar(15) DEFAULT NULL,
  `Buyer_Address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buyer`
--

INSERT INTO `buyer` (`Buyer_ID`, `Buyer_Name`, `Buyer_Gender`, `Buyer_Email`, `Buyer_Phone`, `Buyer_Address`) VALUES
(1, 'Shakib-Uz-Zaman Khan Chowdhury', 'Male', 'shakibuzzaman3104@gmail.com', '+8801644400252', '60 Feet Road Mirpur Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Product_ID` int(11) NOT NULL,
  `Product_Name` varchar(50) DEFAULT NULL,
  `Product_Price` int(11) DEFAULT NULL,
  `Product_Category` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Product_ID`, `Product_Name`, `Product_Price`, `Product_Category`) VALUES
(1, ' Mango', 10, 'Fruits'),
(2, 'JackFruit', 200, 'Fruit'),
(4, 'Banana', 8, 'Fruit'),
(5, 'DCL laptop', 35000, 'Electronics'),
(6, 'T-shirt', 250, 'Men fashion'),
(7, 'Lunggi', 550, 'Men fashion'),
(8, 'Gown', 3000, 'Women Fashion'),
(9, 'Bell Sleeves', 1000, 'Women Fashion'),
(10, 'Scruf', 400, 'Women Fashion');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_ID`);

--
-- Indexes for table `buyer`
--
ALTER TABLE `buyer`
  ADD PRIMARY KEY (`Buyer_ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Product_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `Admin_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `buyer`
--
ALTER TABLE `buyer`
  MODIFY `Buyer_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Product_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
