package com.kimzun.helloWord;

public class Lab7 {

	public static void main(String[] args) {
		// ข้อ 1 print ค่าตัวเลข 20 โดยเริ่มจากมากไปน้อย
		System.out.println("ข้อ 1");
		int counter = 20;
		do {
			System.out.println("Counter :" + counter);
			counter--;
		} while (counter <= 20 && counter >= 0);

		System.out.println("=================");
		// ข้อ 2 เขียนโปรแกรมตรวจสอบตัวเลข ว่าเป็น จํานวนคู่ หรือจํานวนคี่
		// โดยโปรแกรมจะทํางานในไปเรื่อยๆ ถ้าหากเขายังคงกรอกเลขคู่
		// แต่ถ้ากรอกเลขคี่จะเป็นการออกจากลูป
		System.out.println("ข้อ 2");
		int number = 4;
		do {
			System.out.println("Odd number : " + number);
			//break;
		} while (number % 2 == 0);
	}

}
