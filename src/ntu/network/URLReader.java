package ntu.network;

import java.net.*;
import java.io.*;

public class URLReader {

	public static void main(String[] args) throws Exception{
		URL cs = new URL("https://www.bilibili.com/");
		BufferedReader in =  new BufferedReader(new
				InputStreamReader(cs.openStream()));
		String inputLine;
		while((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}
