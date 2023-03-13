package org.tnsif.polymorphism;

public class Hondacity {
	private int speed;
	private String color;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Hondacity() {
		System.out.println("I like to drive Hondacity");
	}
	public Hondacity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("spped: "+speed);
		System.out.println("color: "+color);
	}
	
	

}
