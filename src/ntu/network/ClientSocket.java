package ntu.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 2000);
			//键盘输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//网络输出流
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			//网络输入流
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline=sin.readLine();//从键盘读入数据
			while(!readline.equals("bye"))
			{
				os.println(readline);
				os.flush();//发送数据
				System.out.println("Client:"+readline);
				System.out.println("Server:"+is.readLine());
				readline = sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
