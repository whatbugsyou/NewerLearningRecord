package bufferedIOStream;
/**
 * 从控制台到文件
 * 从文件到控制台
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Work {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="src";
		File file = new File(path);
		file = file.getAbsoluteFile();
		System.out.println(file.getParent());
		//ConsoleToFile(path);
		//FileToConsole(path);
		
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
			while (!("byebye".equals(s))) {
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
