package algorithm;
/**
 * 1⃣️数据
 * a基本数据类型 b引用数据类型
 * a整形、浮点型、字符型、布尔型 b数组
 * 2⃣️内存
 * 栈：存局部变量 
 * 堆：成员变量、全局变量（对象创建后，属性变量存于堆，但是对象本身是个局部变量，存放类new在堆中堆地址）
 * 方法区：运行的代码，stacic变量，常量
 * 3⃣️
 * a存于栈 b存于堆
 * new在堆中的内存里对象额外存放了它的this指针
 * 4⃣️
 * 遍历foreach for(定义变量：被遍历的变量){} 用于数组
 * @author Hzl
 *
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] rainNum_1week = new double[] {1,2,3,4,5,6,7};
		double [] rainNum_2week = {1,2,3,4,5,6,7};
		double [] rainNum_3week =new double[1];
		rainNum_3week[0]=1;
		for (double d : rainNum_1week) {
			System.out.println(d);
		}
		for (int i = 0; i < rainNum_2week.length; i++) {
			System.out.println(rainNum_2week[i]);
		}
	}

}
