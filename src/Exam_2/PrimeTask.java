package Exam_2;

public class PrimeTask implements Runnable{
	int start;
	int end;
	public PrimeTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long timeMillis = System.currentTimeMillis();
		System.out.println(start+"到"+end+"之间的质数有：");
		for(int n = start;n<=end;n++) {
			if(MathUtil.isPrime(n)) {
				System.out.println(n+" ");
			}
		}
		long timeMillis2 = System.currentTimeMillis();
		System.out.println("耗时"+(timeMillis2-timeMillis)+"毫秒");
	}

}
