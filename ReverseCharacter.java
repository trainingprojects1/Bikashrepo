package com.java.assignment;

import java.util.Scanner;

public class ReverseCharacter {
	public static String reverseString(String s) {
		char [] word= new char[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
		 System.out.println(s.charAt(i)); 
		}
		return s ;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the world");
		String string = scan.next();
		
		String b =reverseString(string); 
		System.out.println(b);
scan.close();
	}

}
