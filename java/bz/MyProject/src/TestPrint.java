import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;


public class TestPrint {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = System.out;
		ps.println("123");
		
		ps= new PrintStream(new BufferedOutputStream(new FileOutputStream("d:/c.txt")),true);
		ps.println("adfasf");
		ps.println(true);
		
		
		PrintWriter pw= new PrintWriter(new BufferedOutputStream(new FileOutputStream("d:/d.txt")),true);
		pw.println("efdasfdsgdsg");
		pw.println(true);
	}
}
