package fileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		testOutputStream();
		testInputStream();
		File file = new File("src/_2019326/IOtestCopyfile.java");
		if (!file.exists()) {
			file.createNewFile();
		}

		FileInputStream fileInputStream = new FileInputStream("src/_2019326/FileIOStreamTest.java");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		byte[] b = new byte[2];
		int len;
		while ((len = fileInputStream.read(b)) != -1) {
			fileOutputStream.write(b, 0, len);
		}
	}

	public static void testInputStream() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("/Users/Hzl/Desktop/fos.txt");
		// 缓冲数组
		byte[] b = new byte[3];
		int len;
		while ((len = fileInputStream.read(b)) != -1) {
			System.out.println(new String(b, 0, 3));
		}

	}

	/**
	 * 字节流 UTF-8 一个字符2-3个字节
	 */
	public static void testOutputStream() {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("/Users/Hzl/Desktop/fos.txt");
			byte[] b = { '=', '0', 's', 'l', 's' };
			fileOutputStream.write(b, 0, 5);
			fileOutputStream.write("asd".getBytes());// getBytes返回的是一个byte数组
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("不存在此文件");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("写入失败");
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
