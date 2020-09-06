package bufferedIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOtreamTest {
	public static void main(String[] args) {
		copy("/Users/Hzl/Desktop/fos.txt","/Users/Hzl/Desktop/Bfos.txt");
		//new File("/Users/Hzl/Desktop/Bfos.txt").delete();
		System.out.println("复制结束");
		
	}

	private static void copy(String istring, String ostring) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(istring);
			fileOutputStream = new FileOutputStream(ostring);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//装饰者设计模式  
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		byte[] b = new byte[1024];
		int len;
		try {
			while((len = bufferedInputStream.read(b))!=-1) {//read 继承于FileInputStream并不提速，没有重写
				bufferedOutputStream.write(b, 0, len);
//				bufferedOutputStream.flush();//直接把缓存的东西写入，不等缓存满，增加IO次数，使用buffer效率没有提升。
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {//先开的后关，关闭还有一个刷新缓存的作用，意思就是把缓存的东西写完。
				bufferedInputStream.close();
				bufferedOutputStream.close();
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
