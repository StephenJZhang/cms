package com.jeecms.mybatis.dao;

import org.springframework.stereotype.Repository;

import com.jeecms.mybatis.bo.UserBO;


@Repository
public interface TestMyBatisDao {
   
	UserBO getUserById(String id);
}
