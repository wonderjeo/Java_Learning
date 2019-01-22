package ntu.io;
import java.io.*;
public class FileWriterTester {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		try {
			String fileName = "Hello.txt";
			FileWriter writer = new FileWriter(fileName,true);
			writer.write("Hello!\n");
			writer.write("This is my first text file.\n");
			writer.write("You can see how this is done.\n");
			writer.write("输入一行中文\n");
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
