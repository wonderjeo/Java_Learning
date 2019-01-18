package ntu.runnable;

public class SellTickets implements Runnable {

	private int tickets = 200;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(tickets>0) {
			System.out.println(Thread.currentThread().getName()+
					"is selling tickets "+tickets--);
		}
	}

}
