



import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestDOM4J {
	public static void main(String[] args) throws DocumentException {
//		1)	创建SAXReader对象
		SAXReader reader=new SAXReader();
//	2)	调用read方法
		Document doc=reader.read(new File("employee.xml"));
//	3)	获取根元素
		Element root=doc.getRootElement();//books
//	4)	通过迭代器遍历直接节点
		
		System.out.println("\n------------------------------------");
		List<Employee> employeeList=new ArrayList<Employee>();
		String className = "com";
		for(Iterator<Element> iteEmployee=root.elementIterator();iteEmployee.hasNext();){
			//创建Employee对象
			Employee employee=new Employee();
			Element employeeEle=iteEmployee.next();//得到每一个Employee
			//使用for循环继续遍历
			for(Iterator<Element> subEmployeeEle=employeeEle.elementIterator();subEmployeeEle.hasNext();){
				//得到每一个子元素
				Element subEle=subEmployeeEle.next();
				System.out.println(subEle.getName()+"\t"+subEle.getText());
				/**
				 * 封装成Employee对象
				 * */
				//获取节点的名称
				String nodeName=subEle.getName();//name,author,price
				//使用switch判断
				switch (nodeName) {
					case "name":
						employee.setName(subEle.getText());
						break;
					case "age":
						employee.setAge(Integer.parseInt(subEle.getText()));
						break;
					case "post":
						employee.setPost(subEle.getText());
						break;
					case "salary":
						employee.setSalary(Double.parseDouble(subEle.getText()));
						break;
					case "assistance":
						employee.setAssistance(Double.parseDouble(subEle.getText()));
						break;
				}
			
			}
				//添加到集合中
			employeeList.add(employee);
		}
		
		//遍历集合
		System.out.println("\n遍历集合-----------------------\n");
		for (Employee b : employeeList) {
			System.out.println(b.getName()+"\t"+b.getAge()+"\t"+b.getPost()+"\t"+b.getSalary()+"\t"+b.getAssistance());
		}
	}
}
