package exception;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AgeOutOfBoundsException extends Exception {
	
	private static final long serialVersionUID = -534175874068802497L;

	/**
	 * 异常类为可序列化的类。
	 * 序列化：对象表示的字节码序列存入内存。 反序列：从字节码新建对象。
	 * 序列ID:决定能否反序列成功。未定义序列ID的类序列化时会自动生成序列ID。如果类将来被改变，那么自动生成的序列ID也会改变。readObject会检查左右值的类序列ID，不符合就会反序列化失败。
	 * 		定义序列ID，可以使改变后仍然序列化成功。通过控制ID实现兼容人为可控。
	 * transient关键字，说明变量是短暂的，不进入序列字节。 java标准约定序列文件后缀.ser
	 * 使用{@link FileOutputStream}{@link ObjectOutputStream}进行写出 Input进行读入
	 * 
	 * 对象序列化包括如下步骤：  FileNotFoundException IOException
	 * 1） 创建一个对象输出流，它可以包装一个其他类型的目标输出流，如文件输出流； （所谓包装，就是仍然是当前输出流的输出位置，但是输出方式改变）
	 * 2） 通过对象输出流的writeObject()方法写对象。
	 *  ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream( new File(“E:/a.ser”))); 
		oo.writeObject(a); 
	 * 
	 * 对象反序列化的步骤如下： 
	 * 1） 创建一个对象输入流，它可以包装一个其他类型的源输入流，如文件输入流； 
	 * 2） 通过对象输入流的readObject()方法读取对象。 
	 * ObjectInputStream ois = new ObjectInputStream(new FileInputStream( 
 		new File(“E:/a.txt”))); 
 		 A a = (A) ois.readObject();  //强制转换
	 */

	public AgeOutOfBoundsException() {
		// TODO Auto-generated constructor stub
		super("年龄超出边界");
	}

	public AgeOutOfBoundsException(String massage) {
		// TODO Auto-generated constructor stub
		super("年龄超出边界" + massage);
	}

}
