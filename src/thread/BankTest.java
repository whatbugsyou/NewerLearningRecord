package thread;
/**
 * 
 * @author Hzl
 *
 */
public class BankTest implements Runnable{
	bankCard bC= new bankCard(1000);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTest bank = new BankTest();
		Thread thread = new Thread(bank,"我----");
		Thread thread2 = new Thread(bank,"她***");
		Thread thread3 = new Thread(bank,"路人～～");
		thread.start();
		thread2.start();
		thread3.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {//模拟某人不停取钱
			boolean flag = bC.withdrowMoney(1);
			//停止条件
			if(flag==false) {
				break;
			}
		}
	}

}
