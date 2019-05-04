import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		BufferedOutputStream biStream = new BufferedOutputStream(bos);
		DataOutputStream dos = new DataOutputStream(biStream);
		dos.writeUTF("hello");
		dos.writeInt(1);
		dos.writeBoolean(false);
		dos.flush();
		
		byte[] arr = bos.toByteArray();
		
		ByteArrayInputStream bas = new ByteArrayInputStream(arr);
		BufferedInputStream bis = new BufferedInputStream(bas);
		DataInputStream dis = new DataInputStream(bis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
	}
}
