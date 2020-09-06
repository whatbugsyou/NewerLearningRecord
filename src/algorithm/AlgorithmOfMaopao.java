package algorithm;

/**
 * 冒泡排序
 */
import java.util.Arrays;//数组工具包

public class AlgorithmOfMaopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 3, 435, 55, 436, 263, 33, 42, 4, 5, 5 };
		System.out.println(Arrays.toString(num));
		// 循环轮数
		for (int i = 1; i < num.length; i++) {
			// 比较次数
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));
	}

}
