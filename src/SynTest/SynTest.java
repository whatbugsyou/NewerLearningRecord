package SynTest;
/**
 * 对象🔒
 * 结论：两个线程共享同一个对象，当其中一个线程访问对象的synchronized方法时，锁定的对象。
 * 		其他线程不能访问此对象的所有synchronized方法。
 * 		普通方法不受影响。对象锁定，其他线程仍然可以调用非syn方法。
 */
public class SynTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynFunc synFunc = new SynFunc();
		Thread thread = new Thread(new AThread(synFunc));
		Thread thread2 = new Thread(new BThread(synFunc));
		thread.start();
		thread2.start();
	}

}
