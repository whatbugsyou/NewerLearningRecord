package CS;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		//总共如下几句，添加了异常处理
//		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
//		System.out.println("客户端已连接到服务器"+socket.getInetAddress().getHostName());
//		OutputStream outputStream = socket.getOutputStream();
//		outputStream.write("mnbmnbkf".getBytes());
//		System.out.println("消息已发送");
//		socket.close();
		Socket socket = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(), 9999);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("客户端已连接到服务器"+socket.getInetAddress().getHostName());
		OutputStream outputStream = null;
		try {
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outputStream.write("mnbmnbkf".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("消息已发送");
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}