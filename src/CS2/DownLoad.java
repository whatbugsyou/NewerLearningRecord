package CS2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class DownLoad extends Thread{

	private Socket socket;
	public DownLoad(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		//socket服务端的操作
		//1.获取客户端发送过来的数据
		DataInputStream dataInputStream = null;
		FileInputStream in = null;
		OutputStream out = null;
		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			out = socket.getOutputStream();
			String filePath = dataInputStream.readUTF();
			/*File file = new File(filePath);
			if(file.exists()){
				//文件名传给客户端，
			}else{
				return;
			}*/
			//2.把文件读取到程序中
			in = new FileInputStream(filePath);
			byte [] buf = new byte[1024];
			int len ;
			while((len=in.read(buf))!=-1){
				//读取到程序中后写给客户端
				out.write(buf, 0, len);
				out.flush();
			}
			System.out.println(socket.getInetAddress().getHostName()+"：下载完毕");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				dataInputStream.close();
				in.close();
				out.close();
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
