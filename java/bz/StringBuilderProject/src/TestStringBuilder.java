
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("helloworld");
		sBuilder.append("world");
		sBuilder.append("world");
		sBuilder.append("world");
		sBuilder.append("world");
		sBuilder.append("world");
		sBuilder.append("world");
		
		System.out.println(sBuilder.length()); //40
		System.out.println(sBuilder.capacity()); //70  (16*2+2)*2+2
		
	}
}
