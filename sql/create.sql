DROP DATABASE IF EXISTS `sports`;
CREATE DATABASE sports;
USE sports;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` char(10) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nick_name` varchar(20) DEFAULT NULL,
  `qq_num` varchar(12) DEFAULT NULL,
  `telephone_num` char(11) DEFAULT NULL,
  `college` char(30) DEFAULT NULL,
  `profile_pic` varchar(255) DEFAULT NULL,
  `ability` tinyint(3) unsigned DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  `control` char(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2016210395', '彭礼烨', '男', '117515', '彭礼烨', null, null, '通信与信息工程学院', null, '1', null, null);
INSERT INTO `user` VALUES ('2016213991', '彭博韬', '男', '240332', '彭博韬', null, null, '软件工程学院', null, '1', null, null);
INSERT INTO `user` VALUES ('2016214073', '涂文泰', '男', '128670', '涂文泰', null, null, '软件工程学院', null, '1', null, null);

-- ----------------------------
-- Table structure for activities
-- ----------------------------
DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities` (
  `activity_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `activity_name` varchar(255) DEFAULT NULL,
  `initiator` char(20) NOT NULL COMMENT '活动发起者',
  `content` text,
  `remarks` text COMMENT '备注',
  `init_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `start_time` varchar(255) DEFAULT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `people_needs` smallint(3) unsigned DEFAULT NULL,
  `people_have` smallint(3) unsigned DEFAULT '0',
  `activity_pic` varchar(255) DEFAULT NULL,
  `activity_or_race` char(10) DEFAULT NULL COMMENT '此项区分活动或者比赛',
  `click_num` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_activity
-- ----------------------------
DROP TABLE IF EXISTS `user_activity`;
CREATE TABLE `user_activity` (
  `serial_num` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` char(10) NOT NULL,
  `activity_id` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`serial_num`),
  KEY `user_id` (`user_id`),
  KEY `activity_id` (`activity_id`),
  CONSTRAINT `activity_id` FOREIGN KEY (`activity_id`) REFERENCES `activities` (`activity_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamics
-- ----------------------------
DROP TABLE IF EXISTS `dynamics`;
CREATE TABLE `dynamics` (
  `dynamic_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` char(10) NOT NULL,
  `init_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `words` text COMMENT '动态的文字内容',
  `dynamic_pic` varchar(255) DEFAULT NULL COMMENT '动态的图片',
  `like_num` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`dynamic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for abilities
-- ----------------------------
-- DROP TABLE IF EXISTS `abilities`;
-- CREATE TABLE `abilities` (
--   `user_id` char(10) NOT NULL,
--   `tennis` tinyint(3) unsigned NOT NULL,
--   `badminton` tinyint(3) unsigned NOT NULL,
--   `ping_pang` tinyint(3) unsigned NOT NULL,
--   `basketball` tinyint(3) unsigned NOT NULL,
--   `football` tinyint(3) unsigned NOT NULL,
--   `volleyball` tinyint(3) unsigned NOT NULL,
--   PRIMARY KEY (`user_id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for date
-- ----------------------------
-- DROP TABLE IF EXISTS `date`;
-- CREATE TABLE `date` (
--   `date_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
--   `date_sponsor` char(10) NOT NULL,
--   `sports` enum('tennis','badminton','pingpong','basketball','football','volleyball') NOT NULL,
--   `peole_needs` tinyint(3) DEFAULT '1',
--   `date_start` datetime NOT NULL,
--   `date_end` datetime DEFAULT NULL,
--   PRIMARY KEY (`date_id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamics_like
-- ----------------------------
-- DROP TABLE IF EXISTS `dynamics_like`;
-- CREATE TABLE `dynamics_like` (
--   `serial_num` int(10) unsigned NOT NULL AUTO_INCREMENT,
--   `dynamic_id` int(10) unsigned NOT NULL,
--   `user_id` char(10) NOT NULL,
--   `user_name` varchar(20) DEFAULT NULL,
--   `user_like` char(10) DEFAULT 'like',
--   `like_time` bigint(20) unsigned NOT NULL COMMENT '点赞时间',
--   PRIMARY KEY (`serial_num`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sportsgroup
-- ----------------------------
-- DROP TABLE IF EXISTS `sportsgroup`;
-- CREATE TABLE `sportsgroup` (
--   `group_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
--   `group_name` varchar(255) NOT NULL,
--   `sponsor_id` char(10) NOT NULL,
--   `group_pic` varchar(255) DEFAULT NULL,
--   `intro` text,
--   PRIMARY KEY (`group_id`),
--   KEY `id` (`sponsor_id`),
--   CONSTRAINT `id` FOREIGN KEY (`sponsor_id`) REFERENCES `user` (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_group
-- ----------------------------
-- DROP TABLE IF EXISTS `user_group`;
-- CREATE TABLE `user_group` (
--   `serial_num` int(10) unsigned NOT NULL AUTO_INCREMENT,
--   `user_id` char(10) NOT NULL,
--   `group_id` smallint(5) unsigned NOT NULL,
--   PRIMARY KEY (`serial_num`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
