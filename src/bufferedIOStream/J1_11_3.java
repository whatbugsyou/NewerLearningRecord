package bufferedIOStream;

import java.util.Scanner;

public class J1_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入3个小于1000的整数");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if((a+b)>c&&(a+c)>b&&(b+c)>a) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
