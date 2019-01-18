package ntu.runnable;

import ntu.thread.FactorialThread;

public class FactorialThreadTester {
	public static void main(String[] args) {
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10);
		new Thread(thread).start();//自动进入run()方法
		
		System.out.println("main thread ends");
	}
}
