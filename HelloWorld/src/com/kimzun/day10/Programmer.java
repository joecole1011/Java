package com.kimzun.day10;

public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		getSalary();
	}

	public void fixPC(String serialNumber) {
		System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
		
	}

	public void createWebsite(String template, String titelName) {

	}

	public void installWindows(String version, String productKey) {

	}
	
	@Override
    public int getSalary() {
        return super.getSalary() * 10;
    }
}