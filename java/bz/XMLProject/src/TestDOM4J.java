



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
//		1)	创建SAXReader对象
		SAXReader reader=new SAXReader();
//	2)	调用read方法
		Document doc=reader.read(new File("book.xml"));
//	3)	获取根元素
		Element root=doc.getRootElement();//books
//	4)	通过迭代器遍历直接节点
		for(Iterator<Element> iteBook=root.elementIterator();iteBook.hasNext();){
			Element bookEle=iteBook.next();
			//System.out.println(bookEle.getName());
			//得到book的属性
			for(Iterator<Attribute> iteAtt=bookEle.attributeIterator();iteAtt.hasNext();){
				Attribute att=iteAtt.next();
				System.out.println(att.getName()+"\t"+att.getText());
			}
		}
		
		System.out.println("\n------------------------------------");
		List<Book> bookList=new ArrayList<Book>();
		for(Iterator<Element> iteBook=root.elementIterator();iteBook.hasNext();){
			//创建Book对象
			Book book=new Book();
			Element bookEle=iteBook.next();//得到每一个book
			//使用for循环继续遍历
			for(Iterator<Element> subBookEle=bookEle.elementIterator();subBookEle.hasNext();){
				//得到每一个子元素
				Element subEle=subBookEle.next();
				System.out.println(subEle.getName()+"\t"+subEle.getText());
				/**
				 * 封装成Book对象
				 * */
				//获取节点的名称
				String nodeName=subEle.getName();//name,author,price
				//使用switch判断
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
				//添加到集合中
			bookList.add(book);
		}
		
		//遍历集合
		System.out.println("\n遍历集合-----------------------\n");
		for (Book b : bookList) {
			System.out.println(b.getName()+"\t"+b.getAuthor()+"\t"+b.getPrice());
		}
	}
}
