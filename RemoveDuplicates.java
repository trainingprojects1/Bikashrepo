package com.java.assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static String remDup(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeat = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeat = true;
					break;
				}

			}

			if (!repeat) {
				sb.append(arr[i]);

			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the word");
		String s = sc.next();
		System.out.println(remDup(s));
	}
}

//		Set<Character> set = new HashSet<>();
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < s.length(); i++) {
//
//			Character c = s.charAt(i);
//			if (!set.contains(c)) {
//				set.add(c);
//				sb.append(c);
//			}
//
//		}
//		return sb.toString();
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the word");
//		String string = sc.next();
//		System.out.println(remDup(string));
//
//	}
