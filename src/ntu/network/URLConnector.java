package ntu.network;
import java.net.*;
import java.io.*;
public class URLConnector {

	public static void main(String[] args) {
		try {
			URL cs = new URL("http://www.sina.com/");
			URLConnection tc = cs.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(tc.getInputStream()));
			String inputLine;
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
