package ntu.thread;

public class FactorialThreadTester {

	public static void main(String[] args) {
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10);
		thread.start();//自动进入run()方法
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread ends");
	}
}
