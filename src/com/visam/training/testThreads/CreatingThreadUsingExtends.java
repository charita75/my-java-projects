package com.visam.training.testThreads;

public class CreatingThreadUsingExtends extends Thread {
	

@Override
public void run() {
	System.out.println("My thread started");
	
}
public static void main(String args[]) {
	CreatingThreadUsingExtends cthread = new CreatingThreadUsingExtends();
	cthread.start();
	
}
}
