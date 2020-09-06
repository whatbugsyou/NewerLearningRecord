package bufferedIOStream;

import java.util.Scanner;

/**
 * 统计字符串里非数字字符个数
 * 
 * @author Hzl
 *
 */
public class J1_12_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = scanner.nextLine();
		System.out.println("其中非数字字符的个数"+calcNotNum(str));
	}

	private static int calcNotNum(String str) {
		// TODO Auto-generated method stub
		int num=0;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(c>'9'||c<'0') {
				num++;
			}
		}
		return num;
	}

	
}
