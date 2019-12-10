-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 16 sep. 2019 à 14:20
-- Version du serveur :  5.7.19
-- Version de PHP :  7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `memoire`
--

-- --------------------------------------------------------

--
-- Structure de la table `abonne`
--

DROP TABLE IF EXISTS `abonne`;
CREATE TABLE IF NOT EXISTS `abonne` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `blocked` int(11) DEFAULT '0',
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `abonne`
--

INSERT INTO `abonne` (`idUser`, `blocked`) VALUES
(5, 0),
(3, 0),
(7, 0),
(6, 0),
(13, 0),
(15, 0),
(19, 0),
(20, 0),
(22, 0),
(23, 0),
(24, 0),
(25, 0);

-- --------------------------------------------------------

--
-- Structure de la table `abonnement`
--

DROP TABLE IF EXISTS `abonnement`;
CREATE TABLE IF NOT EXISTS `abonnement` (
  `idAbonne` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `etat` int(11) DEFAULT '0',
  PRIMARY KEY (`idAbonne`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `abonnement`
--

INSERT INTO `abonnement` (`idAbonne`, `nom`, `prenom`, `email`, `adresse`, `tel`, `etat`) VALUES
(1, 'Ndiaye', 'Farmata', 'farmata@gmail.com', 'Keur Massar', 773361041, 2),
(2, 'Ndiaye', 'Dior', 'dior@gmail.com', 'Parcellle', 339087645, 1),
(3, 'BA', 'Oumar', 'oumar@gmail.com', 'Mbour', 779849235, 1),
(4, 'Diouf', 'Ouleye', 'diouf@gmail.com', 'fouta', 332567812, 1),
(5, 'SY', 'SOPHIE', 'sy@gmail.com', 'Dakar', 770934651, 1),
(6, 'Diallo', 'babacar', 'gorgui@gmail.co', 'Rufisque', 764576123, 0),
(7, 'BA', 'Serigne mor', 'serignemor93@gmail.com', 'Keur Massar', 773123189, 1),
(8, 'Diallo', 'Demba', 'diallo@gmail.com', 'Rufisque', 773476512, 1),
(9, 'Web', 'Mor', 'mor@gmail.com', 'Thies', 763456789, 1);

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`idUser`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Structure de la table `batiment`
--

DROP TABLE IF EXISTS `batiment`;
CREATE TABLE IF NOT EXISTS `batiment` (
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL AUTO_INCREMENT,
  `nomBatiment` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idZone`,`idBatiment`),
  UNIQUE KEY `BATIMENT_PK` (`idZone`,`idBatiment`),
  KEY `LOCALISER_FK` (`idZone`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `batiment`
--

INSERT INTO `batiment` (`idZone`, `idBatiment`, `nomBatiment`) VALUES
(1, 1, 'BatA'),
(1, 2, 'BU');

-- --------------------------------------------------------

--
-- Structure de la table `consommation`
--

DROP TABLE IF EXISTS `consommation`;
CREATE TABLE IF NOT EXISTS `consommation` (
  `idConsommation` int(11) NOT NULL AUTO_INCREMENT,
  `idObjet` int(11) NOT NULL,
  `dateDebut` timestamp NULL DEFAULT NULL,
  `dateFin` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idConsommation`),
  UNIQUE KEY `CONSOMMATION_PK` (`idConsommation`),
  KEY `FAIRE_FK` (`idObjet`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `localisation`
--

DROP TABLE IF EXISTS `localisation`;
CREATE TABLE IF NOT EXISTS `localisation` (
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL,
  `idLocalisation` int(11) NOT NULL AUTO_INCREMENT,
  `typeLocalisation` varchar(254) DEFAULT NULL,
  `nomLocalisation` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idZone`,`idBatiment`,`idLocalisation`),
  UNIQUE KEY `LOCALISATION_PK` (`idZone`,`idBatiment`,`idLocalisation`),
  KEY `CONTENIR_FK` (`idZone`,`idBatiment`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `localisation`
--

INSERT INTO `localisation` (`idZone`, `idBatiment`, `idLocalisation`, `typeLocalisation`, `nomLocalisation`) VALUES
(0, 1, 1, 'Salle', 'Couloir1'),
(1, 1, 1, 'Couloir', 'Salle13'),
(1, 2, 1, 'salle', 'Salle18'),
(1, 2, 2, 'simple', 'Couloir2');

-- --------------------------------------------------------

--
-- Structure de la table `objet`
--

DROP TABLE IF EXISTS `objet`;
CREATE TABLE IF NOT EXISTS `objet` (
  `idObjet` int(11) NOT NULL AUTO_INCREMENT,
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL,
  `idLocalisation` int(11) NOT NULL,
  `idStation` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `nomObjet` varchar(254) DEFAULT NULL,
  `type` varchar(254) DEFAULT NULL,
  `voltage` float DEFAULT NULL,
  `connectivite` varchar(254) DEFAULT NULL,
  `etat` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idObjet`),
  UNIQUE KEY `OBJET_PK` (`idObjet`),
  KEY `COMMUNIQUER_FK` (`idStation`),
  KEY `EQUIPER_FK` (`idZone`,`idBatiment`,`idLocalisation`),
  KEY `AVOIR_FK` (`idUser`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reseau`
--

DROP TABLE IF EXISTS `reseau`;
CREATE TABLE IF NOT EXISTS `reseau` (
  `idReseau` int(11) NOT NULL AUTO_INCREMENT,
  `nomReseau` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idReseau`),
  UNIQUE KEY `RESEAU_PK` (`idReseau`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reseau`
--

INSERT INTO `reseau` (`idReseau`, `nomReseau`) VALUES
(1, 'Reseau1');

-- --------------------------------------------------------

--
-- Structure de la table `station`
--

DROP TABLE IF EXISTS `station`;
CREATE TABLE IF NOT EXISTS `station` (
  `idStation` int(11) NOT NULL AUTO_INCREMENT,
  `idReseau` int(11) NOT NULL,
  `nomStation` varchar(254) DEFAULT NULL,
  `typeStation` varchar(254) DEFAULT NULL,
  `connectiviteStation` varchar(254) DEFAULT NULL,
  `alerte` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idStation`),
  UNIQUE KEY `STATION_PK` (`idStation`),
  KEY `APPARTENIR_FK` (`idReseau`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `station`
--

INSERT INTO `station` (`idStation`, `idReseau`, `nomStation`, `typeStation`, `connectiviteStation`, `alerte`) VALUES
(1, 1, 'Rlet1', 'elect', 'adsdf', 'gdai7d');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  `login` varchar(254) DEFAULT NULL,
  `passe` varchar(254) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `profil` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) DEFAULT NULL,
  `tel` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `USER_PK` (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `nom`, `prenom`, `login`, `passe`, `email`, `profil`, `adresse`, `tel`) VALUES
(1, 'BA', 'Adja Batta', 'Admin', 'passer', 'adjabatta@gmail,com', 'administrateur', 'Dakar', '002213051891'),
(2, 'Diallo', 'Demba', 'Admin2', 'passer', 'gorgui@gmail.com', 'administrateur', 'thies', '771234523'),
(3, 'Sagna', 'Younouss', 'Abonne1', 'passer', 'sagna@gmail.com', 'abonne', 'Rufisque', '773081567'),
(14, 'BA', 'Oumar', '53661', '22131', 'oumar@gmail.com', 'abonne', 'Mbour', '779849235'),
(13, 'Ndiaye', 'Farmata', '21341', '22213', 'farmata@gmail.com', 'abonne', 'Keur Massar', '773361041'),
(15, 'Diouf', 'Ouleye', '38831', '02222', 'diouf@gmail.com', 'abonne', 'fouta', '332567812'),
(16, 'Ndiaye', 'Dior', '14304', '32202', 'dior@gmail.com', 'abonne', 'Parcellle', '339087645'),
(17, 'SY', 'SOPHIE', '88322', '31332', 'sy@gmail.com', 'abonne', 'Dakar', '770934651'),
(18, 'Ndiaye', 'Dior', '74053', '00313', 'dior@gmail.com', 'abonne', 'Parcellle', '339087645'),
(21, 'SY', 'SOPHIE', '20241', '22330', 'sy@gmail.com', 'abonne', 'Dakar', '770934651'),
(20, 'BA', 'Serigne mor', '81025', '02232', 'serignemor93@gmail.com', 'abonne', 'Keur Massar', '773123189'),
(22, 'BA', 'Oumar', '61842', '03110', 'oumar@gmail.com', 'abonne', 'Mbour', '779849235'),
(23, 'Diouf', 'Ouleye', '55276', '20330', 'diouf@gmail.com', 'abonne', 'fouta', '332567812'),
(24, 'Diallo', 'Demba', 'ahaacbgiai', 'ddfehbebbe', 'diallo@gmail.com', 'abonne', 'Rufisque', '773476512'),
(25, 'Web', 'Mor', 'fdfcdgfghi', 'fhigiefecg', 'mor@gmail.com', 'abonne', 'Thies', '763456789');

-- --------------------------------------------------------

--
-- Structure de la table `zone`
--

DROP TABLE IF EXISTS `zone`;
CREATE TABLE IF NOT EXISTS `zone` (
  `idZone` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idZone`),
  UNIQUE KEY `ZONE_PK` (`idZone`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `zone`
--

INSERT INTO `zone` (`idZone`, `nom`) VALUES
(1, 'Bambey'),
(2, 'Thies'),
(3, 'Touba'),
(4, 'Touba');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
