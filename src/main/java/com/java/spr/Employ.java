 package com.java.spr;

public class Employ {
private int empno;
private String name;
private Gender gender;
private String dept;
private String design;
private int basic;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesign() {
	return design;
}
public void setDesign(String design) {
	this.design = design;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
@Override
public String toString() {
	return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", design=" + design
			+ ", basic=" + basic + "]";
}

}
