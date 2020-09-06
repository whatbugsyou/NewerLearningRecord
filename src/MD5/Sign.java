package MD5;
import java.util.Scanner;

import MD5.MD5Util;
public class Sign {
	private static final String SALT = "Dfwbe7g4129D6wzlk7F232E8yapcgE39" ;
	static public String getSign(String mobile) {
		return MD5Util.getMD5("mobile=" + mobile + "&" + SALT);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("请输入手机号码：");
    	String mobile = sc.next();
    	String sign = Sign.getSign(mobile);
    	System.out.println("sign="+sign);
	}
}
