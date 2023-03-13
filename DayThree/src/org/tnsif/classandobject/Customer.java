package org.tnsif.classandobject;

public class Customer {
	private int id;
	private String name;
	private int age;
	private String city;
	
	public Customer(int id,String name,int age,String city) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	public void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("city:"+city);
	}

}
