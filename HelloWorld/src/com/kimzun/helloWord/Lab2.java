package com.kimzun.helloWord;


public class Lab2 {
	public static void main(String[] args) {
		//ข้อ 1
		System.out.println("1.");
		bark();
		System.out.println("================");
		//ข้อ 2
		System.out.println("2.");
		float newFloat = 15.8f;
		int newInt = (int) newFloat; //Narrowing
		System.out.println("newFloat value: " + newFloat);
		System.out.println("newInt value: " + newInt); // 5
		
		int myInt = 50;
		float myFloat = myInt;
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: " + myFloat);
		
		double myDouble = 130.50d ;
		float newFloat2 = (float) myDouble; 
		System.out.println("myDouble value: " + myDouble);
		System.out.println("newFloat2 value: " + newFloat2);
		
		char myChar = 100 ;
		int newint2 = (char) myChar; 
		System.out.println("myChar value: " + myChar);
		System.out.println("newint2 value: " + newint2);
		System.out.println("================");
		System.out.println("3.");
		final String finalString = "Hello" ;
		//finalString = "World" ; Assign ค่าใหม แล้ว Error
		
		System.out.println("finalString value: " + finalString);
	}
	public static void bark() {
		String dogName = "TukTuk";
		System.out.println("The Dog name = "+ dogName + " bark");
	}
}
