package ntu.multi_thread_socket;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
public class ServerThread extends Thread {

	Socket socket = null;
	int clientNum;
	public ServerThread(Socket socket, int num) {
		this.socket = socket;
		clientNum = num + 1;
	}
	public void run() {
		String line;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client"+clientNum+":"+is.readLine());
			line = sin.readLine();
			while(!line.equals("bye")) {
				os.println(line);
				os.flush();
				System.out.println("Server:"+line);
				System.out.println("Client:"+clientNum+":"+is.readLine());
				line = sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
