

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookDeaultHandler extends DefaultHandler {
	private List<Book> books;
	private Book book;
	private String tag;
	//��д��һ������
	/**����xml�ĵ���ʼʱ����*/
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		books = new ArrayList<Book>();
	}
	/*����xml�ĵ�����ʱ����*/
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		
	}
	/**����xml�ĵ��еĽڵ�ʱ����*/
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		/**�жϣ������book�ڵ㣬��ȡ�ڵ�����Ժ�����ֵ*/
		if("book".equals(qName)){
			book = new Book();
			//��ȡ���е�����
			int count=attributes.getLength();//���Եĸ���
			//ѭ����ȡÿ������
			for(int i=0;i<count;i++){
				String attName=attributes.getQName(i);//��������
				String attValue=attributes.getValue(i);//����ֵ
			}
		}else if(!"books".equals(qName)&&!"book".equals(qName)){
			tag = qName;
		}
		
	}
	/**����xml�ĵ��еĽڵ��������*/
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		if("book".equals(qName)){
			books.add(book);
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		String value=new String(ch,start,length);
		if(!"".equals(value.trim())){
			if(tag=="name") {
				book.setName(value);
			}else if(tag=="author") {
				book.setAuthor(value);
			}else if(tag=="price") {
				book.setPrice(Double.parseDouble(value));
			}
		}
		
	}
	public List<Book> getData(){
		return books;
	}
}
