package org.tnsif.instanceofdemo;

public class Child extends Parent {
	private int age;
	
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public Child(String name,String address,int age) {
		super(name,address);
		this.age=age;
	}
	public void display(){
		super.display1();
		System.out.println("age is:"+age);
	}
	
	
	

}
