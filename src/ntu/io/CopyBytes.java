package ntu.io;
import java.io.*;
public class CopyBytes {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataInputStream in;
		DataOutputStream out;
		String src = "mixedTypes.dat";
		String dst = "data1.dat";

		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dst)));
			
			int data;
			
			try {
				while(true) {
					data = in.readUnsignedByte();
					out.writeByte(data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				out.close();
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
