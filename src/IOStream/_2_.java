package IOStream;
/**
 * 显示文件夹里所有文件，具有缩进格式。
 */
import java.io.File;

public class _2_ {

	public static void main(String[] args) {
		String  path = "/Users/Hzl/Desktop/Matlab程序";
		// TODO Auto-generated method stub
		listAllFile(path);
	}

	private static void listAllFile(String path) {
		// TODO Auto-generated method stub
		File file = new File(path);
		if(file.isDirectory()) {
			System.out.println("文件夹:"+file.getName());
			String[] list = file.list();
			for (String string : list) {
				System.out.print("  ");
				listAllFile(file.getAbsolutePath()+"/"+string);
			}
		}else {
			System.out.print("  ");
			System.out.println(file.getName());
		}
	}

}
