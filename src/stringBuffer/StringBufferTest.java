package stringBuffer;
/**
 * StringBuffer类  线程安全的Synchronize  
 * StringBuilder类 非线程安全 单线程用 效率高
 * @author Hzl
 *
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();//supper(16)基础容量16
		StringBuffer buffer2 = new StringBuffer(10);	
		StringBuffer buffer3 = new StringBuffer("asdasw2");
		StringBuilder  biulder =new StringBuilder("asd");
		biulder.append("a");
		//返回this,链式反应
		buffer3.append("sssss").append("qqqqqasdhasu dhhhhhhhhhh").append(true).append(22);
		System.out.println(buffer3.toString());

	}
} 
