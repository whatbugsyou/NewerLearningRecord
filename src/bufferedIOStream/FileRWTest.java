package bufferedIOStream;
/**
 * 字符流FileReader FileWriter
 * 只能读写字符型文件
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWTest {
	public static void main(String[] args) {
		copy("/Users/Hzl/Desktop/fos.txt", "/Users/Hzl/Desktop/Cfos.txt");
	}

	private static void copy(String string, String string2) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader(new File(string));
			fileWriter = new FileWriter(new File(string2));
			char[] charBuf = new char[10];
			int len;
			while ((len = fileReader.read(charBuf)) != -1) {
				fileWriter.write(charBuf);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
