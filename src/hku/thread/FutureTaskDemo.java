package hku.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		FutureTask<String> task = new FutureTask<String>(new MyCallable());
		new Thread(task).start();
		if(!task.isDone()){
			System.out.println("task is not ready, please wait!");
		}
		System.out.println("task return :" + task.get());
	}
}
