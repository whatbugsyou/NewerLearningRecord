package CS2;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *  1.客户端发送需要下载的命令
	2.1服务端读取服务器本地的文件到程序中
	2.2服务端把文件回传给客户端	
	3.客户端读取读取传过来的文件
	4.客户端需要把读取的文件写入本地
 * @author Limin
 *
 */
public class Client {

	public static void main(String[] args) throws IOException  {
		
		Socket socket = null;
		try {
			socket = new Socket(InetAddress.getByName("76693426.800.si"), 80);
			System.out.println("客户端已连接");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1.客户端发送需要下载的路径   D:/a.txt
		System.out.println("输入需要下载的文件路径.......");
		Scanner sc = new Scanner(System.in);
		String filePath = sc.next();
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF(filePath);//写字符串
		
		//服务端写了文件过来，读取文件
		InputStream in = socket.getInputStream();
		OutputStream out = new FileOutputStream("/Users/Hzl/Desktop/t.txt");
		byte[] buf = new byte[1024];
		int len ;
		while((len=in.read(buf))!=-1){
			//写 到本地
			out.write(buf, 0, len);
			out.flush();
		}
		
		System.out.println("文件下载完毕！");
		in.close();
		out.close();
		dataOutputStream.close();
		socket.close();
	}
}
