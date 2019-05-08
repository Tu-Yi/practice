package com.niliv.server;

import java.util.HashSet;
import java.util.Set;
/**
 * mapping实体类
 * @author yuankun
 * @Date 2019-05-08 13:11:09
 * @Description 
 *
 */
public class Mapping {
	//servlet-name
	private String name;
	//url
	private Set<String> patterns ;
	public Mapping() {
		patterns = new HashSet<String>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPatterns() {
		return patterns;
	}
	public void setPatterns(Set<String> patterns) {
		this.patterns = patterns;
	}
	public void addPattern(String pattern) {
		this.patterns.add(pattern);
	}
}
