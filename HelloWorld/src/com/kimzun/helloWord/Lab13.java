package com.kimzun.helloWord;

public class Lab13 {

	public static void main(String[] args) {
		System.out.println("ข้อ 1");
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int[] row : twoD_Array) {
			for (int element : row) {
				System.out.println(element);
			}
		}
		System.out.println("=======");
		System.out.println("ข้อ 2");
		int sum = 0;
		for (int[] row : twoD_Array) {
			for (int element : row) {
				//sum = twoD_Array[0][2] + twoD_Array[1][3] + twoD_Array[2][1]; คิดไม่ออก	
				sum = twoD_Array[0][2] + twoD_Array[1][3] + twoD_Array[2][1]; // คิดไม่ออก	
				//sum += twoD_Array[0].length; //คิดไม่ออก	
				//sum += twoD_Array.length; //คิดไม่ออก	
			}
		}
		System.out.println("Sum = " + sum);
		System.out.println("=======");
		/*
		System.out.println("Number of row: " + twoD_Array.length);
		System.out.println("Number of column: " + twoD_Array[0].length);
		System.out.println("=======");
		int[][] a = new int[3][4];
		System.out.println("Number of row: " + a.length);
		System.out.println("Number of column: " + a[0].length);
		*/
		}
}
