package com.java.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int id;
	private String name;
	@Autowired
	private JobDetails jobdetails;
	private Family family;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JobDetails getJobdetails() {
		return jobdetails;
	}
	public void setJobdetails(JobDetails jobdetails) {
		this.jobdetails = jobdetails;
	}
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family family) {
		this.family = family;
	}
	public String showInfo() {
		return "Person [id=" + id + ", name=" + name + ", jobdetails=" + jobdetails + ", family=" + family + "]";
	}
	

}
