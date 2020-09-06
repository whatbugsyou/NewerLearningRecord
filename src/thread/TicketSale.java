package thread;

public  class  TicketSale implements Runnable {

	int  ticket=1000;
	int chuangkou ;
	public synchronized boolean sale() {
		if(ticket!=0) {
			ticket--;
			System.out.println(Thread.currentThread().getName()+"卖出一张，还剩"+ticket+"张票");
			return true;
		}return false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(sale());
		System.out.println("-----------"+Thread.currentThread().getName()+"结束------------*********************************");
	}

	public TicketSale() {
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TicketSale demo = new TicketSale(1);
//		TicketSale demo2 = new TicketSale(2);
//		TicketSale demo3 = new TicketSale(3);
//		TicketSale demo4 = new TicketSale(4);
//		Thread thread = new Thread(demo);
//		Thread thread2 = new Thread(demo2);
//		Thread thread3 = new Thread(demo3);
//		Thread thread4 = new Thread(demo4);

		TicketSale ticketSale = new TicketSale();
		Thread thread5 = new Thread(ticketSale, "窗口1");
		Thread thread6 = new Thread(ticketSale, "窗口2");
		Thread thread7 = new Thread(ticketSale, "窗口3");
		Thread thread8 = new Thread(ticketSale, "窗口4");
		thread8.setPriority(10);//优先级越高 几率越高
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		
		
		
	}

}
