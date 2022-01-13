package com.java.assignment;

import java.util.Scanner;

public class CharAtIndex {

	public static char returnChar(String s) {
		char[] arr= s.toCharArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the index");
		int id= sc.nextInt();
		char ch= s.charAt(id);
		return ch;
	}

	public static void main(String[] args) {
String s= "BIkashAdhikari";
System.out.println(returnChar(s));
	}

}
