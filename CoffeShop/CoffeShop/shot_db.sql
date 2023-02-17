-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2020 at 11:06 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffe_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `billdetails`
--

CREATE TABLE `billdetails` (
  `DetID` int(11) NOT NULL,
  `ProudctsNo` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `billNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billdetails`
--

INSERT INTO `billdetails` (`DetID`, `ProudctsNo`, `quantity`, `billNo`) VALUES
(1, 3, 1, 5),
(2, 4, 1, 5),
(3, 6, 1, 6),
(4, 7, 2, 6),
(5, 9, 1, 7),
(6, 1, 1, 7),
(7, 10, 3, 7),
(8, 6, 1, 7),
(9, 7, 1, 7),
(10, 5, 1, 7),
(11, 8, 1, 8),
(12, 1, 2, 8),
(13, 3, 1, 8),
(14, 2, 2, 9),
(15, 3, 1, 9),
(16, 6, 1, 9),
(17, 2, 2, 10),
(18, 3, 1, 10),
(19, 8, 1, 10),
(20, 2, 2, 11),
(21, 3, 1, 11),
(22, 6, 2, 11),
(23, 1, 0, 11),
(24, 7, 0, 11),
(25, 10, 1, 12),
(26, 11, 1, 12),
(27, 5, 1, 12),
(28, 6, 2, 12),
(29, 2, 2, 13),
(30, 3, 1, 13),
(31, 8, 1, 13),
(32, 1, 1, 13),
(33, 4, 1, 13),
(34, 15, 1, 13),
(35, 3, 1, 14),
(36, 2, 2, 14),
(37, 1, 1, 14);

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `BiilNo` int(11) NOT NULL,
  `PurchaseDate` varchar(45) DEFAULT NULL,
  `Tax` int(11) DEFAULT NULL,
  `TotalPrice` int(11) DEFAULT NULL,
  `BranchNum` int(11) DEFAULT NULL,
  `CustID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`BiilNo`, `PurchaseDate`, `Tax`, `TotalPrice`, `BranchNum`, `CustID`) VALUES
(1, '2020-11-24', 0, 0, 1, 3),
(2, '2020-11-24', 30, 120, 1, 3),
(3, '2020-11-24', 40, 160, 3, 3),
(4, '2020-11-25', 35, 140, 2, 6),
(5, '2020-11-25', 0, 90, 2, 6),
(6, '2020-11-25', 45, 180, 1, 6),
(7, '2020-11-25', 101, 405, 1, 6),
(8, '2020-11-25', 43, 170, 3, 7),
(9, '2020-12-05', 50, 200, 1, 9),
(10, '2020-12-05', 55, 220, 1, 9),
(11, '2020-12-05', 70, 280, 1, 9),
(12, '2020-12-05', 68, 270, 1, 11),
(13, '2020-12-05', 96, 385, 1, 11),
(14, '2020-12-06', 0, 73, 1, 11);

-- --------------------------------------------------------

--
-- Table structure for table `branchs`
--

CREATE TABLE `branchs` (
  `BranchNo` int(11) NOT NULL,
  `City` varchar(45) DEFAULT NULL,
  `ContactNo` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branchs`
--

INSERT INTO `branchs` (`BranchNo`, `City`, `ContactNo`) VALUES
(1, 'Dammam', '009662332546'),
(2, 'Dhahran', '009664562546'),
(3, 'Riyadh', '00966456566');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `CustomerID` int(11) NOT NULL,
  `CustomerName` varchar(45) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `PhomeNo` varchar(15) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CustomerID`, `CustomerName`, `Gender`, `PhomeNo`, `City`) VALUES
(1, 'Dana', 'F', '0505553563', 'Dammam'),
(2, 'Majed', 'M', '0545552990', 'Dhahran'),
(3, 'Ahlam', 'F', '0509435778', 'Dammam'),
(4, 'Reem', 'F', '0599678222', 'Riyadh'),
(6, 'Rashed', 'M', '0509435555', 'Dhahran'),
(7, 'Ghadi', 'F', '0550120121', 'Riyadh'),
(8, 'Saud', 'M', '0561212321', 'Riyadh'),
(9, 'Nouf', 'F', '0593500091', 'Dammam'),
(10, 'Shahad', 'F', '545398765', 'Khobar'),
(11, 'Wafa', 'F', '530868863', 'Riyadh');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `EmployeeID` int(11) NOT NULL,
  `EmployeeName` varchar(45) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Salaray` int(11) DEFAULT NULL,
  `BranchNum` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`EmployeeID`, `EmployeeName`, `Gender`, `Email`, `City`, `Salaray`, `BranchNum`) VALUES
