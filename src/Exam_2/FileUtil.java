package Exam_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * File file:		要切分的目标文件
String name:	切分生成的小文件的名称的前缀
如 div(file, “foo”)，生成三个小文件，则切分后的三个文件的命名如下
：foo_1_3, foo_2_3, foo_3_3（参数_第几块_共计几块），不要后缀名
 */
public class FileUtil {
	public static void div(File file, String name) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[512*1024] ; 
		long sum = file.length()/512/1024+1;  //计算总分隔数
		int len,i=1; //i为当前分隔数
		while( (len=fileInputStream.read(buf))!=-1 ) {
			String s = name +"_"+Integer.toString(i)+"_"+Long.toString(sum);//文件名
			File file2 = new File(file.getParentFile(),s); 
			file2.createNewFile();//创建文件
			FileOutputStream outputStream = new FileOutputStream(file2);
			outputStream.write(buf, 0, len);//写出
			i++; 
		}
	}
	public static void main(String[] args) throws IOException {
		File file = new File("src/jishi2/jls9.pdf");
		div(file,"jls");
	}
}
