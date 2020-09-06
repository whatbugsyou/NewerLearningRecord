package Exam_1;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个字符串:");
		String s = scanner.next();
		calcaeiou(s);
	}

	private static void calcaeiou(String s) {
		// TODO Auto-generated method stub
		int a=0,e=0,i=0,o=0,u=0;
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			switch (ch) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				break;
			}
		}
		System.out.println("a:"+a);
		System.out.println("e:"+e);
		System.out.println("i:"+i);
		System.out.println("o:"+o);
		System.out.println("u:"+u);
		
	}

}
