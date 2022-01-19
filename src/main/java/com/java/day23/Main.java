package com.java.day23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/java/day23/Person.xml");
		Person obj = (Person) ct.getBean("Biku");
		obj.showInfo();

		Person ob1 = (Person) ct.getBean("Tiku");
		ob1.showInfo();
	}

}
