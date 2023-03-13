package org.tnsif.multilevelinheritance;

public class Employee extends Student{
	private String post;
	private int salary;
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	public Employee(String name,int age,int rollno,String clgName,String department,String post,int salary) {
		super(name,age,rollno,clgName,department);
		this.post=post;
		this.salary=salary;
		
	}
	public void display2() {
		super.display1();
		System.out.println("Person post:"+post);
		System.out.println("Person salary:"+salary);
		
		
	}
	
	
	

}
