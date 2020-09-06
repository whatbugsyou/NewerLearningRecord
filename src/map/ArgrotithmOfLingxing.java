package map;

import java.util.Scanner;

public class ArgrotithmOfLingxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入菱形大小（奇数）:");
		int line = scanner.nextInt();
		while (line % 2 == 0) {
			System.out.println("输入不符合要求,请重新输入");
			line = scanner.nextInt();
		}
		int midleline = line / 2 + 1;
		int blankNum = 0;
		int starNum = 0;
		for (int i = 1; i <= line; i++) {
			if (i < midleline) {
				blankNum = midleline - i;
			} else if (i > midleline) {
				blankNum = i - midleline;
			} else {
				blankNum = 0;
			}
			starNum = (midleline - blankNum) * 2 - 1;
			for (int j = 0; j < blankNum; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starNum; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
