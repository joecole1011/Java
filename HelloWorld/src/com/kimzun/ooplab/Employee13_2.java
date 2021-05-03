package com.kimzun.ooplab;

public class Employee13_2 {

	public static String firstname;
	public static String lastname;
	public static String position;
	private int salary;

	public static void main(String[] args) {
		Employee13_2 akawit = new Employee13_2("Akawit", "Nasoke", 10000, "CEO");
		Employee13_2 kilaporn = new Employee13_2("Kilaporn", "Nasoke", 5000, "Gust");
		Employee13_2.test();
		Employee13_2.checkPosition();		
		Employee13_2.getFullName();
	}

	public Employee13_2(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}

	public static void test() {
		System.out.println("This is static method");
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public String getPosition() {
		return position;
	}

	public static void checkPosition() {
		System.out.println("My Position is " + position);
	}

	public static void getFullName() {
		System.out.println("My Name is " + firstname + " " +  lastname);
	}

}