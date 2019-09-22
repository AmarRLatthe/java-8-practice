package com.amar.lambdae;

public class Anon implements TestLambda {

	@Override
	public int test(int i, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int something() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public static void main(String[] args) {
		System.out.println(new Anon().test2());
	}
}
