package IOStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws FileNotFoundException {
//		 TODO Auto-generated method stub
		String path = "/as";
		PrintWriter printWriter = new PrintWriter(path);
		printWriter.print(path);
		printWriter.println();
		printWriter.flush();
		printWriter.close();
	}

}
