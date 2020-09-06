package Exam_1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎进入大大计算器：");
			System.out.println("1-加\n2-减\n3-乘\n4-除");
			int operator;
			System.out.println("请输入您的操作：");
			operator = scanner.nextInt();
			int a;
			int b;
			System.out.println("请输入两个数：");
			a = scanner.nextInt();
			b = scanner.nextInt();
			switch (operator) {
			case 1:
				System.out.println("两数相加的结果为：" + (a + b));
				break;
			case 2:
				System.out.println("两数相加的结果为：" + (a - b));
				break;
			case 3:
				System.out.println("两数相加的结果为：" + (a * b));
				break;
			case 4:
				System.out.println("两数相加的结果为：" + (a / b));
				break;
			default:
				break;
			}
			String flag;
			do {
				System.out.println("是否继续使用计算器?(Y/N)");
				flag = scanner.next();
				if (flag.equals("Y")) {
					break;
				} else if (flag.equals("N")) {
					System.out.println("退出成功");
					return;
				}
			} while (true);
		}
	}

}
