package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteEmployMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int empno;
Scanner scan= new Scanner(System.in);
System.out.println("Enter Employ no ");
empno=scan.nextInt();

ApplicationContext ctx= new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
EmployDao dao= (EmployDao)ctx.getBean("emplDao");
System.out.println(dao.delteEmploy(empno));
	}

}
