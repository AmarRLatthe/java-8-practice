package com.amar.functional;

public class TestSquare {

	public static void main(String[] args) {

		InterfSquare square = x -> x * x;

		System.out.println("Square is : " + square.square(10));
	}

}
