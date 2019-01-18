package ntu.runnable;

public class ShareTargetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThread threadobj = new TestThread();
		System.out.println("Starting threads");
		
		new Thread(threadobj,"Thread1").start();
		new Thread(threadobj,"Thread2").start();
		new Thread(threadobj,"Thread3").start();
		
		System.out.println("Threads started, main ends\n");
	}

}
