package primitive_array;
/**
 * 1⃣️修改后保存！
 * 2⃣️ 控制台录入
 * 3⃣️ 异常处理 try catch
 * 4⃣️ 奇偶数和
 */
import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		System.out.println("*********请输入数组：");
			int n=0;
			String Y_or_N="Y";
			int[] arr_0=new int[100];
			//请输入第一个数
			//是否继续（Y/N）
			
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			while(!Y_or_N.equals("N")) {
				System.out.println("请输入第"+n+"个数:(输入N结束)");
				try {
					n++;
					arr_0[n-1]=sc.nextInt();
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println("输入结束");
					n--; //错误的时候 会录入0，应当除去这个数据。
					Y_or_N=sc.next();
					System.out.println(n);
				}
			}
			
	//	int[] arr_0= {1,100,3,113,123,4345,32,13,34,65};
		int max=arr_0[0];
		int min=arr_0[0];
		int jishu_num=0;
		int oushu_num=0;
		for (int i = 0; i < n; i++) {
			if(arr_0[i]%2==0) {
				oushu_num++;
			}else {
				jishu_num++;
			}
			if(max<arr_0[i]) {
				max=arr_0[i];
			}
			if(min>arr_0[i]) {
				min=arr_0[i];	
			}
		}
		System.out.println("最大值="+max+"  最小值="+min+"   偶数个数="+oushu_num+"   奇数个数="+jishu_num);
		
		demo3 work_1=new demo3();
		int sum=work_1.oushuhe(arr_0);
		System.out.println("偶数和="+sum);
		
	}
}
