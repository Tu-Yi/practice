

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookDeaultHandler extends DefaultHandler {
	private List<Book> books;
	private Book book;
	private String tag;
	//重写第一个方法
	/**解析xml文档开始时调用*/
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		books = new ArrayList<Book>();
	}
	/*解析xml文档结束时调用*/
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		
	}
	/**解析xml文档中的节点时调用*/
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		/**判断，如果是book节点，获取节点的属性和属性值*/
		if("book".equals(qName)){
			book = new Book();
			//获取所有的属性
			int count=attributes.getLength();//属性的个数
			//循环获取每个属性
			for(int i=0;i<count;i++){
				String attName=attributes.getQName(i);//属性名称
				String attValue=attributes.getValue(i);//属性值
			}
		}else if(!"books".equals(qName)&&!"book".equals(qName)){
			tag = qName;
		}
		
	}
	/**解析xml文档中的节点结束调用*/
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
