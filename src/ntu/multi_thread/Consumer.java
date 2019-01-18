package ntu.multi_thread;

public class Consumer extends Thread {

	Tickets tickets = null;
	public Consumer(Tickets tickets) {
		this.tickets = tickets;
	}
	public void run() {
		while(tickets.i <= tickets.size)
			tickets.sell();
	}
}
