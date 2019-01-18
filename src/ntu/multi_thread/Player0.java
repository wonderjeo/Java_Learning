package ntu.multi_thread;

public class Player0 extends Thread {

	private Balls balls;
	public Player0(Balls balls) {
		this.balls = balls;
	}
	public void run() {
		while(true) {
			while(balls.flag1 == true) {};//如果1号球已被拿走，则等待
			balls.flag1 = true;//拿起1号球
			while(balls.flag0 == true) {};//如果0号球已被拿走，则等待
			if(balls.flag1 == true && balls.flag0 == false) {
				balls.flag0 = true;//拿起0号球
				System.out.println("Player0 has got two balls!");
				balls.flag1 = false;//放下1号球
				balls.flag0 = false;//放下0号球
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
