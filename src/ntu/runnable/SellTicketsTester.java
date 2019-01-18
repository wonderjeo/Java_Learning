package ntu.runnable;

public class SellTicketsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellTickets sellTickets = new SellTickets();
		new Thread(sellTickets,"Thread1").start();;
		new Thread(sellTickets,"Thread2").start();;
		new Thread(sellTickets,"Thread3").start();;
		
	}
}
