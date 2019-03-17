package hku.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SyncThread implements Runnable{
	public void run(){
		String threadName = Thread.currentThread().getName();
		if(threadName.startsWith("A")){
			async();
		}
		else if(threadName.startsWith("B")){
			syncObjectBlock1();
		}
		else if(threadName.startsWith("C")){
			syncObjectMethod1();
		}
	}
	
	//异步方法
	private void async(){
		System.out.println(Thread.currentThread().getName() + "_Async_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "_Async_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
	//同步代码块 synchronized(this|object){}
	private void syncObjectBlock1(){
		System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		synchronized(this){
			System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		}
	}
	//synchronized修饰非静态方法
	private synchronized void syncObjectMethod1(){
		System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
}
