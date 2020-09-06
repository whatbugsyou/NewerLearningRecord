package IOStream;
import java.io.File;
import java.io.IOException;

public class _1_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/Hzl/Desktop/HelloWorld.txt";
		File file = new File(path);
		file.createNewFile();
		String path2 = "/Users/Hzl/Desktop/IOTest";
		File file2 = new File(path2);
		file2.mkdir();
		File file3 = new File(file2,file.getName());
		file3.createNewFile();
		file.delete();
		File[] listFiles = file2.listFiles();
		for (File file4 : listFiles) {
			System.out.println("遍历中");
		}
		
	}

}
