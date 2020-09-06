package bufferedIOStream;
/**
 * 求最小公倍数
 */
import java.util.Scanner;

public class J1_11_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int max = num2>num1?num2:num1;
		int bs = max;
		while(!(bs%num1==0&&bs%num2==0)) {
			bs+=max;
		}
		System.out.println(bs);
	}
}
