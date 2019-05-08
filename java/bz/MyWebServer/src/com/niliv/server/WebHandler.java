package com.niliv.server;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * 解析xml
 * @author yuankun
 * @Date 2019-05-08 13:21:29
 * @Description 
 *
 */
public class WebHandler extends DefaultHandler{
	//servlets
	private List<Entity> entitys  = new ArrayList<Entity>();
	//mappings
	private List<Mapping> mappings = new ArrayList<Mapping>();
	//servlet实体
	private Entity entity ;
	//mapping实体
	private Mapping mapping ;
	private String tag; //存储操作标签
	private boolean isMapping = false;
	
	/**
	 * 开始解析节点
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(null!=qName) {
			tag = qName; //存储标签名
			if(tag.equals("servlet")) {
				entity = new Entity();
				isMapping = false;
			}else if(tag.equals("servlet-mapping")) {
				mapping = new Mapping();
				isMapping = true;
			}
		}
	}
	/**
	 * 解析内容
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
		if(null!=tag) { //处理了空
			if(isMapping) { //操作servlet-mapping
				if(tag.equals("servlet-name")) {
					mapping.setName(contents);
				}else if(tag.equals("url-pattern")) {
					mapping.addPattern(contents);
				}
			}else { //操作servlet
				if(tag.equals("servlet-name")) {
					entity.setName(contents);
				}else if(tag.equals("servlet-class")) {
					entity.setClz(contents);
				}
			}			
		}
	}
	/**
	 * 结束解析节点
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(null!=qName) { 
			if(qName.equals("servlet")) {
				entitys.add(entity);
			}else if(qName.equals("servlet-mapping")) {
				mappings.add(mapping);
			}
		}
		tag = null; //tag丢弃了
	}
	/**
	 * 获取servlet实体
	 * @return
	 */
	public List<Entity> getEntitys() {
		return entitys;
	}
	/**
	 * 获取mapping实体
	 * @return
	 */
	public List<Mapping> getMappings() {
		return mappings;
	}	
	
}