package thread3;

public class ThreadTest {
	private final A a = new A();
	private class A{
	}
	public void t() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (a) {
					try {
						a.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).run();
	}
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		threadTest.t();
	}
}
