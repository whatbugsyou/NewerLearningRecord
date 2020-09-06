package exception;
/**
 * 子类在覆盖父类方法的时候，父类的引用是可以调用该方法的（多态）
 * 如果父类的引用调用子类的方法，那么这个多抛出来的异常，就可能处于一种无法被处理的状态。
 * @author Hzl
 *
 */
public class Son extends Father{
	public void testException() throws ArithmeticException{
		
	}
}
