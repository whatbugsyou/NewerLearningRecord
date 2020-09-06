package CS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 获取服务端套接字
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println(InetAddress.getLocalHost());
		System.out.println("服务器已开启");
		// 等待客户端进行连接【阻塞】
		Socket socket = serverSocket.accept();
		System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
		// 获取接收数据的流对象
		InputStream inputStream = socket.getInputStream();
		// 读取数据
		byte[] buf = new byte[1024];
		int len;
		System.out.println("服务器收到数据:");
		while ((len = inputStream.read(buf)) != -1) {
			String string = new String(buf, 0, len);
			System.out.println(string);
		}
		socket.close();
	}

}
