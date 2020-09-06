package collection.set;
/**
 * 哈希表 散列表
 * Object 有方法 hashCode equals 
 * HashSet去重 ：
 * 先equals 不等则添加，相等，则比较HashCode,不等则添加，相等,则重复.？？2019 9 19 ？？先hash再equal 2019 9 21
 * equals中 首先判断null 其次判断类型 instanceof ,强转类型,再判断内容。
 * HashSet 数据存放在HashMap，key存放数据内容，value默认都是存放static object PRESENT
 */
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("阿是大事");
		hashSet.add("阿是大");
		hashSet.add("阿是事");
		hashSet.add("阿大事");
		hashSet.add("阿大事");
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
