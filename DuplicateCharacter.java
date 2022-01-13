package com.java.assignment;

import java.util.Scanner;

public class DuplicateCharacter {
	public static String duplicateChar(String word) {
		int count;
		String k="";
		System.out.println("Here are the duplicate characters");
		char[] ch = word.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = 0;
				}
			}

			if (count > 1 && ch[i] != 0) {
				k= k+(ch[i]);

			}
		}
		return k;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Word");
		String word = scan.next();
		System.out.println(duplicateChar(word));
		scan.close();

	}

}
