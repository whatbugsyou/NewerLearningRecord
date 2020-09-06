package bufferedIOStream;
/**
 * 输入20个数，把最小的排在最前面输出
 */
import java.util.Scanner;

public class J1_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a =new int[20];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
			if(a[index]>a[i]) {
				index=i;
			}
		}
		int tmp=a[0];
		a[0]=a[index];
		a[index]=tmp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
