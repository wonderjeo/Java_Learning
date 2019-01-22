package ntu.io;
import java.io.*;
public class CopyMaker {

	String sourceName, destName;
	BufferedReader source;
	BufferedWriter dest;
	String line;
	
	private boolean openFiles() {
		try {
			source = new BufferedReader(new FileReader(sourceName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dest = new BufferedWriter(new FileWriter(destName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	private boolean copyFiles() {
		try {
			line = source.readLine();
			while(line != null) {
				dest.write(line);
				dest.newLine();
				line = source.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	private boolean closeFiles() {
		try {
			source.close();
			dest.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public boolean copy(String src, String dst) {
		sourceName = src;
		destName = dst;
		return openFiles()&&copyFiles()&&closeFiles();
	}
}
