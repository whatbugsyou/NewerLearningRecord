package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 对象的读写 （网络中传输）
 * 序列化：	{@link Serializable} 对象转二进制
 * 反序列化：
 * @author Hzl
 *
 */
public class ObjectIOStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String path = "/Users/Hzl/Desktop/p";
		// TODO Auto-generated method stub
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
		Date date = new Date();
		objectOutputStream.writeObject(date);
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
		Date readDate = (Date)objectInputStream.readObject();
		System.out.println(readDate);
		objectInputStream.close();
		
		new File(path).delete();
	}

}
