package CS;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveThread extends Thread {
	@Override
	public void run() {
		byte[] buf = new byte[2];
		DatagramSocket datagramSocket = null;
		try {
			datagramSocket = new DatagramSocket(9999);
			System.out.println("接收端已开启");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		while(true) {
			DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
			try {
				datagramSocket.receive(datagramPacket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("接收端收到来自"+datagramPacket.getAddress()+"的消息："+new String(buf,0,datagramPacket.getLength())+",端口号"+datagramPacket.getPort());
		}
	}
}	
