package ntu.multi_thread;

public class Player2 extends Thread {

	private Balls balls;
	public Player2(Balls balls) {
		this.balls = balls;
	}
	public void run() {
		while(true) {
			while(balls.flag2 == true) {};//如果2号球已被拿走，则等待
			balls.flag2 = true;//拿起2号球
			while(balls.flag1 == true) {};//如果1号球已被拿走，则等待
			if(balls.flag2 == true && balls.flag1 == false) {
				balls.flag1 = true;//拿起1号球
				System.out.println("Player2 has got two balls!");
				balls.flag2 = false;//放下2号球
				balls.flag1 = false;//放下1号球
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
