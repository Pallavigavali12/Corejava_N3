package org.tnsif.multilevelinheritance;

public class Person {
	private String name;
	private int age;
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
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Person() {
		System.out.println("Person default Constructor is used");
	}
	public void display() {
		System.out.println("Person name:"+name);
		System.out.println("Person age:"+age);
		
	}

}
