package com.visam.training.testThreads;

public class TestingSync implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		add();
		subtract();
	}
	//synchronized method
	public synchronized void add() {
		for(int i=0; i<3; i++) {
			System.out.println(+i);
		}
	}
	public static synchronized void subtract() {
		for(int j=0; j<3; j++) {
			System.out.println(+j);
		}
	}
	public static void main(String args[]) {

			TestingSync obj = new TestingSync();
			TestingSync obj1 = new TestingSync();
			Thread t1 = new Thread(obj);
			//Thread t2 = new Thread(obj);
			Thread t3 = new Thread(obj1);
			//Thread t4 = new Thread(obj1);
			
			t1.start();
			//t2.start();
			t3.start();
			//t4.start();
}
}