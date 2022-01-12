package com.java.assignment;

import java.util.Scanner;

public class DuplicateCharacter {
	public static  char duplicateChar(char[] ch) {
		int count;
		char k = 0;
		System.out.println("Here are the duplicate characters");
		for (int i = 0; i < ch.length; i++) {
			count=1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]&& ch[i] !=' '){
					count ++;
					ch[j]=0;
				}
			}
			
			
			if(count>1  && ch[i] !=0){
				 k=ch[i];
			
			}
		}
		return k;
	}

	public static void main(String[] args) {
		
	
Scanner scan= new Scanner(System.in);
System.out.println("Enter a Word");
String word= scan.next();
char[] ch=word.toCharArray();
char dublicate= duplicateChar(ch);
System.out.println(dublicate);
scan.close();

	}

}
	
