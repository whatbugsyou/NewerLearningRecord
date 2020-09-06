package algorithm;

import java.util.Arrays;

/**
 * ---------数组扩容
 * @author Hzl
 *1.开新空间
 *2.复制内容
 *3.地址更新
 */
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] old = new int[3];
		old[0] = 1;
		old[1] = 2;
		old[2] = 3;
		// 扩容
//		1
		int[] dest = new int[4];
//		2
		System.arraycopy(old, 0, dest, 0, old.length);
//		or
		dest = Arrays.copyOf(old, 4);
//		3
		old = dest;
		System.out.println(Arrays.toString(old));
		old[3] = 4;
		System.out.println("length=" + old.length);
	}

}
