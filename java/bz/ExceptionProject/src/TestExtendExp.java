import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;
import javax.naming.directory.AttributeInUseException;
import com.sun.org.apache.bcel.internal.classfile.Field;

public class TestExtendExp {
	public static void main(String[] args) {
		Person person = new Person();
		person.fun();
	}
}
class Person{
	
	public void show() throws IOException {
		
	}
	public void method() {
		
	}
	public void fun() {
		throw new ArrayIndexOutOfBoundsException(0);
	}
}
class son extends Person{
	
	//父类抛出了异常，子类可以抛出，也可以不抛出，如果抛出，必须是父类异常的子类
	@Override
	public void show(){ 
		//Exception Exception is not compatible with throws clause in Person.show()
	}
	
	//父类没有异常，子类如有异常，必须用try/catch，不能方法抛出
	@Override
	public void method(){
		////Exception Exception is not compatible with throws clause in Person.show()
		
		try {
			File file = new File("c:/e.txtg");
			file.createNewFile();
			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	//抛出运行时异常，什么时候都可以
	@Override
	public void fun() {
		try {
			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
