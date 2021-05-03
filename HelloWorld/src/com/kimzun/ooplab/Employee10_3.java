package com.kimzun.ooplab;

public class Employee10_3 {

	public String firstname;
	public String lastname;
	public String position;
	private int salary;

	public static void main(String[] args) {
		// Employee akawit = new Employee("Akawit","Nasoke", 10000,"CEO");

		Employee10_3[] employee = new Employee10_3[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee10_3("First Name " + i, "Last Name " + i, 1000 + i, "Position " + i);
		}
		System.out.println(employee[1].firstname);
		System.out.println(employee[0].lastname);
		System.out.println(employee[2].salary);
		System.out.println(employee[2].position);
	}

	public Employee10_3(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
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

}
