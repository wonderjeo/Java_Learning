package ntu.multi_thread;

public class Tickets {

	int number = 0;//存票序号
	int i = 0;//销售票号
	int size;//总票数
	boolean available = false;//表示目前是否有票可售
	public Tickets(int size) {
		this.size = size;
	}
	public synchronized void put() {
		if(available)//如果还有存票，则存票线程等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Producer puts ticket"+(++number));
		available = true;
		notify();//存票后唤醒售票线程开始售票
	}
	
	public synchronized void sell() {
		if(!available)//如果没有存票，则售票线程等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Consumer buys ticket"+(number));
		available = false;
		notify();//售票后唤醒存票线程开始存票
		if(number == size)
			number = size + 1;//在售完最后一张票后，设置一个结束标志，number>size表示售票结束
	}
}
