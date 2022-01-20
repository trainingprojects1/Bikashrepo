package com.java.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("com/java/autowire/Person1.xml");
Person dao= (Person)context.getBean("person");
System.out.println(dao.showInfo());
	}

}
  