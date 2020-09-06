package OOP3;
/**
 * 
 * @author Hzl
 *
 */
public abstract class CodeTime {
	public void getTime() {
		long time1=System.currentTimeMillis();//in milliseconds毫秒
		code();
		long time2=System.currentTimeMillis();
		System.out.println("用时："+(long)(time2-time1));
	}
	public abstract void code();
}
