package fanshe;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;

import OOP.Student;
/**
 * 给出Map数据集，内容为 （字段名：字段值）
 * 给出对象obj的class全路径
 * 要求：创建一个obj将数据集的内容加入obj
 * 
 * @author Hzl
 *
 */
public class FansheTest1 {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			HashMap<String, Object> hashMap = new HashMap<String,Object>();
			hashMap.put("studentNum", 1);
			hashMap.put("Name", "xxx");
			Class<?> clazz = Class.forName("_201935.Student");
			Object object = get(clazz,hashMap);
			System.out.println(object);
	}

	private static Object get(Class clazz, HashMap<String, Object> hashMap) throws Exception {
		// TODO Auto-generated method stub
		Object obj = clazz.newInstance();
		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
			String methodName = "set"+(key.charAt(0)+"").toUpperCase()+key.substring(1);//细节
			clazz.getMethod(methodName, Object.class);
		}
		
		return obj;
	}

}
