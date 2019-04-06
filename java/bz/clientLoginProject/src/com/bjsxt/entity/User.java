package com.bjsxt.entity;

import java.io.Serializable;

public class User implements Serializable {//用于封装用户名和密码，
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2618388865354437739L;
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
	}
	
}
