package thread;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread6 = new Thread(new TicketSale(), "窗口1");
		Thread joinThread = new Thread(new TicketSale(), "join");
		joinThread.start();
		joinThread.join();// 阻塞正在执行的线程：即main线程 等待joinThread执行完才会有下面6的开始。
		thread6.start();

//		joinThread.yield();让线程进入可运行状态

	}
}
