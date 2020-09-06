package threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//返回 ThreadPoolExecutor--继承于AbstracExcutorService--实现了ExecutorService接口
		 ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//		 ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
//		 ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		 Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("-----");
			}
		};
		//newCachedThreadPool.execute(runnable);
		newCachedThreadPool.shutdown();
		
		 ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3);
		/**
		 *  scheduleAtFixedRate(Runnable command, 任务
                 long initialDelay, 			执行前间隔时间
                 long period,					两个连续线程之间的间隔时间。上个线程开始到这个线程开始
                 TimeUnit unit);				
		 */
		 newScheduledThreadPool.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);//会不停的执行
//		 newScheduledThreadPool.schedule(command, delay, unit)  //推迟执行
		 //newScheduledThreadPool.shutdownNow();//返回没有被执行的任务
		 /**
		  * delay 上个线程执行完毕后等待时间。
		  */
//		 newScheduledThreadPool.scheduleWithFixedDelay(command, initialDelay, delay, unit)
		 ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(10);
		 ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 5, TimeUnit.SECONDS, arrayBlockingQueue);
		 //threadPoolExecutor.execute(runnable);
		 threadPoolExecutor.shutdown();
	}

}
