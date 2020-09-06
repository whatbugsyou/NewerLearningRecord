package bufferedIOStream;
/**
 * 录入手机号
 * 
 * @author Hzl
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class J_12_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str = bufferedReader.readLine();
		int num = 0;
		int flag = 1;//上一个是否是空白 初始化是
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			if(b!=' '&&flag==1) {  //如果上一个是空白，现在这一个不是，则发现一个新号码。如果上一个是字母，这一个也是字母，则为同一个号码
				num++;
				flag=0;
			}
			if (b==' ') { //遇到空格
				flag=1;
			}
		}
		System.out.println(num);
	}

}
