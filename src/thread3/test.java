package thread3;

public class test {
	public static Object a = new Object();

	static void p() {
		synchronized (a) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("123");
		}
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test.p();
			}
		}).run();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test.p();
			}
		}).run();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test.p();
			}
		}).run();
	}
}
