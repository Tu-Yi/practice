

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookDeaultHandler extends DefaultHandler {
	//��д��һ������
	/**����xml�ĵ���ʼʱ����*/
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("����xml�ĵ���ʼ");
	}
	/*����xml�ĵ�����ʱ����*/
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("����xml�ĵ�����");
	}
	/**����xml�ĵ��еĽڵ�ʱ����*/
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		//System.out.println("����xml�ĵ��еĽڵ�ʱ����");
		/**�жϣ������book�ڵ㣬��ȡ�ڵ�����Ժ�����ֵ*/
		if("book".equals(qName)){
			//��ȡ���е�����
			int count=attributes.getLength();//���Եĸ���
			//ѭ����ȡÿ������
			for(int i=0;i<count;i++){
				String attName=attributes.getQName(i);//��������
				String attValue=attributes.getValue(i);//����ֵ
				System.out.println("��������:"+attName+"\t����ֵΪ:"+attValue);
			}
		}else if(!"books".equals(qName)&&!"book".equals(qName)){
			System.out.print("�ڵ������:"+qName+"\t");
		}
		
	}
	/**����xml�ĵ��еĽڵ��������*/
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		//System.out.println("����xml�ĵ��еĽڵ��������");
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String value=new String(ch,start,length);
		if(!"".equals(value.trim())){
			System.out.println(value);
		}
		
	}
}
