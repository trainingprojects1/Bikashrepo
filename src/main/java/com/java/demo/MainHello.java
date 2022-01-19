package com.java.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/java/demo/Greetings.xml");
		Hello hello=(Hello)ctx.getBean("beanHello");
		System.out.println(hello.sayHello("BIku"));
	}

}
