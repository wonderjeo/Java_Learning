package ntu.runnable;

public class FactorialThread implements Runnable {

	private int num;
	public FactorialThread(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
