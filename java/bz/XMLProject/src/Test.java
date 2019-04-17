import java.io.File;
import java.io.FileOutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;
/**
 * 验证XML有效性
 * @author yuankun
 * @Date 2019-04-17 10:21:01
 * @Description 
 *
 */
public class Test {
	public static void main(String[] args) throws SAXException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		File sf = new File("employee.xsd");
		Schema schema = schemaFactory.newSchema(sf);
		Validator validator = schema.newValidator();
		Source source =new StreamSource("employee.xml");
		try {
			validator.validate(source);
			System.err.println("成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("失败");
		}
	}
}
