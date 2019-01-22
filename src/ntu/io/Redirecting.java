package ntu.io;
import java.io.*;
public class Redirecting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("Redirecting.java"));
			PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String string;
			while((string = br.readLine()) != null)
				System.out.println(string);
			in.close();
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
