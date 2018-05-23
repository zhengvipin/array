/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.18 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `emp` */

CREATE TABLE `emp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`id`,`username`,`password`,`state`) values (1,'jack','jack',1);
insert  into `emp`(`id`,`username`,`password`,`state`) values (2,'tom','tom',1);
insert  into `emp`(`id`,`username`,`password`,`state`) values (3,'jane','jane',1);
insert  into `emp`(`id`,`username`,`password`,`state`) values (4,'jerry','jerry',1);
insert  into `emp`(`id`,`username`,`password`,`state`) values (5,'smith','smith',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
