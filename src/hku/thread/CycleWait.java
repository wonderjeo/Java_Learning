package hku.thread;

public class CycleWait implements Runnable{
	private String value;
	public void run(){
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value = "we have data now";
	}
	
	public static void main(String[] args){
		CycleWait cw = new CycleWait();
		Thread t = new Thread(cw);
		t.start();
//		while(cw.value == null){
//			try {
//				Thread.currentThread().sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("value: " + cw.value);
	}

}
