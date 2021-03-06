package com.kimzun.ooplab;

public class Day9 {

	public static void main(String[] args) {
		Employee10_3 dang = new Employee10_3("Dang", "Red", 10000);
		System.out.println(dang.firstname); // Dang
		System.out.println(dang.lastname); // Red
		dang.hello(); // Hello Dang
		int salary = dang.getSalary();
		System.out.println(salary); // 10000
		
		/*
		Employee dang = new Employee("Dang","Red", 10000);
		System.out.println(dang.firstname); // Dang
		dang.hello(); // Hello Dang
		Employee marvel = new Employee("Captain","Marvel", 20000);
		System.out.println(marvel.firstname); // Captain
		marvel.hello(); // Hello Captain */
		
		Employee10_3[] employees = new Employee10_3[3];
		for (int i =0; i<employees.length; i++) {
		employees[i] = new Employee10_3("name"+i, "lastname"+i, i * 10000);
		}
		
		System.out.println(employees[1].firstname); // name1
		System.out.println(employees[2].firstname); // name2
		System.out.println(employees[1].getSalary()); // 10000
		System.out.println(employees[2].getSalary()); // 20000
	}
}
