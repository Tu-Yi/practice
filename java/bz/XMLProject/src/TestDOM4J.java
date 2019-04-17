



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
		for(Iterator<Element> iteBook=root.elementIterator();iteBook.hasNext();){
			Element bookEle=iteBook.next();
			//System.out.println(bookEle.getName());
			//�õ�book������
			for(Iterator<Attribute> iteAtt=bookEle.attributeIterator();iteAtt.hasNext();){
				Attribute att=iteAtt.next();
				System.out.println(att.getName()+"\t"+att.getText());
			}
		}
		
		System.out.println("\n------------------------------------");
		List<Employee> employeeList=new ArrayList<Employee>();
		for(Iterator<Element> iteEmployee=root.elementIterator();iteEmployee.hasNext();){
			//����Book����
			Employee employee=new Employee();
			Element employeeEle=iteEmployee.next();//�õ�ÿһ��book
			//ʹ��forѭ����������
			for(Iterator<Element> subEmployeeEle=employeeEle.elementIterator();subEmployeeEle.hasNext();){
				//�õ�ÿһ����Ԫ��
				Element subEle=subEmployeeEle.next();
				System.out.println(subEle.getName()+"\t"+subEle.getText());
				/**
				 * ��װ��Book����
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
