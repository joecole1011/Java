package com.kimzun.day10_1;

public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		
	}

	public void fixPC(String serialNumber) {
		System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
		getSalary();
	}

	public void createWebsite(String template, String titelName) {

	}

	public void installWindows(String version, String productKey) {

	}
}