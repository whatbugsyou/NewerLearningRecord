package CS;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class UDPTest {

	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
		InetAddress localHost = null;
		try {
			localHost = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("我的ip："+localHost.getHostAddress()+"名字"+localHost.getHostName());
		ReceiveThread receiveThread = new ReceiveThread();
		SendThread sendThread = new SendThread(); 
		sendThread.start();
		receiveThread.start();
	}

}
