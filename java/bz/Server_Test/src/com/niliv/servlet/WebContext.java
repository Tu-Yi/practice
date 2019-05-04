package com.niliv.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WebContext {
	
	private List<Servlet> servlets = null;
	private List<Mapping> mappings = null;
	
	//name--->class
	private Map<String, String> entityMap = new HashMap<String, String>();
	//pattern--->name
	private Map<String, String> mappingMap = new HashMap<String, String>();
	
	public WebContext(List<Servlet> servlets, List<Mapping> mappings) {
		super();
		this.servlets = servlets;
		this.mappings = mappings;
		
		for (Servlet entity : servlets) {
			entityMap.put(entity.getName(), entity.getClazz());
		}
		
		for (Mapping mapping : mappings) {
			for (String pattern : mapping.getPatterns()) {
				mappingMap.put(pattern, mapping.getName());
			}
		}
	}
	
	public String getClazz(String pattern) {
		return entityMap.get(mappingMap.get(pattern));
	}
	
	
}
