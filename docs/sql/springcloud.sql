CREATE DATABASE /*!32312 IF NOT EXISTS*/`springcloud` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springcloud`;

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `dept` */

insert  into `dept`(`dname`,`db_source`) values ('开发部',DATABASE()),
('人事部',DATABASE()),
('财务部',DATABASE()),
('市场部',DATABASE()),
('运维部',DATABASE()),
('2019bigdata',DATABASE());
