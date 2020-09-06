package bufferedIOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWTest {
	public static void main(String[] args) {
		copy("/Users/Hzl/Desktop/fos.txt", "/Users/Hzl/Desktop/Cfos.txt");
	}

	private static void copy(String string, String string2) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileReader = new FileReader(new File(string));
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter(new File((string2)));
			bufferedWriter = new BufferedWriter(fileWriter);
			char[] cbuf = new char[10];
			int len;
			while((len = bufferedReader.read(cbuf))!=-1) {//bufferedReader.readLine()！=null
				bufferedWriter.write(cbuf, 0, len);
//				bufferedWriter.newLine();写入新行
//				bufferedWriter.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileReader.close();
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
