package ntu.io;
import java.io.*;
public class BufferedWriterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "newHello.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
			out.write("Hello!");
			out.newLine();
			out.write("This is another text file using BufferedWriter.");
			out.newLine();
			out.write("So I can use a common way to start a new line");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
