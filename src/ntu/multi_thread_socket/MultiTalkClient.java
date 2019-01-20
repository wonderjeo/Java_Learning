package ntu.multi_thread_socket;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
public class MultiTalkClient {

	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket socket = new Socket("127.0.0.1", 4700);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline = sin.readLine();
			while(!readline.equals("bye")) {
				os.println(readline);
				os.flush();
				System.out.println("CLient:"+readline);
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
