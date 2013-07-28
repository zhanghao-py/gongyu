CREATE TABLE `gy_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `money` decimal NOT NULL COMMENT '角色名称',
  `status` tinyint(4) NOT NULL COMMENT '1:订单初始化 2:支付中 3:支付完成',
  `pay_result` tinyint(4) NULL COMMENT '1:支付成功 2:支付失败',
  `cams_result` tinyint(4) NULL COMMENT '1:充值成功 2:充值失败',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `account` varchar(100) NOT NULL COMMENT '缴费账号',
  `college_id` bigint(20) unsigned NOT NULL COMMENT '所属学校',
  PRIMARY KEY (`id`),
  KEY `order_index_college_id` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `gy_college` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '学校名称',
  `url` varchar(100) NOT NULL COMMENT 'CAMS URL',
  `description` varchar(100) NOT NULL COMMENT '备注信息',
  `operator_username` varchar(100) NOT NULL COMMENT '操作员-用户名',
  `operator_password` varchar(100) NOT NULL COMMENT '操作员-密码',
  `keystore_path` varchar(100) NOT NULL COMMENT '证书路径',
  PRIMARY KEY (`id`),
  KEY `college_index_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `gy_college` VALUES ('1', '北京大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'admin', 'admin', '/home/xxx');
INSERT INTO `gy_college` VALUES ('2', '清华大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'admin', 'admin', '/home/xxx/ddd');