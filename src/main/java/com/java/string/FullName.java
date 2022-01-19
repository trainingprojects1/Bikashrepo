package com.java.string;

public class FullName {
	public String fullName(String firstName, String lastName) {
		String fullName = " My full name is " + firstName.concat(lastName);
		return fullName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullName fn = new FullName();
		String full = fn.fullName("Bikash", "Adhikari");
		System.out.println(full);
	}

}
