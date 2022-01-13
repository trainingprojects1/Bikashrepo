package com.java.assignment;

import java.util.Scanner;

public class ReverseCharacter {
	public static String reverseString(String s) {
		
		String rev="";
		int len= s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
		 rev=rev+s.charAt(i); 
		}
		return rev ;
		
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
