package IOStream;
/**
 * 数据输入输出流，针对基本数据类型,以二进制读写
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String path = "/Users/Hzl/Desktop/p";
			
			//首先创建outputStream对象，会直接创建文件，注意顺序。考虑文件是否已经存在
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path));
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path));
		
			dataOutputStream.writeInt(130210);
			dataOutputStream.writeBoolean(false);
			int data = dataInputStream.readInt();
			System.out.println(data);
			
			dataInputStream.close();
			dataOutputStream.close();
			new File(path).delete();
	}

}
