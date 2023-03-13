package org.tnsif.instanceofdemo;

public class Parent {
	private String name;
	private String address;
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress(String address) {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public Parent() {
		System.out.println("parent class constructor called");
	}
	public Parent(String name,String address) {
		this.name=name;
		this.address=address;
	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", address=" + address + "]";
//	}
	
	public void display1() {
		System.out.println("name is:"+name);
		System.out.println("address is:"+address);
	}
	

}
