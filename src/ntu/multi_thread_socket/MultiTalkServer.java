package ntu.multi_thread_socket;
import java.io.*;
import java.net.*;
public class MultiTalkServer {

	static int clientNum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		boolean listening = true;
		try {
			serverSocket = new ServerSocket(4700);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(listening)
			{
				new ServerThread(serverSocket.accept(),clientNum).start();
				clientNum++;
			}
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
