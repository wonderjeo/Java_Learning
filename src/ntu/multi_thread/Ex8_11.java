package ntu.multi_thread;

public class Ex8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Balls balls = new Balls();//新建一个球类对象
		Player0 p0 = new Player0(balls);//创建0号游戏者
		Player1 p1 = new Player1(balls);//创建0号游戏者
		Player2 p2 = new Player2(balls);//创建0号游戏者
		p0.start();//启动0号游戏者
		p1.start();//启动1号游戏者
		p2.start();//启动2号游戏者
	}

}
