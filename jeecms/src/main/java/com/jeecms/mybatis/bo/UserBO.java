package com.jeecms.mybatis.bo;

import java.io.Serializable;

public class UserBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String userId;
	
	private String userName;
	
	private String groupId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "UserBo [userId=" + userId + ", userName=" + userName + ", groupId=" + groupId + "]";
	}
	
}
