package thread2;

public class PatentsThread extends Thread {
	Account acct;

	public PatentsThread(String name, Account acct) {
		super(name);
		this.acct = acct;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			if (acct.money < 500) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("还剩"+acct.money+"----------------------------------");
				acct.money += 1000;
				System.out.println(Thread.currentThread().getName() + "存钱1000,还剩" + acct.money + "元");
				synchronized (acct) {
					acct.notify();
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
