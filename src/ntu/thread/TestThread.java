package ntu.thread;

public class TestThread extends Thread {

	private int sleepTime;
	public TestThread(String name) {
		super(name);
		sleepTime = (int)(Math.random()*6000);
	}
	public void run() {
		try {
			System.out.println(
					getName()+" going to sleep for "+sleepTime);
			Thread.sleep(sleepTime);//线程休眠
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"finished");
	}
}
