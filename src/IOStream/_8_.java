package IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _8_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/Hzl/Desktop/fos.txt";
		calcCharNum(path);
	}

	private static void calcCharNum(String path) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader(new File(path));
		char[] buf = new char[1];
		int[] charNum = new int[26];
		int[] CcharNum = new int[26];
		while (fileReader.read(buf) != -1) {
			if(buf[0]<='Z'&&buf[0]>='A')
				CcharNum[buf[0]-'A']++;
			if(buf[0]<='z'&&buf[0]>='a')
				charNum[buf[0]-'a']++;
		}
		for (int i = 0; i < CcharNum.length; i++) {
			System.out.print((char)(i+'A')+"("+CcharNum[i]+"),");
		}
		System.out.print((char)(0+'a')+"("+charNum[0]+")");//解决最后多一个逗号细节
		for (int i = 1; i < charNum.length; i++) {
			System.out.print(","+(char)(i+'a')+"("+charNum[i]+")");
		}
		
	}

}
