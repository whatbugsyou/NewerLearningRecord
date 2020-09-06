package OOP;

import java.util.Scanner;

/**
 * 猜数游戏
 * @author Hzl
 *
 */
public class work3 {
	int num=100;
	
	public void guess(int a) {
		if(a==num) {
			System.out.println("猜中了");
			System.exit(0);
		}else if(a>num) {
			System.out.println("大了");
		}else if(a<num) {
			System.out.println("小了");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work3 a=new work3();
		Scanner scanner = new Scanner(System.in);
		int n;
		while (true) {
			n=scanner.nextInt();
			a.guess(n);
		}
	}
}
