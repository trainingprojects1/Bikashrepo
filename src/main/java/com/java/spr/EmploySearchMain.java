package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmploySearchMain {

	public static void main(String[] args) {
int empno;
Scanner scan= new Scanner(System.in);
System.out.println("Enter the empno");
empno= scan.nextInt();

ApplicationContext context= new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
EmployDao emp= (EmployDao)context.getBean("emplDao");
System.out.println(emp.searchEmploy(empno));
	}

}
