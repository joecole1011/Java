package com.kimzun.AbstractEnumFinal;

public class Enum {
	enum Status {
		GOOD, BAD, STILL, SLLP
	}

	public static void main(String[] args) {
		Status myStatus = Status.GOOD;
		switch (myStatus) {
		case GOOD:
			System.out.println("เขียนโปรแกรมดีกว่า สมองกำลังแล่น ลุย!!!");
			break;
		case BAD:
			System.out.println("เรียนไม่เข้าใจ งงไปหมดแล้ว");
			System.out.println("Error เต็มเลย");
			System.out.println("Run ไม่ผ่าน");
			System.out.println("โปรแกรมไม่ Error แต่ทำไม ผลลัพธ์ ไม่เป็นอย่างที่คิด????");
			break;
		case STILL:
			System.out.println("ไม่ไหวแล้วไปนอนละบายยย");
			break;
		case SLLP:
			System.out.println("ง่วงแล้ว เขียนโปรแกรมมาทั้งวัน นอนดีกว่า ZzZzZ");
			break;
		}
	}
}
