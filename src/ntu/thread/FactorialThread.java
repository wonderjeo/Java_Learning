package ntu.thread;

public class FactorialThread extends Thread {

	private int num;
	public FactorialThread(int num) {
		this.num = num;
	}
	
	public void run() {
		int i = num;
		int rst = 1;
		System.out.println("new thread started");
		while(i>0) {
			rst = rst*i;
			i--;
		}
		System.out.println("The factorial of "+num+" is "+rst);
		System.out.println("new thread ends");
	}
}
