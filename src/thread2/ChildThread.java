package thread2;

public class ChildThread extends Thread {
	Account acct;

	public ChildThread(String name, Account acct) {
		super(name);
		this.acct = acct;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (acct.money >= 100) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				acct.money -= 100;
				System.out.println(Thread.currentThread().getName() + "取走100,还剩" + acct.money + "元");
				synchronized (acct) {
					acct.notify();
				}
			} else {
				synchronized (acct) {
					try {
						acct.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
}
