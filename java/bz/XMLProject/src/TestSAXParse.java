

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestSAXParse {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	//1)	����SAXParserFactory�Ķ���
		SAXParserFactory spf=SAXParserFactory.newInstance();
	//2)	����SAXParser���� (������)
		SAXParser parser=spf.newSAXParser();
	//3)	����һ��DefaultHandler������
		BookDeaultHandler bdh=new BookDeaultHandler();
	//4)	����parse����
		parser.parse("book.xml", bdh);

	}
}
