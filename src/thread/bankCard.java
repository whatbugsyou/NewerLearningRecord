package thread;

public class bankCard {
	double money;

	public bankCard(double money) {
		super();
		this.money = money;
	}
//	错误分析：
//		synchronized锁方法，方法执行完毕释放锁。所以此处会直到不满足while。

//	public synchronized  void withdrowMoney(double num) {
//		while (num <= money) {
//			money -= num;
//			System.out.println(Thread.currentThread().getName() + "取走" + num + "元,还剩" + money + "元");
//		}
//	}
	public synchronized boolean withdrowMoney(double num) {//调用一次只能取一次
		if (num <= money) {
			money -= num;
			System.out.println(Thread.currentThread().getName() + "取走" + num + "元,还剩" + money + "元");
			return true;
		}
		return false;
	}
}
