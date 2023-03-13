package org.tnsif.superkeyword;

public class Employee_class extends Student_class{
	private String name;

	public String getName() {
		return name;
	}
    public void setName(String name) {
    	this.name=name;
    }
    
	public Employee_class() {
		System.out.println("child class constructor");
	}
	public Employee_class(String name) {
		this.name=name;
	}
	public void display1() {
		System.out.println("employee name:"+name);
		super.setName("pallavi");
		System.out.println(super.getName());
		
//		
		
		
	}
}