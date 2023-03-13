package org.tnsif.classandobject;

public class Car {
//    public int speed;
//	public void display(int speed) {
//		System.out.println("speed of the class is:"+speed);
//	}
	int carno;
	String carname;
	public Car(int carno,String carname) {
		this.carno=carno;
		this.carname=carname;
	}
	public void display() {
		System.out.println("carno is:"+carno);
		System.out.println("carname is:"+carname);
	}

}
