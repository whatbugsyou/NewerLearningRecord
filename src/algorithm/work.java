package algorithm;
/**
 * 代码右移 tab ， 左移动 shift+tab 
 * 代码选中->右键->Refactor->Extract Method （用代码区创建方法）
 */
import java.util.Arrays;

/*
 * 1.方法：在后面加一个数
 * 2.方法：在i处加数n
 * 3.方法：把i处改成n
 * 4.方法：删除i
 */
public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4 };
		System.out.println("原数组a：" + Arrays.toString(a));
//		1
		a = Add_n(a, 565);
		System.out.println("a：" + Arrays.toString(a));
//		2
		a = Add_n_in_i(a, 4, 34);
		System.out.println("a：" + Arrays.toString(a));
//		3
		a[2] = 0;
		System.out.println("修改索引2位置元素为0");
		System.out.println("a：" + Arrays.toString(a));
//		4
		a = delete_in_i(a, 1);
		System.out.println("a：" + Arrays.toString(a));
	}

//1
	private static int[] Add_n(int[] a, int b) {
		// TODO Auto-generated method stub
		int[] c = new int[a.length + 1];
		c = Arrays.copyOf(a, c.length);
		c[c.length - 1] = b;
		System.out.println("在数组后面加元素" + b);
		return c;
	}

//2
	private static int[] Add_n_in_i(int[] a, int i, int b) {
		// TODO Auto-generated method stub
		if (i > a.length - 1) {
			System.out.println("下标越界");
			System.exit(0);// 非零数表示非正常结束a nonzero status code indicates abnormal termination
		}
		int[] c = new int[a.length + 1];
		for (int j = 0; j < i; j++) {
			c[j] = a[j];
		}
		for (int j = i + 1; j < c.length; j++) {
			c[j] = a[j - 1];
		}
		c[i] = b;
		System.out.println("在索引" + i + "位置加元素" + b);
		return c;
	}

//3
	private static int[] delete_in_i(int[] a, int i) {
		// TODO Auto-generated method stub
		int[] c = new int[a.length - 1];
		for (int j = 0; j < i; j++) {
			c[j] = a[j];
		}
		for (int j = i + 1; j < c.length; j++) {
			c[j] = a[j + 1];
		}
		System.out.println("删除索引" + i + "位置的元素");
		return c;
	}
}
