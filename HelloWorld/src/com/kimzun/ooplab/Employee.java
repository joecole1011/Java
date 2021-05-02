package com.kimzun.ooplab;

import java.util.Iterator;

import com.kimzun.helloWord.HelloWorld;

public class Employee {

	public String firstname;
	public String lastname;
	public String position;
	private int salary;
	
	public static void main(String[] args) {
		//Employee akawit = new Employee("Akawit","Nasoke", 10000,"CEO");
		Employee[] employee = new Employee[3];
		for (int i = 0; i < employee.length; i++) { 
			employee[i] = new Employee("First Name "+ i, "Last Name " + i, 1000 +  i,"Position " +i);
		}
		System.out.println(employee[1].firstname);
		System.out.println(employee[1].lastname);
		System.out.println(employee[1].salary);
		System.out.println(employee[1].position);
	}

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput ) {
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
