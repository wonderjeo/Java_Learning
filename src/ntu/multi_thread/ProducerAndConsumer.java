package ntu.multi_thread;

public class ProducerAndConsumer {

	public static void main(String[] args) {
		Tickets t = new Tickets(10);//建立票对象，票总数10
		new Consumer(t).start();
		new Producer(t).start();
	}
}
