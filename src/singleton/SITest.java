package singleton;

public class SITest implements Runnable{
	
	public static void main(String[] args) {
		Thread thread = new Thread(new SITest(),"1");
		Thread thread2 = new Thread(new SITest(),"2");
		thread.start();
		thread2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingleIn sI = SingleIn.getInstance();
	}
}
