package com.kimzun.casting;

public class PrimativeConversion {

	public static void main(String[] args) {

		int newInt = 20;
		float newFloat = newInt; // Widening
		System.out.println("NewInt Value: " + newInt);
		System.out.println("NewFloat Value: " + newFloat);
		System.out.println("=================");

		float myFloat = 19.9f;
		int myInt = (int) myFloat; // Narrowing
		System.out.println("MyFloat Value: " + myFloat);
		System.out.println("MyInt Value: " + myInt);
		System.out.println("=================");

		int myNewInt = 2000;
		byte myNewByte = (byte) myNewInt; // Overflow
		System.out.println("MyNewInt value: " + myNewInt);
		System.out.println("MyNewByte value: " + myNewByte);

	}
}
