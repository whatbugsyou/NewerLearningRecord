package Exam_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(8);
		int start ,end;
		final int yi = 100000000;
		for(int i=0;i<8;i++) {
			start=i*yi+1;
			end=yi*(i+1);
			pool.execute(new PrimeTask(start, end));
		}
		pool.shutdown();
	}
}
