package ntu.multi_thread_socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class QuoteServerThread extends Thread {
	protected DatagramSocket socket = null;
	protected BufferedReader in = null;
	protected boolean moreQuote = true;
	
	public QuoteServerThread() throws IOException{
		this("QuoteServerThread");
	}

	public QuoteServerThread(String name) throws IOException {
		// TODO Auto-generated constructor stub
		super(name);
		socket = new DatagramSocket(4445);
		try {
			in = new BufferedReader(new FileReader("one-liners.txt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No file found");
		}
	}
	
	public void run() {
		while(moreQuote) {
			byte[] buf = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			try {
				socket.receive(packet);
				String dString = null;
				if(in == null)
					dString = new Date().toString();
				else
					dString = getNextQuote();
				buf = dString.getBytes();
				//send the response to the client at 'address' and 'port'
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buf, buf.length,address,port);
				socket.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			socket.close();
		}
	}

	protected String getNextQuote() {
		// TODO Auto-generated method stub
		String returnValue = null;
		try {
			if((returnValue = in.readLine()) == null)
			{
				in.close();
				moreQuote = false;
				returnValue = "No more quotes.Goodbye";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnValue;
	}

}
