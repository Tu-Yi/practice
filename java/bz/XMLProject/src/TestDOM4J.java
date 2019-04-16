



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
	public static void main(String[] args) {
//		1)	����SAXReader����
		SAXReader reader=new SAXReader();
//	2)	����read����
		Document doc=reader.read(new File("book.xml"));
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
		List<Book> bookList=new ArrayList<Book>();
		for(Iterator<Element> iteBook=root.elementIterator();iteBook.hasNext();){
			//����Book����
			Book book=new Book();
			Element bookEle=iteBook.next();//�õ�ÿһ��book
			//ʹ��forѭ����������
			for(Iterator<Element> subBookEle=bookEle.elementIterator();subBookEle.hasNext();){
				//�õ�ÿһ����Ԫ��
				Element subEle=subBookEle.next();
				System.out.println(subEle.getName()+"\t"+subEle.getText());
				/**
				 * ��װ��Book����
				 * */
				//��ȡ�ڵ������
				String nodeName=subEle.getName();//name,author,price
				//ʹ��switch�ж�
				switch (nodeName) {
				case "name":
					book.setName(subEle.getText());
					break;
				case "author":
					book.setAuthor(subEle.getText());
					break;
				case "price":
					book.setPrice(Double.parseDouble(subEle.getText()));
					break;
				}
			
			}
				//��ӵ�������
			bookList.add(book);
		}
		
		//��������
		System.out.println("\n��������-----------------------\n");
		for (Book b : bookList) {
			System.out.println(b.getName()+"\t"+b.getAuthor()+"\t"+b.getPrice());
		}
	}
}
