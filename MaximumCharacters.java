package com.java.assignment;

import java.util.Scanner;

public class MaximumCharacters {
	public static  int  maxNum(String word) {
		return word.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the word");
String word= sc.next();
//String hello= maxNum(word);
System.out.println(maxNum(word));

	}

}
