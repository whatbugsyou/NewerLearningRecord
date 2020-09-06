package string;

import java.io.UnsupportedEncodingException;

public class StringTransformTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		new String("你好".getBytes("utf-8"),"gbk");
		
	}
}
