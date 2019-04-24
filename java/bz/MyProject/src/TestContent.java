import java.io.UnsupportedEncodingException;

public class TestContent {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//编码就是字符串转为字节，解码就是字转为字符串
		String msgString = "性命生命使命";
		
		//编码
		byte[] datas = msgString.getBytes(); //默认使用工程字符集
		System.out.println(datas.length);  //18  UTF-8 每个汉字3个字节
		
//		datas = msgString.getBytes("GBK");
//		System.out.println(datas.length);  //12  GBK 每个孩子2个字节
		
		//解码
		String string = new String(datas,0,datas.length,"utf8");
		System.out.println(string);
		
		
		//乱码原因
		//1 字节数不够
		String string1 = new String(datas,0,datas.length-2,"utf8");
		System.out.println(string1); //性命生命使�
		
		//1 字符集不同
		String string2 = new String(datas,0,datas.length-2,"gbk");
		System.out.println(string2); //鎬у懡鐢熷懡浣垮
	}
}
