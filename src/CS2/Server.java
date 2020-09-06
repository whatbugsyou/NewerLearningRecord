package CS2;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.获取需要下载的路径
 * 2、根据路径读取文件
 * @author Limin
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket  ss = new ServerSocket(9999);
		System.out.println("服务器开启.........");
		while(true){
			Socket socket = ss.accept();
			System.out.println(socket.getInetAddress().getHostName());
			new DownLoad(socket).start();
		}
		
	}
	
}


