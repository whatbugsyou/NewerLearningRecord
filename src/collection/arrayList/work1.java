package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker worker = new Woker("zhang3", 18, 3000);
		Woker worker2 = new Woker("li4", 25, 3500);
		Woker worker3 = new Woker("wang5", 22, 3200);
		List list =new ArrayList();
		list.add(worker);
		list.add(worker2);
		list.add(worker3);
		int index=list.indexOf(worker2);
		list.add(index, new Woker("zhao6",24,3300));
		list.remove(worker3);
		for (int i = 0; i <list.size(); i++) {
			Woker w=(Woker)list.get(i);
			System.out.println("姓名"+w.getName()+"年龄"+w.getAge()+"工资"+w.getSalary());
		}
		

	}

}
