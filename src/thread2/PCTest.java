package thread2;

public class PCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1000);
		ChildThread childThread1 = new ChildThread("儿子1", account);
		PatentsThread patentsThread = new PatentsThread("父母",  account);
		childThread1.start();
		patentsThread.start();
	}
}
