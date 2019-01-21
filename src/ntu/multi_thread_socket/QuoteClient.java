package ntu.multi_thread_socket;
import java.io.*;
import java.net.*;
public class QuoteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=1)
		{
			System.out.println("Usage:java QuoteClient <hostname>");
			return;
		}
		try {
			DatagramSocket socket = new DatagramSocket();
			//send request
			byte[] buf = new byte[256];
			InetAddress address = InetAddress.getByName(args[0]);
			DatagramPacket packet = new DatagramPacket(buf, buf.length,address,4445);
			socket.send(packet);
			//get response
			packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			//display response
			String received = new String(packet.getData());
			System.out.println("Quote of the Moment:"+received);
			socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
