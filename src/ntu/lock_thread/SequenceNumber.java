package ntu.lock_thread;

public class SequenceNumber {

	//1.ͨ�������ڲ��า��ThreadLocal��initialValue()������ָ����ʼֵ
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	public int getNextNum(){
		//2.��ȡ��һ������ֵ
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
	public static void main(String[] args){
		SequenceNumber sn = new SequenceNumber();
		//3.3���̹߳���sn�����Բ������к�
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
		
	}
	private static class TestClient extends Thread{
		private SequenceNumber sn;
		public TestClient(SequenceNumber sn){
			this.sn = sn;
		}
		public void run(){
			for(int i = 0; i < 3 ; i ++)
				System.out.println("Thread["+Thread.currentThread().getName()+"] sn["+sn.getNextNum()+"]");
		}
	}
}
