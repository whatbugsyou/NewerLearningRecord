package fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Class c = Test.class.getClassLoader().loadClass("fanshe.FansheTest2");
		Class c = Class.forName("fanshe.FansheTest2");
		Field b= c.getField("b");
		Object object =b.get(c);
		Method a= object.getClass().getMethod("a");
		a.invoke(object);
		System.out.println(object);
		System.out.println(fanshe.FansheTest2.b);
	
	}
	
}

