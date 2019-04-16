

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestSAXParse {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	//1)	创建SAXParserFactory的对象
		SAXParserFactory spf=SAXParserFactory.newInstance();
	//2)	创建SAXParser对象 (解析器)
		SAXParser parser=spf.newSAXParser();
	//3)	创建一个DefaultHandler的子类
		BookDeaultHandler bdh=new BookDeaultHandler();
	//4)	调用parse方法
		parser.parse("book.xml", bdh);

	}
}
