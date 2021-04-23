package com.kimzun.helloWord;

public class Lab6 {

	public static void main(String[] args) {
		// ข้อ 1
		System.out.println("ข้อ 1");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Counter :" + i);
		}
		System.out.println("=================");

		// ข้อ 2 สร้างโปรแกรมหาผลรวมของตัวเลข 1 ถึง 10
		System.out.println("ข้อ 2");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println("Sum 1-10 : " + sum);
		System.out.println("=================");

		// ข้อ 3 สร้างโปรแกรมหาค่าระหว่าง 1-100 ที่หาร 12 ลงตัว
		System.out.println("ข้อ 3");
		for (int i = 1; i <= 100; i++) {
			if (i % 12 == 0) {
				System.out.println("จำนวนที่หารด้วย 12 ลงตัวคือ : " + i);
			}
		}
		System.out.println("=================");
		
		// ข้อ 3 ให้ประกาศ array ที่มีค่า [1,2,3,4,5] แล้วใช้ foreach ในการวน loop แล้ว print ค่าออกมาทั้งหมด
		int cArray[] = {1,2,3,4,5};
		for(int counter : cArray ) {
			System.out.println("Counter :"+ counter);
			
		}

	}
}
