package ntu.multi_thread;

public class Player1 extends Thread {

	private Balls balls;
	public Player1(Balls balls) {
		this.balls = balls;
	}
	public void run() {
		while(true) {
			while(balls.flag0 == true) {};//如果0号球已被拿走，则等待
			balls.flag0 = true;//拿起0号球
			while(balls.flag2 == true) {};//如果2号球已被拿走，则等待
			if(balls.flag0 == true && balls.flag2 == false) {
				balls.flag2 = true;//拿起2号球
				System.out.println("Player1 has got two balls!");
				balls.flag0 = false;//放下0号球
				balls.flag2 = false;//放下2号球
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
