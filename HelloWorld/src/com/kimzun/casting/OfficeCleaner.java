package com.kimzun.casting;

public class OfficeCleaner {
	public String firstname;
	public String lastname;
	private int salary;

	public OfficeCleaner(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}

	public void work() {
		Clean();
		KillCoachroach();
		DecorateRoom();
		WelcomeGuest();
	}

	private void WelcomeGuest() {
		

	}

	private void DecorateRoom() {
		

	}

	private void KillCoachroach() {
		

	}

	private void Clean() {
		

	}

	public void setSalary(int newSalary) {

	}

	public int getSalary() {
		return salary;
	}

	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
}
