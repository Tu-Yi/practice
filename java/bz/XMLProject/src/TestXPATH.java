import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class TestXPATH {
	public static void main(String[] args) throws DocumentException {
		//(1)SAXReader对象
		SAXReader reader=new SAXReader();
		//(2)读取XML文件
		Document doc=reader.read("book.xml");
		//得到第一个author节点
		Node node=doc.selectSingleNode("//author");
		System.out.println("节点的名称:"+node.getName()+"\t"+node.getText());
		//获取所有的author
		System.out.println("\n-----------------------");
		List<Node> list=doc.selectNodes("//author");
		for (Node n : list) {
			System.out.println("节点名称:"+n.getName()+"\t"+n.getText());
		}
		//选择有id属性的book元素
		List<Attribute> attList=doc.selectNodes("//book/@id");
		for (Attribute att : attList) {
			System.out.println("属性的名称:"+att.getName()+"\t"+att.getText());
		}
	}
}
