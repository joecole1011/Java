package com.kimzun.helloWord;

public class Lab12 {

	public static void main(String[] args) {

		/*
		 * 1. ทดลองเปรียบเทียบ String 2 String ว่าเป็นค่าเดียวกันหรือไม่ 2.
		 * ใช้คําสั่งค้นหาคําใน String และแสดงคําที่ค้นหาบนหน้าจอ 3.
		 * ใช้คําสั่งหาความยาวของ String นั้น และแสดงค่าความยาว String 4.
		 * ใช้คําสั่งตัดข้อความหรือตัด String ตําแหน่งที่ 1-4 ออก 5.
		 * ใช้คําสั่งตัดช่องว่างของประโยค 6. ใช้คําสั่งเปลี่ยน String
		 * เป็นพิมพ์ใหญ่ทั้งหมด 7. ใช้คําสั่งเปลี่ยน String2 เป็น พิมพ์ใหญ่ทั้งหมด
		 * และไม่มีช่องว่างซ้ายขวา ด้วยการเขียน code แค่บรรทัดเดียว (ใช้ Chaining
		 * นั่นเอง)
		 */

		String String1 = "You and Me";
		String String2 = " you and me ";

		// ข้อ 1
		System.out.println("ข้อ 1");
		if (String1.equals(String2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		System.out.println("=========");

		// ข้อ 2
		System.out.println("ข้อ 2");
		String answer2 = "You";
		if (String1.contains(answer2))
			System.out.println("True");
		else
			System.out.println("Fail");
		System.out.println("=========");

		// ข้อ 3
		System.out.println("ข้อ 3");
		System.out.println("String1 length : " + String1.length());
		System.out.println("String2 length : " + String2.length());
		System.out.println("=========");

		// ข้อ 4
		System.out.println("ข้อ 4");
		System.out.println(String1.substring(0, 5));
		System.out.println(String2.substring(0, 5));
		System.out.println("=========");

		// ข้อ 5
		System.out.println("ข้อ 5");
		System.out.println(String2.trim());
		System.out.println("=========");

		// ข้้อ 6
		System.out.println("ข้อ 6");
		System.out.println(String1.toUpperCase());
		System.out.println(String2.toUpperCase());
		System.out.println("=========");

		// ข้้อ 6
		System.out.println("ข้อ 7");
		System.out.println(String2.toUpperCase().trim());
	}

}
