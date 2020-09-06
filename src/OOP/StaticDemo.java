package OOP;
/**
 * 1⃣️stacic变量和普通变量修改
 * @author Hzl
 *
 */
public class StaticDemo extends SecurityException{
	int a;
	static int sta;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.sta=10;
		StaticDemo demo=new StaticDemo();
		demo.a=5;
	}
}
