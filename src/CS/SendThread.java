package CS;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;



public class SendThread extends Thread {
	@Override
	public void run() {
		DatagramSocket datagramSocket = null;
		try {
			datagramSocket = new DatagramSocket(1999);// 端口号可写可不写
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DatagramPacket datagramPacket = null;
		InetAddress ad=null;
		try {
			ad = InetAddress.getByName(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String data = scanner.next();
			datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, ad, 9999);
			try {
				datagramSocket.send(datagramPacket);
				System.out.println("消息已发送");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
