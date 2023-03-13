package org.tnsif.superkeyword;

public class Student_class {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Student_class() {
		System.out.println("parent class constructor");
	}
	public Student_class(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("name of student:"+name);
	}

}
