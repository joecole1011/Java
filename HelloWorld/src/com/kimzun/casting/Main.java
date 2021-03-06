package com.kimzun.casting;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		OfficeCleaner nam = new OfficeCleaner("Kilaporn", "Nasoke", 500);
		OfficeCleaner ceo = new CEO("Akawit", "Nasoke", 6000000);
		Programmer progKim = new Programmer("Akawit", "Nasoke", 2000000);
		CEO ceo2 = (CEO) ceo;
		// CEO ceo3 = new Employee("Akawit", "Nasoke", 6000000); // Error
		// CEO ceo4 = (CEO) nam; // Error
		ArrayList<OfficeCleaner> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(nam);
		myList.add(progKim);
		CEO ceo3 = (CEO) myList.get(0);
		OfficeCleaner nam2 = myList.get(1);
		Programmer progKim2 = (Programmer) myList.get(2);
		ceo3.hello(); // Hi, nice to meet you. Akawit!
		progKim2.hello(); // Hello Akawit

	}

}
