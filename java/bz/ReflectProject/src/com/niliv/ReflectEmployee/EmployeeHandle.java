package com.niliv.ReflectEmployee;

import java.io.Console;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 遍历XML节点，用反射构造对象
 * @author yuankun
 * @Date 2019-04-21 22:01:06
 * @Description 
 *
 */
@SuppressWarnings("all")
public class EmployeeHandle {
	public static void main(String[] args) throws DocumentException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("employee.xml"));
		Element root=doc.getRootElement();
		List<Employee> employeeList=new ArrayList<Employee>();
		//获取类对象
		String className = "com.niliv.ReflectEmployee.Employee";
		Class<Employee> clazz = (Class<Employee>) Class.forName(className);
		System.out.println("获取class对象："+clazz);
		System.out.println("反射构造3个对象-------------");
		//遍历节点构造3个对象
		for(Iterator<Element> iteEmployee=root.elementIterator();iteEmployee.hasNext();){
			//空构造初始化对象
			Object object = clazz.newInstance();
			Element employeeEle=iteEmployee.next();
			for(Iterator<Element> subEmployeeEle=employeeEle.elementIterator();subEmployeeEle.hasNext();){
				Element subEle=subEmployeeEle.next();
				String nodeName=subEle.getName();
				switch (nodeName) {
					case "name":
						clazz.getDeclaredMethod("setName", String.class).invoke(object, subEle.getText());
						break;
					case "age":
						clazz.getDeclaredMethod("setAge", int.class).invoke(object, Integer.parseInt(subEle.getText()));
						break;
					case "post":
						clazz.getDeclaredMethod("setPost", String.class).invoke(object, subEle.getText());
						break;
					case "salary":
						clazz.getDeclaredMethod("setSalary", double.class).invoke(object, Double.parseDouble(subEle.getText()));
						break;
					case "assistance":
						clazz.getDeclaredMethod("setAssistance", double.class).invoke(object, Double.parseDouble(subEle.getText()));
						break;
				}
			
			}
			System.out.println(object);
			//放入集合
			employeeList.add((Employee)object);
		}
		System.out.println("\n--放入list输出");
		for (Employee b : employeeList) {
			System.out.println(b.getName()+"\t"+b.getAge()+"\t"+b.getPost()+"\t"+b.getSalary()+"\t"+b.getAssistance());
		}
	}
}
