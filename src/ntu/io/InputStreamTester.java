package ntu.io;
import java.io.*;
public class InputStreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream in = new FileInputStream("Hello.txt");
			int c;
			while((c = in.read()) != -1)//读取1字节，结束返回-1
				System.out.write(c);
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
