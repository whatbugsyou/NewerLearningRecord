package primitive_array;
/**
 * 1⃣️数组最大数
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11,33,22};
		int one = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (one < nums[i]) {
				one = nums[i];
			}
		}
		System.out.println("最大数："+one);
	}

}
