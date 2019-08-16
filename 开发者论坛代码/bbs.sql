/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 5.5.56 : Database - bbs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bbs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bbs`;

/*Table structure for table `bbs_detail` */

DROP TABLE IF EXISTS `bbs_detail`;

CREATE TABLE `bbs_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sortId` int(11) NOT NULL COMMENT '分类表id',
  `title` varchar(200) NOT NULL,
  `detail` varchar(1000) NOT NULL COMMENT '详细内容',
  `author` varchar(20) NOT NULL,
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `replyCount` int(11) NOT NULL DEFAULT '0' COMMENT '回复次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `bbs_detail` */

insert  into `bbs_detail`(`id`,`sortId`,`title`,`detail`,`author`,`createDate`,`replyCount`) values 
(1,1,'java基础知识','变量，运算服，表达式，集合等','tom','2019-06-23 16:22:35',0),
(2,1,'javaweb知识有哪些','html,CSS,javascript等','jack','2019-06-23 16:23:28',0),
(3,1,'Java都有哪些框架','spring,springmvc,mybatis等','lucy','2019-06-23 16:24:32',0),
(4,2,'大数据怎么样','大数据挺好的','king','2019-06-25 16:09:56',0),
(5,4,'机器人','mm','机器人是个好东西','2019-06-26 11:04:31',0),
(6,3,'C++怎么学','用脑子学','风情','2019-06-26 11:20:39',0),
(7,1,'java666','6什么6','mm','2019-06-26 11:22:40',0),
(8,1,'java是什么','编程语言','mm','2019-06-26 11:24:59',0),
(9,2,'我要学大数据','学什么','小明','2019-06-26 11:27:27',0),
(10,2,'大数据666','大数据内容','小红','2019-06-26 11:30:10',0),
(11,1,'java777','javahello','风情','2019-06-26 11:39:06',0);

/*Table structure for table `bbs_sort` */

DROP TABLE IF EXISTS `bbs_sort`;

CREATE TABLE `bbs_sort` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `bbs_sort` */

insert  into `bbs_sort`(`id`,`name`) values 
(1,'java'),
(2,'大数据'),
(3,'C++'),
(4,'人工智能');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
