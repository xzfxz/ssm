

CREATE TABLE `user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) DEFAULT NULL,
  `upasswd` varchar(20) DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT null,
  `logintime` datetime DEFAULT now(),
  PRIMARY KEY (`uid`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `article` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `uid` INT(10) NOT NULL ,
  `sort_id` INT(10) NOT NULL ,
  `keys` VARCHAR(120) DEFAULT NULL,
  `title` VARCHAR(200) NOT NULL ,
  `info` VARCHAR(200),
  `content`LONGTEXT DEFAULT NULL,
  `addtime` DATETIME DEFAULT  now(),
  `updatetime` DATETIME DEFAULT now(),
  `scancount` int DEFAULT 0,
  `ontop` int DEFAULT 0,
  `isdelete` int DEFAULT 0,
  `source` VARCHAR(200) DEFAULT NULL ,
  `item1` VARCHAR(200) DEFAULT  NULL ,
  `item2` VARCHAR(200) DEFAULT NULL ,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `post` (
  `pid` INT(10) NOT NULL AUTO_INCREMENT ,
  `psource` VARCHAR(120) DEFAULT NULL ,
  `pcontent` VARCHAR(200) DEFAULT NULL ,
  PRIMARY KEY (`pid`)
)ENGINE =innodb DEFAULT CHARACTER SET =utf8;

CREATE TABLE `sort` (
  `id` INT(10) NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(120) DEFAULT NULL ,
  `info` VARCHAR(200) DEFAULT NULL ,
  `item1` VARCHAR(200) DEFAULT NULL ,
  PRIMARY KEY (`id`)
)ENGINE =innodb DEFAULT CHARACTER SET =utf8;