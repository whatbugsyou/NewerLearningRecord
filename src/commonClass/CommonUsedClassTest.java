package commonClass;
/**
 * 
 * @author Hzl 常用类 System Runtime Math Random
 * System 类有 3 个静态成员变量，
 * 分别是 PrintStream out、InputStream in 和 。
 * 常用的方法有 arraycopy()、
 * currentTimeMillis()当前计算机时间与 GMT 时间（格林尼治时间）1970 年 1 月 1 日 0 时 0 分 0 秒所差的毫秒数、
 * exit()、gc()垃圾回收 和 getProperty()。
 */
import java.io.PrintStream;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Set;


public class CommonUsedClassTest {
	public static void main(String[] args) {
		// System
		PrintStream ps = System.out;
		Properties properties = System.getProperties();
		System.out.println(properties.toString());
		Set<Entry<Object, Object>> entrySet = properties.entrySet();//Set集合
		for (Entry<Object, Object> entry : entrySet) {
			ps.println(entry.getKey()+":"+entry.getValue());
		}
		//----------------------------------------------------------------
		int max=Math.max(10,20);
		ps.println("max(10,20)="+max);
		double sqrt =Math.sqrt(12);
		long round = Math.round(13.4);//四舍五入
		ps.println(round);
		double random=Math.random();
		ps.println(random);
		//---------------------------------------------------------------
		Random random2=new Random();
		for (int i = 0; i < 20; i++) {
			int nextInt = random2.nextInt(15);//0到14的整数 不包括15
			ps.println(nextInt);;
		}
		//---------------------------------------------------------------
		Date date = new Date();
		ps.println("1970.1.1距离现在的毫秒数\ndate.getTime()="+date.getTime());//1990.1.1距离现在的毫秒数
		ps.println("date.toString()="+date.toString());
		ps.println("小时\ndate.getHours()="+date.getHours());
		ps.println("分\ndate.getMinutes()="+date.getMinutes());
		ps.println("秒\ndate.getSeconds()="+date.getSeconds());
		ps.println("1990年开始过了多少年\ndate.getYear()="+date.getYear());
		ps.println("月从0开始\ndate.getMonth()="+date.getMonth());
		ps.println("日\ndate.getDate()="+date.getDate());
		ps.println("这个星期的第几天（从星期天为0开始）\ndate.getDay()="+date.getDay());
		ps.println("date.getTimezoneOffset()="+date.getTimezoneOffset());
		//---------------------------------------------------------------
		//　该类被abstract所修饰，说明不能通过new的方式来获得实例.
		//  对此，Calendar提供了一个类方法getInstance，以获得此类型的一个通用的对象
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
//		System.out.println(cal.+"---"+cal.DAY_OF_YEAR);
		//
		
	}
}
