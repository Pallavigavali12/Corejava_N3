package org.tnsif.encapsulationdemo;

public class Hdfc {
	private int pin;
	
	void accept() {
		System.out.println("pin is:"+pin);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
