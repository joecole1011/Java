package com.kimzun.AbstractEnumFinal;

public abstract class Abstract {
	private String title = "";
	private String decription = "";
	
	public abstract String getfirstname();
	public abstract String getlastname();
	public abstract String getsalary();

	
	public void printTitle() {
		System.out.println(this.title);
	}
	public void printDecription() {
		System.out.println(this.decription);
	}
	
	
}
