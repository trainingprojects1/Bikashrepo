package com.java.springday23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("com/java/springday23/Student.xml");
Trainer obj=(Trainer)context.getBean("beanTrainer");
obj.showInfo();
	}

}
