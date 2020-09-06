package fanxing;
/**
 * 反射越过泛型检查
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import OOP.Student;

public class fanshe {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//定义Integer数组对象
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		list.add(1);
		//获取方法
		Class class1= list.getClass();
		Method method = class1.getDeclaredMethod("add",Object.class);
		//添加String
		method.invoke(list,"sada");
		//添加Student对象
		Student student = new Student(18, "黄真亮");
		method.invoke(list, student);
		//输出
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
	}

}
