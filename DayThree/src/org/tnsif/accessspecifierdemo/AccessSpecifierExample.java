package org.tnsif.accessspecifierdemo;

public class AccessSpecifierExample {
	public String name;
	private int age;
	String Department;
	public void display() {
		System.out.println("name:"+name);
	
	}
	public void displayage() {
		System.out.println("age:"+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displaydepartment() {
		System.out.println("department is:"+Department);
	}
	
	

}
