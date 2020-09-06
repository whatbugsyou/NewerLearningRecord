package IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _7_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/Hzl/Desktop/fos.txt";
		calcAa(path);
	}

	private static void calcAa(String path) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader(new File(path));
		char[] buf = new char[1];
		int Acount = 0;
		int acount = 0;
		while (fileReader.read(buf) != -1) {
			switch (buf[0]) {
			case 'A':
				Acount++;
				break;
				
			case 'a':
				acount++;
				break;

			default:
				break;
			}
		}
		System.out.println("A字符个数："+Acount+"个，a字符个数："+acount+"个");

	}

}
