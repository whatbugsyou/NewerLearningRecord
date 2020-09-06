package StaticSynTest;

public class SynFunc {
	static int sint=0;
	public synchronized static void a(){
		System.out.println("进入a");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("退出a");
	}
	public synchronized  void b(){
		System.out.println("进入b");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("退出b");
	}
	public void c() {
		System.out.println("调用c");
	}
}
