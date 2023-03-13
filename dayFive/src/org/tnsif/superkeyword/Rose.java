package org.tnsif.superkeyword;

public class Rose extends Flower {
	String color;
	
	
	public Rose(String name,String color) {
		super(name);
		this.color=color;
	}
	
	public void display1() {
				System.out.println("color:"+color);
	}
	
	public void display() {
		
//		called parent class method
		super.display();
		System.out.println("color:"+color);
	}

}
