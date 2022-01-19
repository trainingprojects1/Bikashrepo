package com.java.string;

public class CapitalLetter {
	public  String  showUpperCase(String name) {
		String upperCase = name.toUpperCase();
		return upperCase;
	}

	public static void main(String[] args) {

		String name = "hello";
		CapitalLetter upper = new CapitalLetter();
		String nam= upper.showUpperCase(name);
		System.out.println(nam);

	}

}
