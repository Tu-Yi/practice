package com.niliv.server;

/**
 * Servlet实体类
 * @author yuankun
 * @Date 2019-05-08 13:10:08
 * @Description 
 *
 */
public class Entity {
	
	//servlet-name
	private String name;
	//servlet-class
	private String clz;
	public Entity() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClz() {
		return clz;
	}
	public void setClz(String clz) {
		this.clz = clz;
	}
	
	
}
