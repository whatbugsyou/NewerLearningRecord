package map;
/**
 * Map 
 * 	HashMap key值不能重复	   key值可以存null 	线程不安全 
 * 	HashTable key值不能重复 通过hash表去重 不可以存null 线程安全
 * 
 * @author Hzl
 *
 */
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;


public class MapTest {
	public static void main(String[] args) {
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put(null, null);
		hashMap.put("key", "value");
		hashMap.keySet();
		hashMap.values();
		hashMap.containsKey(null);
		hashMap.get("key");
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
