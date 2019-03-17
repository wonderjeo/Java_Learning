package hku.thread;

public class WaitSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object lock = new Object();
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Thread A is waiting to get lock");
				synchronized(lock){
					System.out.println("Thread A get lock");
					try {
						Thread.sleep(20);
						System.out.println("Thread A do wait method");
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread A is done");
				}
			}
		}).start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Thread B is waiting to get lock");
				synchronized(lock){
					System.out.println("Thread B get lock");
					try {
						System.out.println("Thread B do sleep method 10ms");
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread B is done");
					lock.notify();
				}
			}
		}).start();
	}

}
