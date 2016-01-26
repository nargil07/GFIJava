-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 26 Janvier 2016 à 19:28
-- Version du serveur :  5.6.24
-- Version de PHP :  5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gfibdd`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE IF NOT EXISTS `adresse` (
  `id` int(11) NOT NULL,
  `adresse` varchar(250) NOT NULL,
  `codepostal` varchar(6) NOT NULL,
  `ville` varchar(250) NOT NULL,
  `pays` varchar(50) NOT NULL,
  `tel_mobile` varchar(14) NOT NULL,
  `tel_fixe` varchar(14) NOT NULL,
  `email` varchar(250) NOT NULL,
  `id_patient` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `adresse`
--

INSERT INTO `adresse` (`id`, `adresse`, `codepostal`, `ville`, `pays`, `tel_mobile`, `tel_fixe`, `email`, `id_patient`) VALUES
(1, '1000 route du village', '07110', 'Vinezac', 'France', '06 03 47 47 47', '04 75 65 85 45', 'antony.marchi@iut-valence.fr', 2);

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
  `num_dossier` int(11) DEFAULT NULL,
  `Type` int(11) NOT NULL,
  `dateExam` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `resultat` text NOT NULL,
  `idExam` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `examen`
--

INSERT INTO `examen` (`num_dossier`, `Type`, `dateExam`, `resultat`, `idExam`) VALUES
(2, 1, '2016-01-26 17:02:27', 'hanche nécrosé', 1),
(2, 2, '2016-01-26 17:02:27', 'Poignée félée', 2);

-- --------------------------------------------------------

--
-- Structure de la table `intervention`
--

CREATE TABLE IF NOT EXISTS `intervention` (
  `id` int(11) NOT NULL,
  `dateIntervention` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `coût` int(11) NOT NULL,
  `resultat` text NOT NULL,
  `description` text NOT NULL,
  `num_dossier` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `intervention`
--

INSERT INTO `intervention` (`id`, `dateIntervention`, `coût`, `resultat`, `description`, `num_dossier`) VALUES
(0, '2016-01-26 16:54:08', 10205, 'Réparation de la hanche ', 'HAnche nécrosé, remplacé par un bout de titan', 2),
(1, '2016-01-26 16:54:28', 100, 'Poignée reparé', 'Poignée cassé par coup de marteau,\r\nfacturation a nouveau par les medecin pour ensuite pour pouvoir tout remetre en place !', 2);

-- --------------------------------------------------------

--
-- Structure de la table `medecin`
--

CREATE TABLE IF NOT EXISTS `medecin` (
  `id_medecin` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `typeMedecin` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `medecin`
--

INSERT INTO `medecin` (`id_medecin`, `nom`, `prenom`, `typeMedecin`) VALUES
(1, 'Docteur', 'Docteur', 'Generaliste');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `num_dossier` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `dateNaissance` date NOT NULL,
  `sexe` int(11) NOT NULL COMMENT 'MASCULIN,     /**      *       */     FEMININ,     /**      *       */     AUTRE;',
  `num_sejour` varchar(50) NOT NULL,
  `secu` varchar(15) NOT NULL,
  `lieuDeNaissance` int(11) NOT NULL,
  `nationalite` varchar(50) NOT NULL,
  `dateDeces` datetime DEFAULT NULL,
  `situationFamiliale` int(11) NOT NULL COMMENT 'SEPARE,          DIVORCE,          MARIE,          CELIBATAIRE,          VEUF,          CONCUBIN,          PACS;',
  `id_medecin` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`num_dossier`, `nom`, `prenom`, `dateNaissance`, `sexe`, `num_sejour`, `secu`, `lieuDeNaissance`, `nationalite`, `dateDeces`, `situationFamiliale`, `id_medecin`) VALUES
(2, 'Marchi', 'antony', '1992-04-14', 0, '', '152354125785452', 99, 'francaise', NULL, 4, 1);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`id`), ADD KEY `id_patient` (`id_patient`), ADD KEY `id_patient_2` (`id_patient`);

--
-- Index pour la table `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`idExam`), ADD KEY `num_dossier` (`num_dossier`);

--
-- Index pour la table `intervention`
--
ALTER TABLE `intervention`
  ADD PRIMARY KEY (`id`), ADD KEY `num_dossier` (`num_dossier`);

--
-- Index pour la table `medecin`
--
ALTER TABLE `medecin`
  ADD PRIMARY KEY (`id_medecin`);

--
-- Index pour la table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`num_dossier`), ADD KEY `id_medecin` (`id_medecin`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `adresse`
--
ALTER TABLE `adresse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `medecin`
--
ALTER TABLE `medecin`
  MODIFY `id_medecin` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `patient`
--
ALTER TABLE `patient`
  MODIFY `num_dossier` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `adresse`
--
ALTER TABLE `adresse`
ADD CONSTRAINT `adresse_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`num_dossier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `examen`
--
ALTER TABLE `examen`
ADD CONSTRAINT `examen_ibfk_1` FOREIGN KEY (`num_dossier`) REFERENCES `patient` (`num_dossier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `intervention`
--
ALTER TABLE `intervention`
ADD CONSTRAINT `intervention_ibfk_1` FOREIGN KEY (`num_dossier`) REFERENCES `patient` (`num_dossier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `patient`
--
ALTER TABLE `patient`
ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`id_medecin`) REFERENCES `medecin` (`id_medecin`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
