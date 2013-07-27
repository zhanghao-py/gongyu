CREATE TABLE `gy_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `money` decimal NOT NULL COMMENT '��ɫ����',
  `status` tinyint(4) NOT NULL COMMENT '1:������ʼ�� 2:֧���� 3:֧�����',
  `pay_result` tinyint(4) NOT NULL COMMENT '1:֧���ɹ� 2:֧��ʧ��',
  `cams_result` tinyint(4) NOT NULL COMMENT '1:��ֵ�ɹ� 2:��ֵʧ��',
  `create_time` datetime NOT NULL COMMENT '����ʱ��',
  `account` varchar(100) NOT NULL COMMENT '�ɷ��˺�',
  `college_id` bigint(20) unsigned NOT NULL COMMENT '����ѧУ',
  PRIMARY KEY (`id`),
  KEY `order_index_college_id` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `gy_college` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT 'ѧУ����',
  `url` varchar(100) NOT NULL COMMENT 'CAMS URL',
  `description` varchar(100) NOT NULL COMMENT '��ע��Ϣ',
  `operator_username` varchar(100) NOT NULL COMMENT '����Ա-�û���',
  `operator_password` varchar(100) NOT NULL COMMENT '����Ա-����',
  `keystore_path` varchar(100) NOT NULL COMMENT '֤��·��',
  PRIMARY KEY (`id`),
  KEY `college_index_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;