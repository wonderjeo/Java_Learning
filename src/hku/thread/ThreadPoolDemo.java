package hku.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
	public static void main(String[] args){
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		Future<String> future = newCachedThreadPool.submit(new MyCallable());
		if(!future.isDone()){
			System.out.println("Task is not ready, please wait!");
		}
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			newCachedThreadPool.shutdown();
		}
	}
}
