package ntu.runnable;

public class TestThreadTester {

	public static void main(String[] args) {
		//创建并命名线程
		TestThread thread1 = new TestThread();
		TestThread thread2 = new TestThread();
		TestThread thread3 = new TestThread();
		System.out.println("Starting threads");
		new Thread(thread1,"thread1").start();//启动线程1
		new Thread(thread2,"thread2").start();//启动线程1
		new Thread(thread3,"thread3").start();//启动线程1
		
		System.out.println("Threads started, main thread ends\n");
	}
}
