package collection.set;
/**
 * TreeSet 二叉树 ,默认左大右小。
 * 存入的数据类型需要implements comparable接口,compareTo方法,不然会报错classCastException
 * @param args
 */
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
		treeSet.add(1);
		treeSet.add(1231);
		treeSet.add(134);
		treeSet.add(14);
		TreeSet treeSet2 = new TreeSet<Student>();
		treeSet2.add(new Student(123));
		treeSet2.add(new Student(34));
		treeSet2.add(new Student(35));
		treeSet2.add(new Student(234));
		System.out.println(treeSet);//自动排序
		System.out.println(treeSet2);//按分数排序
	}

}
