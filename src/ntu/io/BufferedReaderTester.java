package ntu.io;
import java.io.*;
public class BufferedReaderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "Hello.txt", line;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
