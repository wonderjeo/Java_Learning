package ntu.runnable;

public class TestThread implements Runnable {
	private int sleepTime;
	public TestThread() {
		sleepTime = (int)(Math.random()*6000);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(
					Thread.currentThread().getName()+" going to sleep for "+sleepTime);
			Thread.sleep(sleepTime);//线程休眠
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"finished");
	}

}
