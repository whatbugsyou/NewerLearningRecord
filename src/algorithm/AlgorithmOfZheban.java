package algorithm;

import java.util.Arrays;

/**
 * 折半查找
 * @author Hzl
 *
 */
public class AlgorithmOfZheban {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 12, 4, 43, 5, 2, 2 };
		// 先排序
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		// 查找
		int find = 4;
		int left = 0, right = num.length - 1, mid = (left + right) / 2;
		while (!(mid == left)) {
			if (num[mid] == find) {
				System.out.println("要找的数的下标为：" + mid);
				break;
			} else if (num[mid] > find) {
				right = mid;
			} else if (num[mid] < find) {
				left = mid;
			}
			mid = (left + right) / 2;
		}
	}

}
