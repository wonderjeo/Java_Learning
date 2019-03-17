package hku.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
	public String call() throws Exception{
		String value = "test";
		System.out.println("Ready to work");
		Thread.currentThread().sleep(5000);
		return value;
	}
}
