package bufferedIOStream;
/**
 * 统计一个字符串中数字的个数
 * @author Hzl
 *
 */
public class J1_10_3 {
	public static void main(String[] args) {
		String str = new String("asdas92ssdvsdv");
		numInString(str);
	}

	private static void numInString(String str) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)<='9'&&str.charAt(i)>='0') {
				num++;
			}
		}
		System.out.println(num);
		
	}
}
