package exception;

import java.util.InputMismatchException;

/**
 * -------------------------------------------------异常--------------------------------------
 * Object Throwable Error | Exception 
 * 							 受检时异常 | 运行时异常 
 * 						SQLException   |
 * 	ClassNotFoundException IOException | ArrayIndexOutOfBoundsException
 * 									   | NullPointerException NumberFormatException
 * 
 * catch，顺序匹配，匹配成功运行代码块后跳转finally ，只匹配一次。所以将父类异常放后面，Exception类能匹配任意异常。
 */
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int b = 1;
			int c = b / a;
		} catch (ArithmeticException | InputMismatchException e) {// 逻辑与或非&&||！对boolean类型 这里是|位运算
			// TODO: handle exception
			e.printStackTrace();// 打印异常堆栈信息 包含下面的massage
			System.out.println(e.getMessage());
			System.out.println("除数不能为零");
			return;
		} finally {
			// 除了上面有终止虚拟机System.exit()函数，则一定会执行的代码,return了也会执行
			System.out.println("欢迎下次使用");
		}
	}

}