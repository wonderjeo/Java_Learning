package ntu.io;
import java.io.*;
public class FileOutputStreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "data1.dat";
		int value = 255, value1 = 0, value2 = -1;
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
			out.writeInt(value);
			out.writeInt(value1);
			out.writeInt(value2);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
