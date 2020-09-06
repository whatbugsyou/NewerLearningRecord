package bufferedIOStream;
/**
 * 分组算平均数，一组m个，不足m的一组,也算其平均数。
 */
import java.util.Scanner;

public class J1_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = (i + 1) * 2;
		}
		Scanner scanner = new Scanner(System.in);
		int m;
		m = scanner.nextInt();
		int time = 100/m;
		for (int i = 0; i < time; i++) {
			double average ;int sum = 0;
			for(int j=0;j<m;j++) {
				sum = a[i*m+j]+sum;
			}
			average=sum/m;
			System.out.println(average+"\t");
		}
		if(200%m!=0) {
			int rest = 100%m;double sum=0.0;
			for (int i = 0; i < rest; i++) {
				sum=sum+a[100-i-1];
			}
			System.out.println(sum/rest);
		}
	}

}
