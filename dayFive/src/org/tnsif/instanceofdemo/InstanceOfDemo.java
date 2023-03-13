package org.tnsif.instanceofdemo;

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child("pallavi","Nashik",21);
		Parent p=new Parent("pallavi","pune");
		c.display();
		System.out.println(c instanceof Child);
		System.out.println(c instanceof Parent);
		System.out.println(p instanceof Child);

	}

}
