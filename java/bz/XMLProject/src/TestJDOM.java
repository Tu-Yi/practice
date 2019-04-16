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
//		1)	����һ��SAXBuilder����
		SAXBuilder sb=new SAXBuilder();
//	2)	����build�������õ�Document����(ͨ��IO��)
		Document doc=sb.build(new FileInputStream("book.xml"));
//	3)	��ȡ���ڵ�
		Element root=doc.getRootElement(); //booksԪ��
//	4)	��ȡ���ڵ��ֱ���ӽڵ�ļ���
		List<Element> bookEle=root.getChildren();//book��2��book
//	5)	��������,�õ�book��ÿһ���ӽڵ㣨��Ԫ�أ�
		for(int i=0;i<bookEle.size();i++){
			Element book=bookEle.get(i);
			//�õ����Լ���
			List<Attribute> attList=book.getAttributes();
			//�������Եļ��ϵõ�ÿһ������
			for (Attribute attr : attList) {
				System.out.println(attr.getName()+"\t"+attr.getValue());
			}
		}
		
		//�õ�ÿһ���ӽڵ�
		System.out.println("\n-----------------------");
		for(int i=0;i<bookEle.size();i++){
			Element book=bookEle.get(i);//�õ�ÿһ��book�ڵ�
			List<Element> subBook=book.getChildren();
			//����ÿһ���ڵ㣬��ȡ�ڵ����ƽڵ�ֵ
			for (Element ele : subBook) {
				System.out.println(ele.getName()+"\t"+ele.getValue());
			}
			System.out.println("=========================================");
		}
	}
}
