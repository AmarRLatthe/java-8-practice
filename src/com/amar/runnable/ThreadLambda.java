package com.amar.runnable;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		r.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}
