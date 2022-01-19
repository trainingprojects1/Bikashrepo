package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddEmployMain {
public static void main(String[] args) {
	Employ employ= new Employ();
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter employ no");
	employ.setEmpno(scan.nextInt());
	System.out.println("Enter emloy name");
	employ.setName(scan.next());
	String gen;
	System.out.println("Enter the Gender");
	gen= scan.next().toUpperCase();
	if(gen.equals("MALE"))
	{employ.setGender(Gender.MALE);	
}
	if(gen.equals("FEMALE")) {
		employ.setGender(Gender.FEMALE );
	}
	System.out.println("ENTER department");
	employ.setDept(scan.next());
	System.out.println("Enter designation");
	employ.setDesign(scan.next());
	System.out.println("Enter Basic");  
	employ.setBasic(scan.nextInt());
	
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
	EmployDao dao=(EmployDao)ctx.getBean("emplDao");
	System.out.println(dao.addEmploy(employ));
	
}

}