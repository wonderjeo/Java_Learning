package ntu.io;
import java.io.*;
public class BufferedOutputStreamTester {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String fileName = "mixedTypes.dat";
		try {
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(fileName)));
			out.writeInt(0);
			System.out.println(out.size()+" bytes have been written.");
			out.writeDouble(31.2);
			System.out.println(out.size()+" bytes have been written.");
			out.writeBytes("JAVA");;
			System.out.println(out.size()+" bytes have been written.");
			out.writeInt(0);
			System.out.println(out.size()+" bytes have been written.");
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
