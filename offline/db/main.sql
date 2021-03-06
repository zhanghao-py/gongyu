CREATE TABLE `gy_order` (
  `id` bigint(20) unsigned NOT NULL,
  `money` decimal(10,2) NOT NULL COMMENT '充值金额',
  `status` tinyint(4) unsigned NOT NULL COMMENT '1:订单初始化 2:支付中 3:支付完成 4:取消',
  `pay_result` tinyint(4) unsigned NULL COMMENT '1:支付成功 2:支付失败 3:预授权成功 4:预授权失败 5:用户拒付',
  `pay_callback_type` tinyint(4) unsigned null comment '1:web, 2:back',
  `pay_callback_latest_time` datetime null comment '最后生效callback返回时间',
  `cams_result` tinyint(4) unsigned NULL COMMENT '1:充值成功 2:充值失败',
  `cams_call_times` tinyint(4) unsigned not null default 0 comment '调用cams充值次数',
  `cams_call_latest_time` datetime null comment '最后调用cams时间',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `pay_time` datetime NULL COMMENT '支付开始时间',
  `finish_time` datetime NULL COMMENT '完成时间',
  `account` varchar(100) NOT NULL COMMENT '缴费账号',
  `college_id` bigint(20) unsigned NOT NULL COMMENT '所属学校',
  PRIMARY KEY (`id`),
  KEY `idx_order_college_id` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '订单信息表';

-- alter table gy_order add column `pay_callback_type` tinyint(4) unsigned null comment '1:web, 2:back' after pay_result;
-- alter table gy_order add column `pay_callback_latest_time` datetime null comment '最后生效callback返回时间' after pay_callback_type;
-- alter table gy_order add column `cams_call_times` tinyint(4) unsigned not null default 0 comment '调用cams充值次数' after cams_result;
-- alter table gy_order add column `cams_call_latest_time` datetime null comment '最后调用cams时间' after cams_call_times;

CREATE TABLE `gy_college` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '学校名称',
  `url` varchar(100) NOT NULL COMMENT 'CAMS URL',
  `description` varchar(100) NOT NULL COMMENT '备注信息',
  `operator_username` varchar(100) NOT NULL COMMENT '操作员-用户名',
  `operator_password` varchar(100) NOT NULL COMMENT '操作员-密码',
  `keystore_path` varchar(100) NOT NULL COMMENT '证书路径',
  `merid` varchar(15) not null comment '商户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '高校信息表';

-- alter table gy_college add column merid varchar(15) not null comment '商户id';
-- update gy_college set merid='888000130000008';

INSERT INTO `gy_college` VALUES ('1', '北京大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'WVdSdGFXND0=', 'WVdSdGFXND0=', '/home/xxx/college1.ks', '888000130000008');
INSERT INTO `gy_college` VALUES ('2', '清华大学', 'http://123.120.10.78:88', '联系人：张浩、马计坤', 'WVdSdGFXND0=', 'WVdSdGFXND0=', '/home/xxx/college2.ks', '888000130000008');

CREATE TABLE `gy_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) unsigned NULL COMMENT '订单id',
  `type` tinyint(4) unsigned NOT NULL COMMENT '1:CmpayRequest 2:CmpayCallbackRequest 3:CmpayCallbackWebRequest 10:CAMS充值日志 20:本地日志',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `content` longtext NOT NULL COMMENT '日志内容',
  PRIMARY KEY (`id`),
  KEY `idx_log_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '日志信息表';

CREATE TABLE `gy_cmpay_billing_header` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `mer_id` varchar(100) NOT NULL COMMENT '商户ID 15位',
  `province_id` varchar(100) NOT NULL COMMENT '省平台编号 8位',
  `deal_times` varchar(100) NOT NULL COMMENT '交易笔数 8位',
  `deal_amount` varchar(100) NOT NULL COMMENT '交易总金额 15位 单位：分',
  `date` varchar(100) NOT NULL COMMENT '账务日期 YYYYMMDD',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'cmpay账单头信息表';

CREATE TABLE `gy_cmpay_billing_detail` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `mer_id` varchar(100) NOT NULL COMMENT '商户ID 15位',
  `product_id` varchar(100) NOT NULL COMMENT '产品编号 最长30位',
  `order_id` varchar(100) NOT NULL COMMENT '商户订单号 20位',
  `order_date` varchar(100) NOT NULL COMMENT '订单日期 8位',
  `pay_date` varchar(100) NOT NULL COMMENT '支付日期 8位',
  `amount` varchar(100) NOT NULL COMMENT '金额 15位 单位：分',
  `type` varchar(100) NOT NULL COMMENT '付款类型 1位',
  `status` varchar(100) NOT NULL COMMENT '订单状态 1位',
  `header_id` bigint(20) unsigned NOT NULL COMMENT '关联headerId',
  PRIMARY KEY (`id`),
  KEY `idx_cmpay_billing_detail_header_id` (`header_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'cmpay账单详细信息表';