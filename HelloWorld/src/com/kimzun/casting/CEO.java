package com.kimzun.casting;

public class CEO extends OfficeCleaner {
	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}

	public void work() {
		Seminar();
		Hire();
		Golf();
		Hire();
	}

	private void Golf() {
		

	}

	private void Hire() {
		

	}

	private void Seminar() {
		

	}

	@Override
	public int getSalary() {
		return super.getSalary() * 2;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(OfficeCleaner employee) {
		System.out.println(employee.firstname + "has been fired!");
	}
}
