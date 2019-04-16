import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;


public class TestJDOM {
	public static void main(String[] args) throws FileNotFoundException, JDOMException, IOException {
//		1)	创建一个SAXBuilder对象
		SAXBuilder sb=new SAXBuilder();
//	2)	调用build方法，得到Document对象(通过IO流)
		Document doc=sb.build(new FileInputStream("book.xml"));
//	3)	获取根节点
		Element root=doc.getRootElement(); //books元素
//	4)	获取根节点的直接子节点的集合
		List<Element> bookEle=root.getChildren();//book，2个book
//	5)	遍历集合,得到book的每一个子节点（子元素）
		for(int i=0;i<bookEle.size();i++){
			Element book=bookEle.get(i);
			//得到属性集合
			List<Attribute> attList=book.getAttributes();
			//遍历属性的集合得到每一个属性
			for (Attribute attr : attList) {
				System.out.println(attr.getName()+"\t"+attr.getValue());
			}
		}
		
		//得到每一个子节点
		System.out.println("\n-----------------------");
		for(int i=0;i<bookEle.size();i++){
			Element book=bookEle.get(i);//得到每一个book节点
			List<Element> subBook=book.getChildren();
			//遍历每一个节点，获取节点名称节点值
			for (Element ele : subBook) {
				System.out.println(ele.getName()+"\t"+ele.getValue());
			}
			System.out.println("=========================================");
		}
	}
}
