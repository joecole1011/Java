package com.kimzun.helloWord;

public class JavaPart1 {

	public static void main(String[] args) {
		int a = 20, b = 5;
		String c = "Akawit", d = "Nasoke";

		int Sum = classA(a, b);
		String stringNameLast = classB(c, d);
		int Sum2 = classC(a, b);
		int Sum3 = classD(a, b);

		System.out.println("Int a * b : " + Sum);
		System.out.println("String ++ : " + stringNameLast);
		System.out.println("Int a + b : " + Sum2);
		System.out.println("Int a / b : " + Sum3);

	}

	public static int classA(int n1, int n2) {
		return n1 * n2;
	}

	public static String classB(String n1, String n2) {
		return n1 + " " + n2;
	}

	public static int classC(int n1, int n2) {
		return n1 + n2;
	}

	public static int classD(int n1, int n2) {
		return n1 / n2;
	}

}
