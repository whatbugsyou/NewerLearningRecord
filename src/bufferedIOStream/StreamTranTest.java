package bufferedIOStream;
/**
 * 转换流
 * 字节流转成字符流 某时只能获得字节流（比如控制台输入） 但是流实际字符流形式的。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamTranTest {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		Reader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		bufferedReader.readLine();
		
	}
}
