package com.java.demo;

public class HelloImpl implements Hello {

	
	private String greetings;
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return greetings + name ;
	}
	

}
