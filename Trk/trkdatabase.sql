

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";



CREATE TABLE `resource` (
  `EquipmentID` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `EquipmentName` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Total_Quantity` int(7) UNSIGNED NOT NULL,
  `Remaining_Quantity` int(7) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



CREATE TABLE `schedule` (
  `EventID` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `Location` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Date` varchar(10) NOT NULL,
  `Start_Time` time NOT NULL,
  `End_Time` time NOT NULL,
  `EquipmentID` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `Quantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



CREATE TABLE `users` (
  `First_Name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `Last_Name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `Username` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Password` varchar(128) COLLATE utf8mb4_bin NOT NULL,
  `Salt` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Position` varchar(10) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


INSERT INTO `users` (`First_Name`, `Last_Name`, `Username`, `Password`, `Salt`, `Position`) VALUES
('Rodje', 'Ross', 'djeross', '2121daa53d0cba23b85d48b3d0556ceb36ad8488da7e3d0def7020b2e62610e461863629784cb2a472c155c1a45aad1dbc9cdf79991aa1f5eaad4c888f0187ae', '9f397a84d30b4f48b8b447d120ff94d443f17e19', 'developer'),
('Maria', 'Mckenzie', 'marmck', 'e5b62c7fef1a865b62b4d75271c428017805c0810f585605ab850e1c178b751cac1bb847323fb1047fe353ede0bd114dad3705f98bea8ab1d4e1702ef5c67d5f', '6eeb00ff819c800f389e07b7fe4f80fdbb3117f6', 'developer');


ALTER TABLE `resource`
  ADD PRIMARY KEY (`EquipmentID`);


ALTER TABLE `schedule`
  ADD PRIMARY KEY (`EventID`);


ALTER TABLE `users`
  ADD PRIMARY KEY (`Username`);
COMMIT;

