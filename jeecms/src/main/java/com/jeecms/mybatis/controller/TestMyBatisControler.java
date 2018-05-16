package com.jeecms.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeecms.mybatis.api.TestMyBatisService;
import com.jeecms.mybatis.bo.UserBO;
import com.jeecms.mybatis.service.TestMyBatisServiceImpl;

@RequestMapping("/data")
@RestController
public class TestMyBatisControler {
         
	@Autowired
	private TestMyBatisService  testMyBatisService;
	
	private static Logger log = LoggerFactory.getLogger(TestMyBatisControler.class);
	
	
	     @RequestMapping(value = "/first")
	     public String first () {
	    	 log.info("star");
	    	 UserBO bo = testMyBatisService.getUserById("1");
	    	 return bo.toString();
	     }
          	
	
}
