package com.jeecms.mybatis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeecms.mybatis.api.TestMyBatisService;
import com.jeecms.mybatis.bo.UserBO;
import com.jeecms.mybatis.dao.TestMyBatisDao;


@Service
public class TestMyBatisServiceImpl implements TestMyBatisService {

	@Autowired
    private TestMyBatisDao dao;	
    
	private static Logger log = LoggerFactory.getLogger(TestMyBatisServiceImpl.class);
	
	@Override
	public UserBO getUserById(String id) {
		log.info("获取实现");
		UserBO bo = dao.getUserById(id);
		return bo;
	}

}
