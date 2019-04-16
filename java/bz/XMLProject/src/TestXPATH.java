import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class TestXPATH {
	public static void main(String[] args) throws DocumentException {
		//(1)SAXReader����
		SAXReader reader=new SAXReader();
		//(2)��ȡXML�ļ�
		Document doc=reader.read("book.xml");
		//�õ���һ��author�ڵ�
		Node node=doc.selectSingleNode("//author");
		System.out.println("�ڵ������:"+node.getName()+"\t"+node.getText());
		//��ȡ���е�author
		System.out.println("\n-----------------------");
		List<Node> list=doc.selectNodes("//author");
		for (Node n : list) {
			System.out.println("�ڵ�����:"+n.getName()+"\t"+n.getText());
		}
		//ѡ����id���Ե�bookԪ��
		List<Attribute> attList=doc.selectNodes("//book/@id");
		for (Attribute att : attList) {
			System.out.println("���Ե�����:"+att.getName()+"\t"+att.getText());
		}
	}
}
