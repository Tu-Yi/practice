import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xml.internal.serializer.ToSAXHandler;

public class TestStringBuilder {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer();
		
		//添加
		StringBuffer sBuffer2 = sBuffer.append(1).append(true);
		System.out.println(sBuffer); //1true
		System.out.println(sBuffer==sBuffer2); //true
		
		sBuffer.insert(1, "haha");
		System.out.println(sBuffer); //1hahatrue
		
		//删除
		sBuffer.delete(1, 3);
		System.out.println(sBuffer); //1hatrue
		
		//查找 charAt indexOf lastIndexOf
		
		//修改
		sBuffer.replace(1, 3, "nba");
		sBuffer.setCharAt(4, 'y');
		System.out.println(sBuffer);
		
		System.out.println(sBuffer.reverse());
		
		sBuffer.setLength(0);
		System.out.println(sBuffer.length());
		
		//进制转换
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toString(60, 2));
		
		System.out.println(Integer.parseInt("111100", 2));
		
		Integer integer1 = 127;
		Integer integer2 = 127;
		Integer integer3 = 128;
		Integer integer4 = 128;
		System.out.println(integer1==integer2); //true
		System.out.println(integer3==integer4);  //false
		
		
		
		
		
		
		
//		StringBuilder sBuilder = new StringBuilder();
//		sBuilder.append("helloworld");
//		sBuilder.append("world");
//		sBuilder.append("world");
//		sBuilder.append("world");
//		sBuilder.append("world");
//		sBuilder.append("world");
//		sBuilder.append("world");
//		
//		System.out.println(sBuilder.length()); //40
//		System.out.println(sBuilder.capacity()); //70  (16*2+2)*2+2
		
	}
}
