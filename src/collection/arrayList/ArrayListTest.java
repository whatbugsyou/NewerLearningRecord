package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("a", 1, "男", 12, 100);
		Student student2 = new Student("b", 2, "男", 221, 90);
		Student student3 = new Student("c", 3, "男", 343, 80);
		Student student4 = new Student("d", 4, "男", 23, 70);
		ArrayList arrayList = new ArrayList();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		Iterator iterator = arrayList.iterator();

		int sum = 0;
		int average = 0;
		int max = student1.getScore();
		int min = student1.getScore();
		while (iterator.hasNext()) {
			Student s = (Student) iterator.next();
			sum += s.getScore();
			if (max < s.getScore()) {
				max = s.getScore();
			}
			if (min > s.getScore()) {
				min = s.getScore();
			}
		}
		average = sum / arrayList.size();
		System.out.println("总分：" + sum + "平均分：" + average + "最高分：" + max + "最低分：" + min);
	}

}
