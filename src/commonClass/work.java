package commonClass;
/**
 * Calendar
 */
import java.util.Calendar;
import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("这是一个输出某年某月日历的程序：");
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入年份");
		int year = scanner.nextInt();
		System.out.println("输入月份");
		int month = scanner.nextInt();
		scanner.close();
		calendar.set(Calendar.YEAR, year);
		// 获取这个月最后一天。1.逻辑方法
		// 2.调用方法 calendar.getActualMaximum(Calendar.DATE);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, 1);
		calendar.add(Calendar.DATE, -1);
		int length = calendar.get(Calendar.DAY_OF_MONTH);
		// 获取第一天星期
		calendar.set(Calendar.DATE, 1);
		int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		// 输出上标
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		// 输出空格
		for (int i = 0; i < firstDayOfWeek - 1; i++) {
			System.out.print(" \t");
		}
		for (int i = 0; i < length; i++) {
			if (1 == calendar.get(Calendar.DAY_OF_WEEK)) {
				System.out.println("");
			}
			System.out.print(calendar.get(Calendar.DATE) + "\t");
			calendar.add(Calendar.DATE, 1);
		}
	}

}
