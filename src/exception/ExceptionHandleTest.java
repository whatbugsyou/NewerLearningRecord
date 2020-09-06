package exception;

/**
 * 异常处理方式 1.函数内部catch处理 2.throws声明，让调用者处理
 * command+alt+R批量修改
 * command+alt+上下 复制行
 * command+D删除行
 * alt+上下 上下移动
 * command+shift+F格式化代码
 * @author Hzl
 *
 */
public class ExceptionHandleTest {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch到" + e.getMessage());
		}
	}

	public static void test() throws Exception {
		throw new Exception("test抛出的异常");// 抛出异常,给调用此函数的函数处理
	}
}
