package org.tnsif.multilevelinheritance;

public class Student extends Person {
	private int rollno;
	private String clgName;
	private String department;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student() {
		super();
	}
	public Student(String name,int age,int rollno,String clgName,String department) {
		super(name,age);
		this.rollno=rollno;
		this.clgName=clgName;
		this.department=department;
	}
	public void display1() {
		super.display();
		System.out.println("Person rollno:"+rollno);
		System.out.println("Person clgname:"+clgName);
		System.out.println("Person department:"+department);
		
	}
	

}
