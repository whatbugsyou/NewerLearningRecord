package primitive_array;
/**
 * 计算数组偶数和
 * @author Hzl
 *
 */
public class demo3 {
	public int oushuhe(int[] arr) {
		int oushu_sum = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				oushu_sum = oushu_sum+arr[i];
			}
		}
		return oushu_sum;
	}

}