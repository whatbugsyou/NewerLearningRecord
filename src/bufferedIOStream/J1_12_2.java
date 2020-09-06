package bufferedIOStream;

import java.util.Scanner;

public class J1_12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] num = new char[11];
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;//是否循环标志
		do {
			System.out.println("请输入11位手机号码,第一位为1，第二位为358之一");
			String s = scanner.nextLine();
			if (s.length() != 11) {
				System.out.println("输入手机号长度错误");
			} else {
				num = s.toCharArray();
				if (!(num[0] == '1' && num[1] == '3' || num[1] == '5' || num[1] == '8')) {
					System.out.println("输入的不是手机号");
				} else {
					flag = false;
				}
			}
		} while (flag);//true则继续循环

		if (is5lian(num)) {
			System.out.println("是5连号");
		} else {
			System.out.println("不是5连号");
		}

	}

	private static boolean is5lian(char[] num) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int i = 0; i < 4; i++) {// 比较次数
			if (num[11 - i - 1] != num[11 - i - 2]) {
				flag = false;
			}
		}
		return flag;
	}
}
