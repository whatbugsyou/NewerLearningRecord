package collection.set;
/**
 * linkedList 链表
 */
import java.util.Date;
import java.util.LinkedList;

public class LinkedListTest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.add(new Date());
		linkedList.addFirst("first");
		linkedList.addLast("last");
		linkedList.element();//返回头the head of this list
	}

}
