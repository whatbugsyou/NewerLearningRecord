package IOStream;

import java.io.File;

public class _3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/Hzl/eclipse-workspace/201931");
		printJ(file );

	}
	public static void printJ(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();//返回绝对路径的File对象
		//	String[] list = file.list();只返回下层文件名字，不是绝对路径名
			for (File file2 : listFiles) {
				printJ(file2);
			}
		}else {
			if(file.getName().endsWith(".java"))
			System.out.println(file.getName());
		}
	}

}