(1, 'Hamad', 'M', 'Hamad@gmail.com', 'Dammam', 3000, 1),
(2, 'Sara', 'F', 'Sara@gmail.com', 'Dhahran', 2000, 2),
(3, 'Farah', 'F', 'Farah@gmail.con', 'Riyadh', 1200, 3),
(4, 'Rama', 'F', 'rama@gmail.com', 'Riyadh', 2000, 3),
(6, 'Ali', 'M', 'Ali@gmail.com', 'Dhahran', 2300, 2),
(7, 'Talal', 'M', 'Talal@outlook.com', 'Dammam', 1200, 1);

-- --------------------------------------------------------

--
-- Table structure for table `log_in`
--

CREATE TABLE `log_in` (
  `UserID` int(11) NOT NULL,
  `CustomerID` int(11) NOT NULL,
  `UserName` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Position` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `log_in`
--

INSERT INTO `log_in` (`UserID`, `CustomerID`, `UserName`, `Password`, `Position`) VALUES
(1, 1, 'Dana', 'dana', 2),
(2, 8, 'Majed', 'majed', 2),
(3, 7, 'Ahlam', 'ahlam', 2),
(4, 6, 'Reem', 'reem', 2),
(5, 3, 'Rashed', 'rashed', 2),
(6, 9, 'Ghadi', 'ghadi', 2),
(7, 3, 'Farah', 'farah', 3),
(8, 2, 'Sara', 'sara', 3),
(9, 0, 'Hamad', 'hamad', 3),
(10, 4, 'Rama', 'rama', 3),
(11, 9, 'Nouf', 'nouf', 2),
(17, 10, 'Shahad', 'shahad', 2),
(18, 11, 'Wafa', 'wafa', 2),
(19, 6, 'Ali', 'ali', 3),
(20, 12, 'Rana', 'rana', 2),
(21, 13, 'Rana', 'rana', 2),
(22, 14, 'Rana', 'rana', 2),
(23, 7, 'Talal', 'talal', 3);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ProudctsNo` int(11) NOT NULL,
  `ProductName` varchar(100) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `className` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProudctsNo`, `ProductName`, `Price`, `className`) VALUES
(1, 'Amricano', 10, 'Drinks'),
(2, 'Caramel Cup Cake', 20, 'Cup Cake'),
(3, 'Carrot Cup Cake', 23, 'Cup Cake'),
(4, 'Dark Choclate Cup Cake ', 23, 'Cup Cake'),
(5, 'Pistacio Dount', 15, 'Donats'),
(6, 'Roseberry Cheese Cake', 22, 'Cheese Cake'),
(7, 'Apple Cheese Cake ', 22, 'Cheese Cake'),
(8, 'Double Choclate Dounats', 16, 'Donats'),
(9, 'Single Chocolate Donats ', 14, 'Donats'),
(10, 'Oraange juice', 19, 'Drinks'),
(11, 'Apple juice', 18, 'Drinks'),
(12, 'Latte', 18, 'Drinks'),
(13, 'Cold brew', 12, 'Drinks'),
(14, 'Hot Choclate', 16, 'Drinks'),
(15, 'Berrey Cup Cake', 25, 'Cup Cake'),
(16, 'Zatar Dounat', 12, 'Donats'),
(17, 'Flat White', 15, 'Drinks'),
(18, 'Cortado', 15, 'Drinks');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billdetails`
--
ALTER TABLE `billdetails`
  ADD PRIMARY KEY (`DetID`);

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`BiilNo`);

--
-- Indexes for table `branchs`
--
ALTER TABLE `branchs`
  ADD PRIMARY KEY (`BranchNo`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`EmployeeID`);

--
-- Indexes for table `log_in`
--
ALTER TABLE `log_in`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ProudctsNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billdetails`
--
ALTER TABLE `billdetails`
  MODIFY `DetID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `BiilNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `branchs`
--
ALTER TABLE `branchs`
  MODIFY `BranchNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `CustomerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `EmployeeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `log_in`
--
ALTER TABLE `log_in`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `ProudctsNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
