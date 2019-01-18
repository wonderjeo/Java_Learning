package ntu.thread;

public class ThreadSleepTester {

	public static void main(String[] args) {
		//创建并命名线程
		TestThread thread1 = new TestThread("Thread 1");
		TestThread thread2 = new TestThread("Thread 2");
		TestThread thread3 = new TestThread("Thread 3");
		System.out.println("Starting threads");
		thread1.start();//启动线程1
		thread2.start();//启动线程2
		thread3.start();//启动线程3
		System.out.println("Threads started, main thread ends\n");
	}
}
