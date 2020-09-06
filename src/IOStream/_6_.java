package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _6_ {

	public static void main(String[] args) throws IOException {
		String source = "a.jpg";
		String destination = "a_copy.jpg";
		// TODO Auto-generated method stub
		copy(source,destination);
	}

	private static void copy(String source, String destination) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = new FileOutputStream(new File(destination));
		FileInputStream fileInputStream = new FileInputStream(new File(source));
		byte[] buf = new byte[10];
		int len;
		while((len = fileInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, len);
		}
		fileOutputStream.close();
		fileInputStream.close();
	}

}
