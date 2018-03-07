# 新建数据库
CREATE DATABASE nss;

# 新建用户表
CREATE TABLE user (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  name VARCHAR(60) NOT NULL COMMENT '用户名',
  password VARCHAR(32) NOT NULL COMMENT '用户密码',
  sex TINYINT NOT NULL DEFAULT 1 COMMENT '用户性别 0:女 1:男 2:其他',
  mobile_phone VARCHAR(11) NOT NULL DEFAULT '00000000000' COMMENT '手机号',
  is_management TINYINT NOT NULL DEFAULT 0 COMMENT '是否管理员 0：否 1：是 2：超级管理员',
  company_id BIGINT NOT NULL COMMENT '公司ID',
  company_short_name VARCHAR(120) NOT NULL COMMENT '公司简称',
  remark VARCHAR(255) NOT NULL DEFAULT '...' COMMENT '备注',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  modify_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  delete_flag tinyint NOT NULL DEFAULT 0 COMMENT '是否删除 0：否 1：是',
  PRIMARY KEY (id),
  UNIQUE KEY idx_name_mobile_phone (name, mobile_phone)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '用户表';

INSERT IGNORE INTO user(name, password, sex, is_management, company_id, company_short_name) VALUES
  ('administrator', '1115a25c522d81c40ff0fe4a569ab09c', 2, 2, 0, 'administrator'),
  ('天津市大通源洲商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 1, '大通源洲'),
  ('天津市澳顺峰烟酒经销有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 2, '澳顺峰'),
  ('天津市华溢睿智酒类销售有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 3, '华溢睿智'),
  ('天津鹏宇九缘商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 4, '鹏宇九缘'),
  ('天津国酒茅台有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 5, '天津自营店'),
  ('天津市星洲永耀商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 6, '星洲永耀'),
  ('天津南山堂商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 7, '南山堂'),
  ('天津市红桥区运盛开泰酒业经营部', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 8, '运盛开泰'),
  ('天津海津皇冠贸易有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 9, '海津皇冠'),
  ('天津市大荣丰商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 10, '大荣丰'),
  ('天津中糖华丰实业有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 11, '中糖华丰'),
  ('天津市裕隆达商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 12, '裕隆达'),
  ('天津市黔源锐发酒业有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 13, '黔源锐发'),
  ('天津市滨海新区金色年华酒行', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 14, '金色年华'),
  ('天津市海菊酒业有限责任公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 15, '海菊'),
  ('天津金鼎丰商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 16, '金鼎丰'),
  ('天津市悦淼商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 17, '悦淼'),
  ('天津市朗真商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 18, '朗真'),
  ('天津德飞皓龙商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 19, '德飞皓龙'),
  ('天津开发区黔泰商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 20, '黔泰'),
  ('天津醉天下商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 21, '醉天下'),
  ('天津市大天津商贸有限责任公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 22, '大天津'),
  ('天津市阿尔可贸易有限责任公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 23, '阿尔可'),
  ('天津市黔首冠源商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 24, '黔首冠源'),
  ('天津威淳商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 25, '威淳'),
  ('天津品高商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 26, '品高'),
  ('天津德道发商贸有限公司', '1115a25c522d81c40ff0fe4a569ab09c', 2, 1, 27, '德道发');

# 新建公司表
CREATE TABLE company (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  name VARCHAR(60) NOT NULL COMMENT '公司名',
  short_name VARCHAR(30) NOT NULL COMMENT '公司简称',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  delete_flag TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除 0：否 1：是',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '公司表';

# 初始化公司表数据
INSERT INTO company(name, short_name) VALUES
  ('天津市大通源洲商贸有限公司','大通源洲'),('天津市澳顺峰烟酒经销有限公司','澳顺峰'),
  ('天津市华溢睿智酒类销售有限公司','华溢睿智'),('天津鹏宇九缘商贸有限公司','鹏宇九缘'),
  ('天津国酒茅台有限公司','天津自营店'),('天津市星洲永耀商贸有限公司','星洲永耀'),
  ('天津南山堂商贸有限公司','南山堂'),('天津市红桥区运盛开泰酒业经营部','运盛开泰'),
  ('天津海津皇冠贸易有限公司','海津皇冠'),('天津市大荣丰商贸有限公司','大荣丰'),
  ('天津中糖华丰实业有限公司','中糖华丰'),('天津市裕隆达商贸有限公司','裕隆达'),
  ('天津市黔源锐发酒业有限公司','黔源锐发'),('天津市滨海新区金色年华酒行','金色年华'),
  ('天津市海菊酒业有限责任公司','海菊'),('天津金鼎丰商贸有限公司','金鼎丰'),
  ('天津市悦淼商贸有限公司','悦淼'),('天津市朗真商贸有限公司','朗真'),
  ('天津德飞皓龙商贸有限公司','德飞皓龙'),('天津开发区黔泰商贸有限公司','黔泰'),
  ('天津醉天下商贸有限公司','醉天下'),('天津市大天津商贸有限责任公司','大天津'),
  ('天津市阿尔可贸易有限责任公司','阿尔可'),('天津市黔首冠源商贸有限公司','黔首冠源'),
  ('天津威淳商贸有限公司','威淳'),('天津品高商贸有限公司','品高'),
  ('天津德道发商贸有限公司','德道发');

# 新建消费记录表
CREATE TABLE sale_record (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '消费记录ID',
  customer VARCHAR(60) NOT NULL COMMENT '客户名称',
  id_card VARCHAR(18) NOT NULL COMMENT '客户身份证',
  mobile_phone VARCHAR(11) NOT NULL DEFAULT '00000000000' COMMENT '手机号',
  company_id BIGINT NOT NULL COMMENT '公司ID',
  company_short_name VARCHAR(120) NOT NULL COMMENT '公司简称',
  activity_id BIGINT NOT NULL COMMENT '活动ID',
  remark VARCHAR(255) NOT NULL DEFAULT '...' COMMENT '备注',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  modify_id BIGINT NOT NULL DEFAULT 0 COMMENT '修改人ID',
  modify_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  delete_flag TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除 0：否 1：是',
  PRIMARY KEY (id),
  UNIQUE KEY idx_id_card (id_card)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '消费记录表';

# 活动表
CREATE TABLE activity (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '活动ID',
  name VARCHAR(60) NOT NULL COMMENT '活动名',
  start_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始时间',
  end_time TIMESTAMP NOT NULL COMMENT '结束时间',
  remark VARCHAR(255) NOT NULL DEFAULT '...' COMMENT '备注',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  modify_id BIGINT NOT NULL DEFAULT 0 COMMENT '修改人ID',
  modify_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  delete_flag TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除 0：否 1：是',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '活动表';