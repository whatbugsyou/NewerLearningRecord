package StaticSynTest;
/**
 * 类锁
 * 结论：synchronized static方法锁类Class对象，有线程访问此方法，其余线程不能调用所有的synchronized static的方法
 * 		成员方法不受影响，属性不受影响。
 */
public class SynTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynFunc synFunc = new SynFunc();
		Thread thread = new Thread(new AThread());
		Thread thread2 = new Thread(new BThread(synFunc));
		thread.start();
		thread2.start();
	}
}
