package IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _5_ {
	public static void main(String[] args) {
		String string="/Users/Hzl/Desktop/fos.txt";
		ConsoleToFile(string);//输入end结束
	}
	private static void ConsoleToFile(String string) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fileWriter = new FileWriter(new File(string));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = null;
		s=scanner.nextLine();
		try {
			while (!("end".equals(s))) {
				fileWriter.write(s + '\n');
				s=scanner.nextLine();
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
