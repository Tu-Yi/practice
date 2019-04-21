



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
//		1)	����SAXReader����
		SAXReader reader=new SAXReader();
//	2)	����read����
		Document doc=reader.read(new File("employee.xml"));
//	3)	��ȡ��Ԫ��
		Element root=doc.getRootElement();//books
//	4)	ͨ������������ֱ�ӽڵ�
		
		System.out.println("\n------------------------------------");
		List<Employee> employeeList=new ArrayList<Employee>();
		String className = "com";
		for(Iterator<Element> iteEmployee=root.elementIterator();iteEmployee.hasNext();){
			//����Employee����
			Employee employee=new Employee();
			Element employeeEle=iteEmployee.next();//�õ�ÿһ��Employee
			//ʹ��forѭ����������
			for(Iterator<Element> subEmployeeEle=employeeEle.elementIterator();subEmployeeEle.hasNext();){
				//�õ�ÿһ����Ԫ��
				Element subEle=subEmployeeEle.next();
				System.out.println(subEle.getName()+"\t"+subEle.getText());
				/**
				 * ��װ��Employee����
				 * */
				//��ȡ�ڵ������
				String nodeName=subEle.getName();//name,author,price
				//ʹ��switch�ж�
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
				//��ӵ�������
			employeeList.add(employee);
		}
		
		//��������
		System.out.println("\n��������-----------------------\n");
		for (Employee b : employeeList) {
			System.out.println(b.getName()+"\t"+b.getAge()+"\t"+b.getPost()+"\t"+b.getSalary()+"\t"+b.getAssistance());
		}
	}
}
