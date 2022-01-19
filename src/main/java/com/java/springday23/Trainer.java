package com.java.springday23;

import java.util.List;

public class Trainer {
private String trainerName;
private String Location;
List<Student>studentList;
public String getTrainerName() {
	return trainerName;
}
public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public List<Student> getStudentList() {
	return studentList;
}
public void setStudentList(List<Student> studentList) {
	this.studentList = studentList;
}

public void showInfo() {
	System.out.println("Trainers name" + trainerName);
	System.out.println(("Trainers Location"+ Location));
	System.out.println("Student");
	 for (Student student : studentList) {
	System.out.println(student);
		
	}
	
	
}
}
