import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class DOMParse {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//	1)	����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//2) ����һ��DocumentBuilder����
		DocumentBuilder db=dbf.newDocumentBuilder();
		//	3)	ͨ��DocumentBuilder��parse(...)�����õ�Document����
		Document doc=db.parse("book.xml");
		//	4)	ͨ��getElementsByTagName(...)������ȡ���ڵ���б�
		NodeList bookList=doc.getElementsByTagName("book");
		//System.out.println(bookList.getLength());
		//	5)	ͨ��forѭ������ÿһ���ڵ�  
		for(int i=0;i<bookList.getLength();i++){
		//	6)	�õ�ÿ���ڵ�����Ժ�����ֵ
			Node book=bookList.item(i);
			NamedNodeMap attrs=book.getAttributes(); //�õ������Եļ���
			//ѭ������ÿһ������
			for(int j=0;j<attrs.getLength();j++){
				//�õ�ÿһ������
				Node id=attrs.item(j);
				System.out.println("���Ե�����:"+id.getNodeName()+"\t"+id.getNodeValue());
			}
		}
		System.out.println("\nÿ���ڵ�����ͽڵ��ֵ");
		//	7)	�õ�ÿ���ڵ�Ľڵ����ͽڵ�ֵ
		for(int i=0;i<bookList.getLength();i++){
			//�õ�ÿһ��book�ڵ�
			Node book=bookList.item(i);
			NodeList subNode=book.getChildNodes();
			System.out.println("�ӽڵ�ĸ���:"+subNode.getLength());
			//ʹ��forѭ������ÿһbook���ӽڵ�
			for(int j=0;j<subNode.getLength();j++){
				Node childNode=subNode.item(j);
				//System.out.println(childNode.getNodeName());
				short type=childNode.getNodeType(); //��ȡ�ڵ������
				if(type==Node.ELEMENT_NODE){
					System.out.println("�ڵ������:"+childNode.getNodeName()+"\t"+childNode.getTextContent());
				}
				
			}
		}
	}
}
