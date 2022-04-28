/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 28/04/2022 14:46:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_detail`;
CREATE TABLE `t_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `good_id` int(11) NULL DEFAULT NULL,
  `order_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `good_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `good_count` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_detail
-- ----------------------------
INSERT INTO `t_detail` VALUES (1, 1, 'DD00001', '果汁', 3);
INSERT INTO `t_detail` VALUES (2, 2, 'DD00001', '瓜子', 34);
INSERT INTO `t_detail` VALUES (3, 3, 'DD00002', '签字笔', 4);
INSERT INTO `t_detail` VALUES (4, 4, 'DD00002', '土豆丝', 2);
INSERT INTO `t_detail` VALUES (5, 5, 'DD00001', '八宝粥', 55);
INSERT INTO `t_detail` VALUES (6, 6, 'DD00003', '矿泉水', 56);

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `order_time` datetime(0) NOT NULL,
  `pay_time` datetime(0) NOT NULL,
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, 'DD00001', '2022-04-07 18:12:19', '2022-04-28 18:12:22', '1号订单');
INSERT INTO `t_order` VALUES (2, 'DD00002', '2022-04-20 18:12:19', '2022-04-29 18:12:22', '2号订单');
INSERT INTO `t_order` VALUES (3, 'DD00004', '2022-04-28 14:05:56', '2022-04-28 14:05:59', '4号订单');

-- ----------------------------
-- Table structure for t_picture
-- ----------------------------
DROP TABLE IF EXISTS `t_picture`;
CREATE TABLE `t_picture`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `desc` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `size` int(10) NULL DEFAULT NULL,
  `order_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_picture
-- ----------------------------
INSERT INTO `t_picture` VALUES (1, '装箱图片', 3333, 'DD00001');
INSERT INTO `t_picture` VALUES (2, '市电电压', 4444, 'DD00001');
INSERT INTO `t_picture` VALUES (3, '零地电压', 44, 'DD00001');
INSERT INTO `t_picture` VALUES (4, '零地电压', 44, 'DD00002');
INSERT INTO `t_picture` VALUES (5, '市电电压', 4444, 'DD00002');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
