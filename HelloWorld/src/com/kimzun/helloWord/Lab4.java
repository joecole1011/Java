package com.kimzun.helloWord;

public class Lab4 {

	public static void main(String[] args) {
		boolean isHandSome = true; //ข้อ 2
		int score = 50;
		if (isHandSome == true) {
			if (score < 50) {
				// System.out.println("fail"); ข้อ 1
				System.out.println("Good"); //ข้อ 2
			} else if (score >= 50 && score < 80) {
				// System.out.println("normal"); ข้อ 1
				System.out.println("Good"); //ข้อ 2
			} else if (score >= 80) {
				System.out.println("Good");
			}
		}
	}
}
