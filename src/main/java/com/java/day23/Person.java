package com.java.day23;

public class Person {
private int id;
private String name;
private JobDetails jobdetails;
private Family familydetails;

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
public Family getFamilydetails() {
	return familydetails;
}
public void setFamilydetails(Family familydetails) {
	this.familydetails = familydetails;
}

public void showInfo() {
	System.out.println("Id is"+ id +  "name is" + name);
	System.out.println(jobdetails);
	System.out.println(familydetails);
}
}
