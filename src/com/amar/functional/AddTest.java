package com.amar.functional;

public class AddTest {

	public static void main(String[] args) {
		InterfAdd add = (a, b) -> System.out.println("Sum of a, b is : " +(a + b));
		add.add(10, 10);
		add.add(100, 200);
	}
}

