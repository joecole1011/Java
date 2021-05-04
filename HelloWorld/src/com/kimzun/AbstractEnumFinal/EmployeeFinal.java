package com.kimzun.AbstractEnumFinal;

public class EmployeeFinal extends Abstract {

	final String ceo = "SuperGood";

	public static void main(String[] args) {
		EmployeeFinal emp = new EmployeeFinal();
		// emp.ceo = "Bad" ; เปลี่ยนแปลงไมได้ เพราะกำหนเให้เป็นFinal key แล้ว
	}
	
	public final String getK() {
		// TODO Auto-generated method stub
		return "K";
	} 
	
	@Override
	public String getfirstname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getlastname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getsalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
