package com.amar.functional;

public class LengthTest {

	public static void main(String[] args) {
		
		InterfLength len = str ->  
			str.length(); 
			
			System.out.println("Length of the string is : " + len.getLength("Amar"));
	}

}
