package Exam_1;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入矩阵长度：");
		n = scanner.nextInt();
		printRec(n);
	}

	private static void printRec(int n) {
		// TODO Auto-generated method stub
		if (n <= 0) {
			System.out.println("输入错误");
		} else {
			StringBuffer s1 = new StringBuffer();
			StringBuffer s2 = new StringBuffer();
			for (int i = 0; i < n; i++) {
				s1.append('*');
				s2.append(' ');
			}
			s2.setCharAt(0, '*');
			s2.setCharAt(n - 1, '*');
			for (int i = 0; i < n; i++) {
				if (i == 0 || i == n - 1) {
					System.out.println(s1);
				} else {
					System.out.println(s2);
				}
			}
		}
	}

}
