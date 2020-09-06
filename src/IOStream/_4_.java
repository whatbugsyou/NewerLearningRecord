package IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _4_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="/Users/Hzl/Desktop/fos.txt";
		FileToConsole(path);
	}
	private static void FileToConsole(String path) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader(new File(path));
		char[] cbuf = new char[10];
		int len ;
		while((len = fileReader.read(cbuf))!=-1) {
			System.out.print(new String(cbuf,0,len));//不用println
		}
		fileReader.close();
	}
}
