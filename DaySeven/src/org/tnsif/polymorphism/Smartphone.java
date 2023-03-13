package org.tnsif.polymorphism;
//to demonstrate on function overloading
public class Smartphone {
//	method overloading in terms of passing diff no of arguments
	private int resolution;
	private String slottype;
	
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public void display(int resolution) {
		System.out.println("camera resolution:"+resolution);
	}
    public void display(int resolution,String slottype) {
    	System.out.println("camera resolution:"+resolution);
    	System.out.println("slottype:"+slottype);
	}

}
