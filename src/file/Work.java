package file;
/**
 * 复制文件夹结构
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = new String("/Users/Hzl/Desktop/PS+AI");
		String path2 = new String("/Users/Hzl/Desktop/PS+AI2");
		File file = new File(path);
		File file2 = new File(path2);
		copy(file, file2);

	}

	private static void copy(File file, File file2) throws IOException {
		// 如果不是文件夹,则直接创建文件
		if (!file.isDirectory()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			FileOutputStream fileOutputStream = new FileOutputStream(file2);
			byte [] buf = new byte[1024];
			int len;
			while((len = fileInputStream.read(buf))!=-1) {
				fileOutputStream.write(buf, 0, len);
			}
			if(fileInputStream!=null) {
				fileInputStream.close();
			}
			if(fileOutputStream!=null) {
				fileOutputStream.close();
			}
			//file2.createNewFile();
		} else {// 如果是文件夹，则创建文件夹，然后遍历文件夹下层文件
			file2.mkdir();
			String[] list = file.list();
			for (String string : list) {
				// 创建对应路径
				File file3 = new File(file, string);
				File file4 = new File(file2, string);
				copy(file3, file4);
				
			}
		}
	}

}
