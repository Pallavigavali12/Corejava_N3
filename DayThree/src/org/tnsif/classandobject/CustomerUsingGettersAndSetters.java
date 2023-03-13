package org.tnsif.classandobject;

public class CustomerUsingGettersAndSetters {
	private String name;
	private String city;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	
	public CustomerUsingGettersAndSetters() {
		super();
	}



	public void display() {
		System.out.println("name:"+name+" city:"+city);
	}
	

}
