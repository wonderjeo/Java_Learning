package ntu.io;
import java.io.*;
public class DataInputStreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "data1.dat";
		int sum = 0;
		
		try {
			DataInputStream in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(fileName)));
			try {
				while(true)
					sum += in.readInt();
			} catch (Exception e) {
				System.out.println("The sum is "+sum);
				in.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
