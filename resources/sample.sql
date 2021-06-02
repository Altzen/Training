-- MySQL Script generated by MySQL Workbench
-- Fri May 28 03:25:16 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sample
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sample
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sample` DEFAULT CHARACTER SET utf8 ;
USE `sample` ;

-- -----------------------------------------------------
-- Table `sample`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sample`.`department` (
  `dept_no` INT NOT NULL,
  `dept_name` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  PRIMARY KEY (`dept_no`),
  UNIQUE INDEX `dept_no_UNIQUE` (`dept_no` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sample`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sample`.`employee` (
  `emp_no` INT NOT NULL,
  `emp_Fname` VARCHAR(45) NULL,
  `emp_Lname` VARCHAR(45) NULL,
  `dept_no` INT NULL,
  PRIMARY KEY (`emp_no`),
  INDEX `dept_no_idx` (`dept_no` ASC) VISIBLE,
  CONSTRAINT `dept_no`
    FOREIGN KEY (`dept_no`)
    REFERENCES `sample`.`department` (`dept_no`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sample`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sample`.`project` (
  `project_no` INT NOT NULL,
  `project_name` VARCHAR(45) NULL,
  `bunget` INT NULL,
  PRIMARY KEY (`project_no`),
  UNIQUE INDEX `project_no_UNIQUE` (`project_no` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sample`.`works_on`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sample`.`works_on` (
  `emp_no` INT NULL,
  `project_no` INT NULL,
  `job` VARCHAR(45) NULL,
  `enter_date` DATETIME NULL,
  INDEX `emp_no_idx` (`emp_no` ASC) VISIBLE,
  INDEX `project_no_idx` (`project_no` ASC) VISIBLE,
  CONSTRAINT `emp_no`
    FOREIGN KEY (`emp_no`)
    REFERENCES `sample`.`employee` (`emp_no`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `project_no`
    FOREIGN KEY (`project_no`)
    REFERENCES `sample`.`project` (`project_no`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `sample`.`department`
-- -----------------------------------------------------
START TRANSACTION;
USE `sample`;
INSERT INTO `sample`.`department` (`dept_no`, `dept_name`, `location`) VALUES (d1, 'research', 'Dallas');
INSERT INTO `sample`.`department` (`dept_no`, `dept_name`, `location`) VALUES (d2, 'accounting', 'Seattle');
INSERT INTO `sample`.`department` (`dept_no`, `dept_name`, `location`) VALUES (d3, 'marketing', 'Dallas');

COMMIT;


-- -----------------------------------------------------
-- Data for table `sample`.`employee`
-- -----------------------------------------------------
START TRANSACTION;
USE `sample`;
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (25348, 'Matthew', 'Smith', d3);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (10102, 'Ann', 'Jones', d3);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (18316, 'John', 'Barrimore', d1);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (29346, 'James', 'James', d2);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (9031, 'Elsa', 'Bertoni', d2);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (2581, 'Elke', 'Hansel', d2);
INSERT INTO `sample`.`employee` (`emp_no`, `emp_Fname`, `emp_Lname`, `dept_no`) VALUES (28559, 'Sybill', 'Moser', d1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `sample`.`project`
-- -----------------------------------------------------
START TRANSACTION;
USE `sample`;
INSERT INTO `sample`.`project` (`project_no`, `project_name`, `bunget`) VALUES (p1, 'Apollo', 120000);
INSERT INTO `sample`.`project` (`project_no`, `project_name`, `bunget`) VALUES (p2, 'Gemini', 95000);
INSERT INTO `sample`.`project` (`project_no`, `project_name`, `bunget`) VALUES (p3, 'Mercury', 186500);

COMMIT;


-- -----------------------------------------------------
-- Data for table `sample`.`works_on`
-- -----------------------------------------------------
START TRANSACTION;
USE `sample`;
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (10102, p1, 'analyst', '2006-10-01');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (10102, p3, 'manager', '2008-01-01');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (25348, p2, 'clerk', '2007-02-15');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (18316, p2, 'NULL', '2007-06-01');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (29346, p2, 'NULL', '2006-12-15');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (2581, p3, 'analyst', '2007-10-15');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (9031, p1, 'menager', '2007-04-15');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (28559, p1, 'NULL', '2007-08-01');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (28559, p2, 'clerk', '2008-02-01');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (9031, p3, 'clerk', '2006-11-15');
INSERT INTO `sample`.`works_on` (`emp_no`, `project_no`, `job`, `enter_date`) VALUES (29346, p1, 'clerk', '2007-01-14');

COMMIT;

