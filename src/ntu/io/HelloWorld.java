package ntu.io;
import java.io.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		String greetings[] = {"hello world","No, I mean it","Hello world!!"};
		//下标越界异常为非检查型异常
		while(i<4) {
			System.out.println(greetings[i]);
			i++;
		}
	}

}
