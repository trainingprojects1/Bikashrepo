package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListEmploy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
EmployDao dao= (EmployDao)ctx.getBean("emplDao");
Employ[] arrEmploy= dao.showEmploy();
for (Employ employ : arrEmploy) {
	System.out.println(employ);
}
	}

}
