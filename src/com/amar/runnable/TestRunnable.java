package com.amar.runnable;

public class TestRunnable {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		t.run();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}
