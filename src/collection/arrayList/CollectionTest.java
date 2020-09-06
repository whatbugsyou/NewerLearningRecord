package collection.arrayList;
/**
 * Collection-List\Set Map Iterator
 * List：有顺序，可以重复  线程不安全 效率高 Vector ：线程安全 效率低
 * 增	add(obj)
 * 		add(index,obj)
 * 		addAll()
 * 查	size()
 * 		get(index)
 *      indexOf()
 * 		iterator()
 * 		contains() 包含
 * 		indexOf()
 * 		isEmpty()
 *删 	remove()
 *改		set(index,obj)
 *   ArrayList 底层数组实现，数组扩容。查找快、增删慢 
 *   LinkedList底层链表实现，查找慢，增删快。
 * 
 * Set：无顺序，不可以重复 HashSet 
 * Map：k-value 键值对 通过key寻找value 一个key对应一个value
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Hzl
 *
 */
public class CollectionTest {
	public static void main(String[] args) {
		//ArrayList 实现了List接口，多态写法
		List arrayList = new ArrayList();//默认存放Object数组，引用类型
		arrayList.add(12);//自动装箱
		arrayList.add(0, "sad");
		//把List中的内容加入List,参数是Collection。直接用add将把另一List看作一个Object则加入的是地址
		arrayList.addAll(arrayList);
		System.out.println(arrayList);
		arrayList.size();//对象个数
		arrayList.get(0);//index处对象
		arrayList.remove(0);//删除index处对象 也可以remove(new Interge(12))删除指定对象
		arrayList.set(0, new String("而为"));//修改index处对象
		//迭代器
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
		
		
	}
}
