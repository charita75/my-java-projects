package com.visam.training.testThreads;

public class ThreadCreation implements Runnable{
	
	
	@Override
	public void run() {
		System.out.println("My thread implementation");
		Thread cthread = Thread.currentThread();
		System.out.println(cthread);
	}
		
	public static void main(String args[]) throws InterruptedException {
		ThreadCreation tc = new ThreadCreation();
		Thread th = new Thread(tc);
		Thread th1 = new Thread(tc);
		th.start();
		th.sleep(1000);
		th1.start();
		
	}
	
}
