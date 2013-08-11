CREATE TABLE `gy_order` (
  `id` bigint(20) unsigned NOT NULL,
  `money` decimal NOT NULL COMMENT '角色名称',
  `status` tinyint(4) unsigned NOT NULL COMMENT '1:订单初始化 2:支付中 3:支付完成 4:取消',
  `pay_result` tinyint(4) unsigned NULL COMMENT '1:支付成功 2:支付失败 3:预授权成功 4:预授权失败 5:用户拒付',
  `cams_result` tinyint(4) unsigned NULL COMMENT '1:充值成功 2:充值失败',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `pay_time` datetime NULL COMMENT '支付开始时间',
  `finish_time` datetime NULL COMMENT '完成时间',
  `account` varchar(100) NOT NULL COMMENT '缴费账号',
  `college_id` bigint(20) unsigned NOT NULL COMMENT '所属学校',
  PRIMARY KEY (`id`),
  KEY `idx_order_college_id` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '订单信息表';

CREATE TABLE `gy_college` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '学校名称',
  `url` varchar(100) NOT NULL COMMENT 'CAMS URL',
  `description` varchar(100) NOT NULL COMMENT '备注信息',
  `operator_username` varchar(100) NOT NULL COMMENT '操作员-用户名',
  `operator_password` varchar(100) NOT NULL COMMENT '操作员-密码',
  `keystore_path` varchar(100) NOT NULL COMMENT '证书路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '高校信息表';

INSERT INTO `gy_college` VALUES ('1', '北京大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'admin', 'WVdSdGFXND0=', '/home/xxx/college1.ks');
INSERT INTO `gy_college` VALUES ('2', '清华大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'admin', 'WVdSdGFXND0=', '/home/xxx/college2.ks');

CREATE TABLE `gy_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) unsigned NULL COMMENT '订单id',
  `type` tinyint(4) unsigned NOT NULL COMMENT '1:CmpayRequest 2:CmpayCallbackRequest 3:CmpayCallbackWebRequest 10:CAMS充值日志 20:本地日志',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `content` longtext NOT NULL COMMENT '日志内容',
  PRIMARY KEY (`id`),
  KEY `idx_log_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '日志信息表';