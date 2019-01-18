package ntu.multi_thread;

public class Producer extends Thread {

	Tickets tickets = null;
	public Producer(Tickets tickets) {
		this.tickets = tickets;
	}
	public void run() {
		while(tickets.number < tickets.size)
			tickets.put();
	}
}
