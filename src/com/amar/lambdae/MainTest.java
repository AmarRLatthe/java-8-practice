package com.amar.lambdae;

public class MainTest {

	public static void main(String[] args) {
	
		TestLambda test = (a, b) -> a + b;
		System.out.println(test.test(10, 20));

	}

}
