package com.niliv.server;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 序列化编号
	 */
	private static final long serialVersionUID = 8739344474998764243L;
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
	}
}
