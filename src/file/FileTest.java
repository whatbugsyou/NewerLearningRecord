package file;
/**
 * delete删除 无法找回
 */
import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		//文件对象创建
		File file = new File("/Users/Hzl/Desktop/A.class");
		File file2 = new File("D:\\901");
		File file3 = new File(file2,"asd.txt");
		File file4 = new File("D:/901","asd.txt");
		file.createNewFile();
		//文件属性
		boolean exists = file.exists();
		System.out.println(exists);
		boolean canWrite = file.canWrite();
		boolean canRead = file.canRead();
		boolean canExecute = file.canExecute();
		System.out.println(canRead);
		file.isDirectory();//是否是文件夹
		file.isFile();//是否是文件
		String[] list = file.list();//文件夹下面的文件名String集合
		File[] listFiles = file.listFiles();//文件夹下面的文件名File集合
		file.length();//文件大小
		String absolutePath = file.getAbsolutePath();//获取绝对路径的String对象
		File absoluteFile = file.getAbsoluteFile();//获取绝对路径的File对象
		file.getName();//文件名
		String parent = file.getParent();//父文件夹的String路径
		File parentFile = file.getParentFile();//父文件夹的File对象
		//文件夹操作
		//file.mkdirs();//没有父目录则创建父目录文件夹
		//file.mkdir();//只能在存在的父目录下创建文件夹
		//文件操作
		//file.delete();
		//boolean createNewFile = file3.createNewFile();//创建文件
		
		File file5 = new File("/Users/Hzl/eclipse-workspace");
		printJ(file5);
		
		
	}
	public static void printJ(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				printJ(file2);
			}
		}else {
			if(file.getName().endsWith(".java"))
			System.out.println(file);
		}
	}
}
