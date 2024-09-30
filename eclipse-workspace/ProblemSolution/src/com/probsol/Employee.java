package com.probsol;




public class Employee {
	
private int empid;
private String name;
private int age;
private String gender;
private String role;
private int year;
private double sal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", role=" + role
			+ ", year=" + year + ", sal=" + sal + "]";
}
public Employee(int empid, String name, int age, String gender, String role, int year, double sal) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.role = role;
	this.year = year;
	this.sal = sal;
}
public Employee() {
	super();
}

}
